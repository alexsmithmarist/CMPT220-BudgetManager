/**
 * File : Lab2_problem48.java
 * Assignment : Lab 2, Problem 4.8
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 *
 * This file prints the character that corresponds with a given ASCII code.
 */
 
import java.util.Scanner;
  
public class Lab2_problem48{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	  System.out.print("Enter an ASCII code : ");
	  int codenum = input.nextInt();
	  char character = (char)codenum;
	
	  if(codenum >= 0 && codenum <= 127){
	    System.out.println("The character for ASCII code "+codenum+" is "+character+".");
	  }
	  else{
	    System.out.println("Invalid ASCII code.");
	  }
  }
}