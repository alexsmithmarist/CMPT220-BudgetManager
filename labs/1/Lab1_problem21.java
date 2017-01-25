/**
 * File : Lab1_problem21.java
 * Assignment : Lab 1, Problem 2.1
 * Author : Alex Smith
 * Course : CMPT220
 * Date : January 24, 2017
 */
 
import java.util.Scanner;
 
public class Lab1_problem21{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a degree in Celsius: ");
	int celsiusDegree = input.nextInt();
	
	double fahrenheit = (9.0 / 5) * celsiusDegree + 32;
	
	System.out.println(celsiusDegree + " Celsius is " + fahrenheit + " Fahrenheit.");
  }
}
	  