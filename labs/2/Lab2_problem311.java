/**
 * File : Lab2_problem311.java
 * Assignment : Lab 2, Problem 3.11
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 */
 
 import java.util.Scanner;
 
public class Lab2_problem311{
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	
	  System.out.print("Enter a month as an integer (for example, 1 is January, 2 is February,...,12 is December):");
	  int month = input.nextInt();
	
	  System.out.print("Enter a year as an integer:");
	  int year = input.nextInt();
	
	  if(year < 0){
	    System.out.println("That is an invalid year.");
	    System.exit(1);
	  }
	
	  switch(month){
	    case 0:System.out.println("That is an invalid month."); break;
	  
	    case 1:System.out.println("January "+year+" has 31 days."); break;
	  
	    case 2:if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
		         System.out.println("February "+year+" has 29 days.");
	           }
			       else{
			         System.out.println("February "+year+" has 28 days.");
			       }
			       break;
	    case 3:System.out.println("March "+year+" has 31 days."); break;
	    case 4:System.out.println("April "+year+" has 30 days."); break;
	    case 5:System.out.println("May "+year+" has 31 days."); break;
	    case 6:System.out.println("June "+year+" has 30 days."); break;
	    case 7:System.out.println("July "+year+" has 31 days."); break;
	    case 8:System.out.println("August "+year+" has 31 days."); break;
	    case 9:System.out.println("September "+year+" has 30 days."); break;
	    case 10:System.out.println("October "+year+" has 31 days."); break;
	    case 11:System.out.println("November "+year+" has 30 days."); break;
	    case 12:System.out.println("December "+year+" has 31 days."); break;
	    default:System.out.println("That is an invalid month"); break;
	  }
  }
}
	
	