/**
 * File : Lab6_problem913.java
 * Assignment : Lab 6
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : April 20, 2017
 * Version : 1.0
 *
 * This file creates the Location class with data values row, column, and maxValue for storing the respective data of a given array.
 * The file also finds the largest value of a given array using the Location class and prints the element and location.
 */
import java.util.Scanner;

public class Lab6_problem913{

  public static class Location{
    public int row = 0;
    public int column = 0;
    public double maxValue = 0;

    Location(){
    }

    Location(int setrow, int setcolumn){
      row = setrow;
      column = setcolumn;
    }

    double[] locateLargest(double[][] a){
      
      for(int crow = 0; crow < a.length; crow++){
        for(int ccolumn = 0; ccolumn < a[crow].length; ccolumn++){
          if(maxValue < a[crow][ccolumn]){
            maxValue = a[crow][ccolumn];
            row = crow;
            column = ccolumn;
          }
        }
      }

      double[] maxRowAndColumn = new double [3];
      maxRowAndColumn[0] = row;
      maxRowAndColumn[1] = column;
      maxRowAndColumn[2] = maxValue;

      return maxRowAndColumn;
    }

  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();

    double[][] twoDArray = new double [rows][columns];
    System.out.println("Enter the array: ");
    for(int row = 0; row < twoDArray.length; row++){
      for(int column = 0; column < twoDArray[row].length; column++){
        twoDArray[row][column] = input.nextDouble();
      }
    }
    
    Location location1 = new Location(rows, columns);
    double[]results = location1.locateLargest(twoDArray);
    System.out.println("The location of the largest element is "+results[2]+" at ("+results[0]+", "+results[1]+")");
  }


}