/**
 * File : Lab2_problem425.java
 * Assignment : Lab 2, Problem 4.25
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 */
 
 public class Lab2_problem425{
  public static void main(String[] args) {
	
	//Generate a random number between 65 and 90, the ASCII codes for uppercase letters
    int letter1num = (int)(Math.random()*(90-65)+65);
	char letter1 = (char)letter1num;
	
	int letter2num = (int)(Math.random()*(90-65)+65);
	char letter2 = (char)letter2num;
	
	int letter3num = (int)(Math.random()*(90-65)+65);
	char letter3 = (char)letter3num;
	
	int randomfourdigit = (int)(Math.random()*(9999-1000)+1000);
	
	System.out.println("The randomly generated plate number is "+ letter1 + letter2 + letter3 + randomfourdigit+".");
  }
 }
 