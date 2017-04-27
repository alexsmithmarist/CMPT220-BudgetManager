/**
 * File : Lab7_problem1017.java
 * Assignment : Lab 7
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : April 27, 2017
 * Version : 1.1
 *
 * This file finds the first ten square numbers that are greater than Long.MAX_VALUE
 */

import java.math.*;

public class Lab7_problem1017{
  public static void main(String[] args){
    Squarenum squarenum1 = new Squarenum();
    System.out.println("The long max value is "+Long.MAX_VALUE);
    squarenum1.findSquare();
    } 


  public static class Squarenum{

    Squarenum(){}

    public static void findSquare(){
      double sqrt = Math.sqrt(Long.MAX_VALUE);
      sqrt = sqrt+1;
      
      for(int i=0; i<10; i++){
        BigDecimal x = new BigDecimal(sqrt * sqrt);
        System.out.println(x);
        sqrt++;
      }
    }
  }
}