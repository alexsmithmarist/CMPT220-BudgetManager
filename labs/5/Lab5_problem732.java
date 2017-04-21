/**
 * File : Lab5_problem732.java
 * Assignment : Lab 5
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : March 30, 2017
 * Version : 1.0
 *
 * This file partitions a given list using a pivot
 */

import java.util.Scanner;

public class Lab5_problem732{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter list: ");
    int size = input.nextInt();
    int[] userinput = new int[size];
    for(int y = 0; y < userinput.length; y++){
      userinput[y] = input.nextInt();
    }

    partition(userinput);
    System.out.println("After the partition, the list is ");
    for(int x = 0; x < userinput.length; x++){
      System.out.print(userinput[x] + " ");
    }
  }

  public static int partition(int[] list){
    int pivotindex = 0;
    int pivot = list[pivotindex];
    int lowernum = pivotindex +1;
    int highernum = list.length -1;

    while(highernum > lowernum){
      while(lowernum <= highernum && list[lowernum] <= pivot){
        lowernum++;
      }

      while(lowernum <= highernum && list[highernum] > pivot){
        highernum--;
      }

      if(highernum > lowernum){
        int temp = list[highernum];
        list[highernum] = list[lowernum];
        list[lowernum] = temp;
      }
    }

    while(highernum > pivotindex && list[highernum] >= pivot){
      highernum--;
    }

    if(pivot > list[highernum]){
      list[pivotindex] = list[highernum];
      list[highernum] = pivot;
      return highernum;
    }

    else{
      return pivotindex;
    }
    
  }
}
    

