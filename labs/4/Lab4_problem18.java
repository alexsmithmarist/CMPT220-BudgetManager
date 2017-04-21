/**
 * File : Lab4_problem18.java
 * Assignment : Lab 4, Problem 7.18
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 28, 2017
 * Version : 1.1
 *
 * This file uses bubble-sort to sort a given array
 */


import java.util.Scanner;
public class Lab4_problem18{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    double[] userinput = new double[10];

    System.out.print("Enter 10 numbers: ");
    for(int i = 0; i < userinput.length; i++){
      userinput[i] = input.nextDouble();
    }

    bubbleSort(userinput);
    System.out.println("The sorted array is: ");
    for(int k = 0; k < userinput.length; k++){
      System.out.print(userinput[k]+" ");
    }
  }

  public static void bubbleSort(double[] array){
    for(int l = 0; l < array.length; l++ ){
      for(int m = 0; m < array.length -1; m++){
        if(array[m] > array[m+1]){
          double temp = array[m];
          array[m] = array[m+1];
          array[m+1] = temp;     
        }        
      } 
    }       
  }
}