/**
 * File : Driver_prj2.java
 * Assignment : Project 2
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : May
 * Version : 1.0
 *
 * My project is a budget management system that allows the user input income and expenses to calculate a total budget.
 * The program also can find the change in income, expenses, and total between 2 chosen months.
 * In addition the program can display the current income and expenses, clear the data, and list all valid commands.
 */

//to run java -cp (Location of the postgresql jarfile); budgetmanager

import java.util.Scanner;
import java.sql.*;

public class budgetmanager {
  public static void main(String args[]) {
    //Connects to the database and opens the initial connection
    Connection c = null;
    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    System.out.println("Opened database successfully");
    budget_manager();
  }

  public static void budget_manager(){
    Scanner input = new Scanner(System.in);
    System.out.println("");
    System.out.print("Welcome to the Budget Management System! Please enter the monthID (As an integer): ");
    String monthID = input.nextLine();

    boolean check = false;
    //This checks if the monthID is an integer or not.
    int checker=0;
    while(!check){
      try{
        checker = Integer.parseInt(monthID);
        check = true;
      }
      catch(NumberFormatException e){
        System.out.print("Invalid input. Please enter the monthID as an integer.");
        System.out.println("");
        budget_manager();
      }
    }
    check = false;
    System.out.println("Press Enter to continue...");
    createID(checker);
    input.nextLine();
    System.out.print("Please enter a valid command (commands are case sensitive and type 'help' for a list of valid commands): ");
    String userinput = input.nextLine();


    if (userinput.equals("insertIncome")){
      System.out.print("Please enter your income for this month: ");
      //The while loops check for valid inputs. If it is an invalid input, the user is told the proper input
      // And has to enter the monthID again.
      while(!check){
      try{
          double income = input.nextDouble();
          if(income < 0){
            System.out.print("Invalid input, income cannot be negative! Please enter a valid input: ");
          }
          else{
          insertIncome(income, checker);
          check = true;
          budget_manager();
          }
        }
        catch(Exception e){
          System.out.println("That is not a valid input (income is a double value).");
          budget_manager();
        }
      }
    }
    else if(userinput.equals("currentIncome")){
      currentIncome(checker);
      budget_manager();
    }
    else if(userinput.equals("insertExpense")){
      System.out.print("Please enter your expense total for this month (Include all expenses for increased accuracy including rent, leisure, food, etc. if applicable: ");
      //The while loops check for valid inputs. If it is an invalid input, the user is told the proper input
      // And has to enter the monthID again.
      while(!check){
        try{
          double expense = input.nextDouble();
          if(expense < 0){
            System.out.print("That is an invalid input, expense cannot be negative! Please enter a valid input: ");
          }
          else{
            insertExpense(expense, checker);
            check = true;
            budget_manager();
          }
        }
        catch(Exception e){
          System.out.println("That is an invalid input (expense is a double value).");
          budget_manager();
        }
      }
    }
    else if(userinput.equals("currentExpense")){
      currentExpense(checker);
      budget_manager();
    }
    else if(userinput.equals("getBudget")){
      getBudget(checker);
      budget_manager();
    }
    else if(userinput.equals("getChange")){
      System.out.print("Please enter the first monthID: ");
      //The while loops check for valid inputs. If it is an invalid input, the user is told the proper input
      // And has to enter the monthID again.
      while(!check){
        try{
          int monthID1 = input.nextInt();
          System.out.print("Please enter the second monthID: ");
          int monthID2 = input.nextInt();
          getChange(monthID1, monthID2);
          check = true;
          budget_manager();
        }
        catch(Exception e){
          System.out.print("Invalid input (monthID is an integer value).");
          System.out.println("");
          budget_manager();
        }
      }
    }
    else if(userinput.equals("changeID")){
      budget_manager();
    }
    else if(userinput.equals("clearData")){
      System.out.print("Are you sure you want to erase your data? Type 'Y' to confirm, type anything else to cancel.");
      userinput = input.nextLine();
      if(userinput.equals("Y")){
        clearData();
      }
      else{
        budget_manager();
      }
    }
    else if(userinput.equals("help")){
      //Lists all of the commands.
      System.out.println("Valid commands (all are case sensitive): ");
      System.out.println("insertIncome: Enter the monthly income into the database as a double value.");
      System.out.println("currentIncome: Displays the current income for the selected monthID (if no income has been inserted, default value is 0).");
      System.out.println("insertExpense: Enter the monthly expenses into the database as a double value.");
      System.out.println("currentExpense: Displays the current expense total for the selected monthID (if no expense has been inserted, default value is 0).");
      System.out.println("getBudget: Calculates the how much money is left over for the month using the inserted Income and Expenses.");
      System.out.println("getChange: Calculates the change in total, income, and expenses between two selected monthIDs. Calculations assume the first monthID is the earlier month.");
      System.out.println("changeID: Enter a different monthID as an integer.");
      System.out.println("clearData: Reset all data.");
      System.out.println("help: List all commands.");
      budget_manager();
    }
    else{
      System.out.println("That is not a valid command. Type 'help' for all commands.");
      budget_manager();
    }
  }

