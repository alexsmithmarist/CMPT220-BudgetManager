/**
 * File : Lab2_problem38.java
 * Assignment : Lab 2, Problem 3.8
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 */
 
 import java.util.Scanner;
 
 public class Lab2_problem38{
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
    System.out.print("Please enter three integers.");
	int integer1 = input.nextInt();
	int integer2 = input.nextInt();
	int integer3 = input.nextInt();
	
	int max = integer1;
	int mid = integer2;
	int min = integer3;
	
	/*The if statement and first two else-if statements checks if the user inputs two integers that are the same. */
	
	if(integer1 == integer2){
	  if(integer1 > integer3){
		max = integer1;
		mid = integer2;
		min = integer3;
	  }
	  else{
		max = integer3;
		mid = integer2;
		min = integer1;
	  }
	}
	
	else if(integer2 == integer3){
	  if(integer2 > integer1){
		max = integer2;
		mid = integer3;
		min = integer1;
	  }
	  else{
		max = integer1;
		mid = integer2;
		min = integer3;
	  }
	}
	
	else if(integer1 == integer3){
	  if(integer1 > integer2){
		max = integer1;
		mid = integer3;
		min = integer2;
	  }
	  else{
		max = integer2;
		mid = integer3;
		min = integer1;
	  }
	}
	
	else if (integer1 > integer2 && integer1 > integer3){
	  max = integer1;
	  if(integer2 == integer3){
		mid = integer2;
		min = integer3;
      }
	  else if(integer2 > integer3){
		mid = integer2;
		min = integer3;
	  }
	  else{
	    mid = integer3;
	    min = integer2;
	  }
	}
	
	else if(integer2 > integer1 && integer2 > integer3){
		max = integer2;
		if(integer1 == integer3){
		mid = integer1;
		min = integer3;
        }
	    else if(integer1 > integer3){
	      mid = integer1;
		  min = integer3;
	    }
	    else{
	      mid = integer3;
		  min = integer1;
	    }
	  }
	
	else if(integer3 > integer1 && integer3 > integer2){
      max = integer3;
	  if(integer1 == integer2){
		mid = integer1;
		min = integer2;
      }
	  else if(integer1 > integer2){
	    mid = integer1;
		min = integer2;
	  }
	  else{
	    mid = integer2;
	    min = integer1;
	  }
	}
	
	else{
	  System.out.println("Invalid input");
	}
	
	System.out.println("In non-decreasing order, the integers are "+ min +" "+ mid +" "+ max +".");
  }
 }
	