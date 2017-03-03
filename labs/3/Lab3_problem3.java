/**
 * File : Lab3_problem3.java
 * Assignment : Lab 3, Problem 6.3
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 21, 2017
 * Version: 2.0
 */
 
import java.util.Scanner;
 
public class Lab3_problem3{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
	  int integerinput = input.nextInt();
	
	  System.out.println(reverse(integerinput));
	  boolean palindrome = isPalindrome(integerinput);
	  System.out.println("Is the integer a Palindrome? : " + palindrome);
  }
  
  public static int reverse(int number){
    String numberstring = Integer.toString(number);
	  int index;
	  String temp = "";
	
	  for(index = (numberstring.length() - 1); index >= 0; index--){
	    char charactertemp = numberstring.charAt(index);
	    String temp2 = Character.toString(charactertemp);
	    temp += temp2;
	  }
	
	  number = Integer.parseInt(temp);
	  return number;
  }
  
  public static boolean isPalindrome(int number){
	  String numberstring = Integer.toString(number);
	  int low = 0;
	  int high = numberstring.length() -1;
	
    while(low < high){
	    if(numberstring.charAt(low) != numberstring.charAt(high)){
	      return false;
      }
	    low++;
	    high--;
	  }
	
    return true;	
  }
}

  
  
  
  
  