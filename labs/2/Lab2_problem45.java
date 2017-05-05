/**
 * File : Lab2_problem45.java
 * Assignment : Lab 2, Problem 4.5
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 *
 * This file calculates the area of a regular polygon when given the number of sides of the polygon
 * and the side length of the polygon.
 */
 
import java.util.Scanner;
  
public class Lab2_problem45{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	  System.out.print("Enter the number of sides of the regular polygon: ");
	  double numofsides = input.nextDouble();
	
	  System.out.print("Enter the side length of the regular polygon: ");
	  double sidelength = input.nextDouble();
	
	  double area = (numofsides * Math.pow(sidelength, 2)) / (4 * Math.tan(Math.PI / numofsides));
	  System.out.println("The area of the regular polygon is " +area+".");
  }
}