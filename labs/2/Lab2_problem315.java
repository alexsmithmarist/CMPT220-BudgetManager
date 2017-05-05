/**
 * File : Lab2_problem315.java
 * Assignment : Lab 2, Problem 3.15
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 *
 * This file generates a random number and compares an input to it to determine if there is any matches in the digits.
 * Depending on how many digits match, a winning or losing result is shown.
 */
 
import java.util.Scanner;
  
public class Lab2_problem315{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	  int lottery = (int)(Math.random()*(999-100)+100);
	
	  System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();
	
	  int lotteryDigit1 = lottery / 100;
	  int remaininglottery = lottery % 100;
	  int lotteryDigit2 = remaininglottery / 10;
	  int lotteryDigit3 = remaininglottery % 10;
	  
	  int guessDigit1 = guess / 100;
	  int remainingguess = guess % 100;
	  int guessDigit2 = remainingguess / 10;
	  int guessDigit3 = remainingguess % 10;
	  
	  int wincondition = 0;
	  
	  if (guess == lottery){
	    wincondition = 1;
	  }
	  
	  else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3
	     || guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1
		   || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1
		   || guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2
		   || guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2){
		    wincondition = 2;  
	  }
	  
	  else if(guessDigit1 == lotteryDigit2
	     || guessDigit1 == lotteryDigit3
		   || guessDigit1 == lotteryDigit1
		   || guessDigit2 == lotteryDigit1
		   || guessDigit2 == lotteryDigit2
		   || guessDigit3 == lotteryDigit3
		   || guessDigit2 == lotteryDigit3
		   || guessDigit3 == lotteryDigit2
		   || guessDigit3 == lotteryDigit1){
		     wincondition = 3;
	  }
	  
	  switch(wincondition){
	    case 0:System.out.println("Sorry, no match."); break;
      case 1:System.out.println("Exact match! You win $10,000!"); break;
      case 2:System.out.println("All digits matched! You win $3,000!"); break;
	    case 3:System.out.println("One digit matched! You win $1,000"); break;
	  }
	
	  System.out.println("The lottery number was "+ lottery+".");
  }
}

	
    
	