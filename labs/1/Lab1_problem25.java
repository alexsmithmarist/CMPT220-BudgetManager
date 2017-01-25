/**
 * File : Lab1_problem25.java
 * Assignment : Lab 1, Problem 2.5
 * Author : Alex Smith
 * Course : CMPT220
 * Date : January 24, 2017
 */
 
import java.util.Scanner;
 
public class Lab1_problem25{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and a gratuity rate: ");
	double subtotal = input.nextDouble();
	double gratuitypercent = input.nextDouble();
	
	double gratuityrate = gratuitypercent * .01;
	double gratuity = gratuityrate * subtotal;
	double total = gratuity + subtotal;
	
	System.out.println("The gratuity is $" + gratuity + " and total is $" + total + ".");
  }
}
	