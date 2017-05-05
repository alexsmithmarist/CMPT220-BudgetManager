/**
 * File : Lab2_problem41.java
 * Assignment : Lab 2, Problem 4.1
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 *
 * This file calculates the area of a pentagon from the input of the length from the center of the pentagon to a vertex.
 */
 
import java.util.Scanner;
  
public class Lab2_problem41{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	  System.out.print("Enter the length from the center of a pentagon to a vertex: ");
	  double radius = input.nextDouble();
	
	  double side = 2 * radius * (Math.sin(Math.PI / 5));
	  double area = (5 * (Math.pow(side, 2)) / (4 * (Math.tan(Math.PI / 5))));
	  area = Math.round(area * 100);
	  area = area/100;
	
	  System.out.println("The area of the pentagon is "+ area +".");
  }
}