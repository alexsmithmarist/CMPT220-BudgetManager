/**
 * File : Lab2_problem415.java
 * Assignment : Lab 2, Problem 4.15
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 *
 * This file determines what the corresponding number on a phone is for a letter input by the user.
 */
 
import java.util.Scanner;
  
public class Lab2_problem415{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	  System.out.print("Enter a letter: ");
	  char letter = input.next().charAt(0);
	
	  if(letter == 'A' || letter == 'B' || letter == 'C' || letter == 'a' || letter == 'b' || letter == 'c'){
	    System.out.println("The corresponding number is 2");
	  }
	
	  else if(letter == 'D' || letter == 'E' || letter == 'F' || letter == 'd' || letter == 'e' || letter == 'f'){
	    System.out.println("The corresponding number is 3");  
	  }
	
  	else if(letter == 'G' || letter == 'H' || letter == 'I' || letter == 'g' || letter == 'h' || letter == 'i'){
	    System.out.println("The corresponding number is 4");
	  }
	
	  else if(letter == 'J' || letter == 'K' || letter == 'L' || letter == 'j' || letter == 'k' || letter == 'l'){
	    System.out.println("The corresponding number is 5");
    }

    else if(letter == 'M' || letter == 'N' || letter == 'O' || letter == 'm' || letter == 'n' || letter == 'o'){
	    System.out.println("The corresponding number is 6");
	  }
	
	  else if(letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S' || letter == 'p' || letter == 'q' || letter == 'r' || letter == 's'){
	    System.out.println("The corresponding number is 7"); 
	  }
	
	  else if(letter == 'T' || letter == 'U' || letter == 'V' || letter == 't' || letter == 'u' || letter == 'v'){
	    System.out.println("The corresponding number is 8");
	  }
	
	  else if(letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z' || letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z'){
	    System.out.println("The corresponding number is 9");
	  }
	
	  else{
	    System.out.println(letter +" is an invalid input.");
	  }
  }
}
 