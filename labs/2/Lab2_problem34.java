/**
 * File : Lab2_problem34.java
 * Assignment : Lab 2, Problem 3.4
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 *
 * This file generates a random number between 1 and 12 and prints the number and name of the corresponding month.
 */
 
public class Lab2_problem34{
  public static void main(String[] args) {
    int month = (int)(Math.random()*12 +1);
	
	  if (month == 1){
	    System.out.println("The "  +month +"st month is January.");
	  }
	  else if (month == 2){
	    System.out.println("The "  +month +"nd month is February.");
	  }
	  else if (month == 3){
	    System.out.println("The "  +month +"rd month is March.");
	  }
	  else if (month == 4){
	    System.out.println("The "  +month +"th month is April.");
	  }
	  else if (month == 5){
	    System.out.println("The "  +month +"th month is May.");
	  }
	  else if (month == 6){
	    System.out.println("The "  +month +"th month is June.");
	  }
	  else if (month == 7){
	    System.out.println("The "  +month +"th month is July.");
	  }
	  else if (month == 8){
	    System.out.println("The "  +month +"th month is August.");
  	}
	  else if (month == 9){
	    System.out.println("The "  +month +"th month is September.");
	  }
	  else if (month == 10){
	    System.out.println("The "  +month +"th month is October.");
	  }
	  else if (month == 11){
	    System.out.println("The " +month +"th month is November.");
	  }
	  else if (month == 12){
	    System.out.println("The " +month +"th month is December.");
	  }
  }
}
	