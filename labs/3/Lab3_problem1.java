/**
 * File : Lab3_problem1.java
 * Assignment : Lab 3, Problem 5.1
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 21, 2017
 * Version: 2.0
 *
 * This file determines the number of positive values, negative values, the total, and average of a group of numbers
 */
 
 import java.util.Scanner;
 
public class Lab3_problem1{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter an integer, the input ends if it is 0: ");
    String userinput = input.nextLine();
  
    int stringposition = 0;
    double total = 0;
    int integerinput = 0;
    int positiveintegers = 0;
    int negativeintegers = 0;
    double counter = 0;
    String temp = "temp";

  

    if("0".equals(userinput)){
      System.out.println("No numbers are entered except 0.");
    }
    
    else{
      do {
        temp = Character.toString(userinput.charAt(stringposition));
        //Detects if the number is negative or positive
        if(userinput.charAt(stringposition) == '-'){
          temp = Character.toString(userinput.charAt(stringposition + 1));
          integerinput = Integer.parseInt(temp);
          integerinput = -1 * integerinput;
          total += integerinput;
      
          negativeintegers++;
          counter++;
        }
    
        else if(Character.isDigit(userinput.charAt(stringposition)) && !"0".equals(temp)){
          if(stringposition != 0){
            temp = Character.toString(userinput.charAt(stringposition - 1));
            //Detects if a negative sign is before the number to avoid double counting the number
          }
          if(!"-".equals(temp)){
            temp = Character.toString(userinput.charAt(stringposition));
            integerinput = Integer.parseInt(temp);
            total += integerinput;
    
            positiveintegers++;
            counter++;
          }
        }
    
        else if(Character.isLetter(userinput.charAt(stringposition))){
          System.out.println("You have entered an invalid input.");
          System.exit(0);
        }
        stringposition++;
      } while (!"0".equals(temp));
  
    System.out.println("The number of positives is " +positiveintegers);
    System.out.println("The number of negatives is " +negativeintegers);
    System.out.println("The total is " +total);
  
    total = total / 1.0;
    double average = (total / (counter));
  
    System.out.println("The average is " +average);
    }
  }
}
  
  