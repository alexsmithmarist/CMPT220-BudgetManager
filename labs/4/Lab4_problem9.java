/**
 * File : Lab4_problem9.java
 * Assignment : Lab 4, Problem 7.9
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 28, 2017
 * Version : 1.0
 */

import java.util.Scanner;

public class Lab4_problem9{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter ten numbers: ");

    double[] userinput = new double[10];

    for(int i = 0; i < userinput.length; i++){
      userinput[i] = input.nextDouble();
    }

    System.out.println("The minimum number is: "+min(userinput));

  }

  public static double min(double[] array){
    double min = array[0];
    for(int i = 0; i < array.length; i++){
      if(array[i] < min){
        min = array[i];
      }  
    }
    
    return min;
  }
}