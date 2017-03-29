/**
 * File : Lab5_problem720.java
 * Assignment : Lab 5
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : March 30, 2017
 * Version : 1.0
 */

import java.util.Scanner;

public class Lab5_problem720{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter ten numbers: ");

    double[] userinput = new double[10];

    for(int y = 0; y < userinput.length; y++){
      userinput[y] = input.nextDouble();
    }

    //Starts from the last index and works backwards
    for(int i = 9; i > 0; i--) {
      double currentMax = userinput[i];
      int currentMaxIndex = i;

      for(int j = i-1; j > -1; j--) {
        if(currentMax < userinput[j]) {
          currentMax = userinput[j];
          currentMaxIndex = j;
        }  
      }

      if(currentMaxIndex != i) {
        userinput[currentMaxIndex] = userinput[i];
        userinput[i] = currentMax;
      } 
    }

    for(int x = 0; x < userinput.length; x++){
      System.out.print(userinput[x] + " ");
    }
  }
}