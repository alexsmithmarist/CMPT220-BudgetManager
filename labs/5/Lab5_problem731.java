/**
 * File : Lab5_problem731.java
 * Assignment : Lab 5
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : March 30, 2017
 * Version : 1.0
 */

import java.util.Scanner;

public class Lab5_problem731{
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter list1: ");
    String list1string = input.nextLine();
    String[] list1split = list1string.split(" ");
    
    //Used to detect size of the array
    int[] list1 = new int [list1split.length];

    int num = 0;
    for(int y = 0; y < list1.length; y++){
      num = Integer.parseInt(list1split[y]);
      list1[y] = num;
    }

    System.out.print("Enter list2: ");
    String list2string = input.nextLine();
    String[] list2split = list2string.split(" ");
    int[] list2 = new int [list2split.length];

    num = 0;
    for(int z = 0; z < list2.length; z++){
      num = Integer.parseInt(list2split[z]);
      list2[z] = num;
    }
    
    bubbleSort(list1);
    bubbleSort(list2);
    int[] mergedlist = merge(list1, list2);

    System.out.println("The merged list is ");
    for(int k = 0; k < mergedlist.length; k++){
      System.out.print(mergedlist[k]+" ");
    }

    
  }

  public static void bubbleSort(int[] array){
    for(int l = 0; l < array.length; l++ ){
      for(int m = 0; m < array.length -1; m++){
        if(array[m] > array[m+1]){
          int temp = array[m];
          array[m] = array[m+1];
          array[m+1] = temp;     
        }       
      } 
    }       
  }

  public static int[] merge(int[] list1, int[] list2){
    int[] mergelist = new int[list1.length + list2.length];
    for(int q = 0; q < list1.length; q++){
      mergelist[q] = list1[q];
    }
    
    int num = 0;
    
    //Adjusted to insert the contents of list 2 after the contents of list 1
    for(int v = list1.length; v < list1.length + list2.length; v++){
      mergelist[v] = list2[num];
      num++;
    }

    bubbleSort(mergelist);
    
    return mergelist;
  
  }

}
    
    
    
    