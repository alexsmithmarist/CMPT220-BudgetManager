/**
 * File : Lab3_problem7.java
 * Assignment : Lab 3, Problem 5.7
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 21, 2017
 * Version: 2.0
 */
 
public class Lab3_problem7{
  public static void main(String[] args){
 
    int years;
    double tuition = 10000;

    for(years = 0; years < 10; years++){
      tuition += (tuition * .05);
    }

    System.out.printf("The tuition in ten years will be $%.2f",tuition);
	  //To make the next statement appear on another line
	  System.out.println(" ");

    double fouryears = 0;

    for(years = 0; years < 4; years++){
      tuition += (tuition * .05);
      fouryears += tuition;
    }

    System.out.printf("The total cost of four years' worth of tuition after the tenth year is $%.2f",fouryears);
  }
}