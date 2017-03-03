/**
 * File : Lab4_problem20.java
 * Assignment : Lab 4, Problem 6.20
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 28, 2017
 * Version : 1.0
 */
 
import java.util.Scanner;

public class Lab4_problem20{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	  System.out.print("Enter a string: ");
	  String userinput = input.nextLine();
	
	  System.out.println("The number of letters in this string is : "+countLetters(userinput)+".");
  }
  
  public static int countLetters(String s){
    int counter = 0;
	  int numberofletters = 0;
	
	  while(counter <= (s.length() - 1)){
      if(Character.isLetter(s.charAt(counter))){
      numberofletters++;
      }
      counter++;
	  }

    return numberofletters;
  }
}