  public static void createID(int monthID){
    //This method allows the update commands to always be used, even if it is the user's first time selecting this monthID.
    Statement stmt = null;
    Connection c = null;
    int counter = 0;
    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    
    //Selects all the monthIDs from the table to determine if a month with the entered id has already been created.
    try{
      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT monthid FROM budgetdata;");
      while(rs.next() ){
        int id = rs.getInt("monthid");
        if(id == monthID){
          counter++;
        }
      }
      rs.close();
      stmt.close();
      //If the monthID has not been previously created, a row with 0 values is inserted for that ID.
      if(counter == 0){
        stmt = c.createStatement();
        String sql = "INSERT INTO budgetdata (monthid, income, expense, total) VALUES ("+monthID+",0.0,0.0,0.0);";
        stmt.executeUpdate(sql);
        stmt.close();
      }
    }
    catch (Exception e) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }

  }

  public static void insertIncome(double income, int monthID){
    Statement stmt = null;
    Connection c = null;
    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    //Updates the value on the budgetdata table 
    try{
      stmt = c.createStatement();
      String sql = "UPDATE budgetdata set income = "+ income +" where monthid = " +monthID+";";
      stmt.executeUpdate(sql);
      stmt.close();
    }
    catch (Exception e) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }
    System.out.println("Income successfully updated!");
  }

  public static void currentIncome(int monthID){
    Statement stmt = null;
    Connection c = null;
    double incometable=0;
    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    //Uses the select command to get the income then prints it
    try{
      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT income FROM budgetdata where monthid="+monthID+";");
      while(rs.next()){
        incometable = rs.getDouble("income");
      }
    
      System.out.println("The current income for month "+monthID+" is "+incometable+".");
    }
    catch (Exception e) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }
  }

  public static void insertExpense(double expense, int monthID){
    Statement stmt = null;
    Connection c = null;
    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    try{
      stmt = c.createStatement();
      String sql = "UPDATE budgetdata set expense = "+ expense +" where monthid = " +monthID+";";
      stmt.executeUpdate(sql);
      stmt.close();
    }
    catch (Exception e) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }
    System.out.println("Expense successfully updated!");
  }

  public static void currentExpense(int monthID){
    Statement stmt = null;
    Connection c = null;
    double expensetable=0;
    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    try{
      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT expense FROM budgetdata where monthid="+monthID+";");
      while(rs.next()){
        expensetable = rs.getDouble("expense");
      }
    
      System.out.println("The current expense total for month "+monthID+" is "+expensetable+".");
    }
    catch (Exception e) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }
  }

  public static void getBudget(int monthID){
    Statement stmt = null;
    Connection c = null;
    double expensetable=0;
    double incometable=0;
    double total=0;

    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }

    try{
      stmt = c.createStatement();

      ResultSet rs = stmt.executeQuery( "SELECT expense FROM budgetdata where monthid="+monthID+";");
      //Uses select to get the income and expense from the table
      while(rs.next()){
        expensetable = rs.getDouble("expense");
      }
      rs = stmt.executeQuery( "SELECT income FROM budgetdata where monthid="+monthID+";");
      while(rs.next()){
        incometable = rs.getDouble("income");
      }
      // Calculates the total
      total = incometable - expensetable;
      
      String sql = "UPDATE budgetdata set total = "+ total +" where monthid = " +monthID+";";
      stmt.executeUpdate(sql);
      
      System.out.println("The current total for month "+monthID+" is "+total+".");
      //Prints overbudget or underbudget depending if the total is greater than 0 or not
      if(total >= 0){
        System.out.println("You are currently within your budget!");
      }
      else if(total < 0){
        System.out.println("You are over your budget for this month.");
      }
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
  }

  public static void getChange(int monthID1, int monthID2){
    Statement stmt = null;
    Connection c = null;
    double expensetable1=0;
    double incometable1=0;
    double total1=0;
    double expensetable2=0;
    double incometable2=0;
    double total2=0;

    try{
      c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
  
    try{
      stmt = c.createStatement();
      //Uses select to get the total, income, and expense from both monthIDs
      ResultSet rs = stmt.executeQuery( "SELECT total FROM budgetdata where monthid="+monthID1+";");
      while(rs.next()){
        total1 = rs.getDouble("total");
      }
      rs = stmt.executeQuery( "SELECT total FROM budgetdata where monthid="+monthID2+";");
      while(rs.next()){
        total2 = rs.getDouble("total");
      }
  
      rs = stmt.executeQuery( "SELECT expense FROM budgetdata where monthid="+monthID1+";");
      while(rs.next()){
        expensetable1 = rs.getDouble("expense");
      }
      rs = stmt.executeQuery( "SELECT expense FROM budgetdata where monthid="+monthID2+";");
      while(rs.next()){
        expensetable2 = rs.getDouble("expense");
      }

      rs = stmt.executeQuery( "SELECT income FROM budgetdata where monthid="+monthID1+";");
      while(rs.next()){
        incometable1 = rs.getDouble("income");
      }
      rs = stmt.executeQuery( "SELECT income FROM budgetdata where monthid="+monthID2+";");
      while(rs.next()){
        incometable2 = rs.getDouble("income");
      }

      System.out.println("Your total difference between month "+monthID1+" and month "+monthID2+" is "+(total2-total1)+".");
      //Determines if each variable increases by calculating the difference and seeing if it greater than 0
      // The code assumes monthID 1 is the earlier month.
      if((total1-total2) < 0){
        System.out.println("Your total has increased from month "+monthID1+".");
      }
      else if((total2-total1) < 0){
        System.out.println("Your total has decreased from month "+monthID1+".");
      }
      else{
        System.out.println("Your total is the same for both months.");
      }

      System.out.println("Your difference in income between month "+monthID1+" and month "+monthID2+" is "+(incometable2-incometable1)+".");
      
      if((incometable1-incometable2) < 0){
        System.out.println("Your income has increased from month "+monthID1+".");
      }
      else if((incometable2-incometable1) < 0){
        System.out.println("Your income has decreased from month "+monthID1+".");
      }
      else{
        System.out.println("Your income is the same for both months.");
      }

      System.out.println("Your difference in expenses between month "+monthID1+" and month "+monthID2+" is "+(expensetable2-expensetable1)+".");
      
      if((expensetable1-expensetable2) < 0){
        System.out.println("Your expenses have increased from month "+monthID1+".");
      }
      else if((expensetable2-expensetable1) < 0){
        System.out.println("Your expenses have decreased from month "+monthID1+".");
      }
      else{
        System.out.println("Your expenses are the same for both months.");
      }



    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
  }

  public static void clearData(){
    Connection c = null;
  
    try{
    c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/postgres",
                     "postgres", "strmsong");
    }
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": "+e.getMessage());
      System.exit(0);
    }
    //Uses  the Truncate command to erase the table, which is created again when trying to create a monthID after reset.
    try{
      Statement stmt = c.createStatement();
      String sql = "TRUNCATE budgetdata;";
      stmt.executeUpdate(sql);
      stmt.close();
    }
    catch (Exception e) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }
    System.out.println("Data reset.");
    budget_manager();
  }
}