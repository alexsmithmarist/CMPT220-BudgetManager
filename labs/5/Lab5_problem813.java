/**
 * File : Lab5_problem813.java
 * Assignment : Lab 5
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : March 30, 2017
 * Version : 1.0
 */

import java.util.Scanner;

public class Lab5_problem813{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter the number of rows and columns of the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();

    double[][] twoDArray = new double [rows][columns];
    System.out.println("Enter the array: ");

    for(int row = 0; row < twoDArray.length; row++){
      for(int column = 0; column < twoDArray[row].length; column++){
        twoDArray[row][column] = input.nextDouble();
      }
    }

    int[] results = locateLargest(twoDArray);
    System.out.println("The location of the largest element is at (" +results[0] + ", "+results[1]+")");
  }

  public static int[] locateLargest(double[][] a){
    double currentMax = a[0][0];
    int maxRow = 0;
    int maxColumn = 0;

    for(int row = 0; row < a.length; row++){
      for(int column = 0; column < a[row].length; column++){
        if(currentMax < a[row][column]){
          currentMax = a[row][column];
          maxRow = row;
          maxColumn = column;
        }
      }
    }

    int[] maxRowAndColumn = new int [2];
    maxRowAndColumn[0] = maxRow;
    maxRowAndColumn[1] = maxColumn;

    return maxRowAndColumn;
  }
}