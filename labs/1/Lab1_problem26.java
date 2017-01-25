/**
 * File : Lab1_problem26.java
 * Assignment : Lab 1, Problem 2.6
 * Author : Alex Smith
 * Course : CMPT220
 * Date : January 24, 2017
 */
 
import java.util.Scanner;
 
public class Lab1_problem26{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 0 and 1000: ");
	int inputnumber = input.nextInt();
	
	if (inputnumber > 0 && inputnumber < 1000){
	
	  int firstnumber = inputnumber % 10;
	  inputnumber = inputnumber / 10;
	
	  int secondnumber = inputnumber % 10;
	  int thirdnumber = inputnumber / 10;
	
	  int sumofdigits = firstnumber + secondnumber + thirdnumber;
	
	  System.out.println("The sum of the digits is " + sumofdigits + ".");
	}
	else {
	  System.out.println("That is an invalid input.");
	}
  }
}
	
	
	