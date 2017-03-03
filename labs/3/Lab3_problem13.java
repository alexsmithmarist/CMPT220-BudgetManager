/**
 * File : Lab3_problem13.java
 * Assignment : Lab 3, Problem 5.13
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 21, 2017
 * Version: 2.0
 */
 
public class Lab3_problem13{
  public static void main(String[] args){
	  int n = 0;
	
	  while((n*n*n) <= 12000){
	    n++;
	  }
	
	  System.out.println("The largest integer n, such that n^3 is less than 12000, is " + (n-1));
  }
}