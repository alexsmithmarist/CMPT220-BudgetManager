/**
 * File : Lab2_problem426.java
 * Assignment : Lab 2, Problem 4.26
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 *
 * This file calculates the number of coins (Quarters, dimes, nickels, and pennies) in a given double value.
 */
 
import java.util.Scanner;
  
public class Lab2_problem426{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();
  
    int decimal = amount.indexOf('.');
    String dollar = amount.substring(0,decimal);
    String coins = amount.substring(decimal + 1);
  
    int coinsvalue = Integer.parseInt(coins);
    int numberOfQuarters = coinsvalue / 25;
    int remainingamount = coinsvalue % 25;
  
    int numberOfDimes = remainingamount / 10;
    remainingamount = remainingamount % 10;
  
    int numberOfNickels = remainingamount / 5;
    remainingamount = remainingamount % 5;
  
    int numberOfPennies = remainingamount;
  
    System.out.println("Your amount " + amount +" consists of");
    System.out.println("    " + dollar +" dollars");
    System.out.println("    " + numberOfQuarters +" quarters");
    System.out.println("    " + numberOfDimes +" dimes");
    System.out.println("    " + numberOfNickels +" nickels");
    System.out.println("    " + numberOfPennies +" pennies");
  }
}
  
  