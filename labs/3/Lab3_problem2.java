/**
 * File : Lab3_problem2.java
 * Assignment : Lab 3, Problem 6.2
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 21, 2017
 */

import java.util.Scanner;
 
public class Lab3_problem2{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
	int integerinput = input.nextInt();
	
	System.out.println("The sum of the digits in the integer is "+sumDigits(integerinput));

  }
  
  public static int sumDigits(long n){
    int num = (int)Math.floor(n);
	int sum = 0;
	
	while(num != 0){
	  int remainder = num %10;
      sum += remainder;	 
      num = num /10;	  
	}
	
	return sum;
  }
}