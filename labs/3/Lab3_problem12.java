/**
 * File : Lab3_problem12.java
 * Assignment : Lab 3, Problem 5.12
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 21, 2017
 * Version: 2.0
 *
 * This file finds the smallest integer n such that n^2 is greater than 12000
 */
 
public class Lab3_problem12{
  public static void main(String[] args){
    int n = 0;
  
    while((n*n) <= 12000){
      n++;
    }
  
    System.out.println("The smallest integer n, such that n^2 is greater than 12000, is " +n);
  }
}