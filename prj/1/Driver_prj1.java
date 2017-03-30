/**
 * File : Driver_prj1.java
 * Assignment : Project 1
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : March 30, 2017
 * Version : 1.1
 */

import java.util.Scanner;

public class Driver_prj1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    double[] vFirst = new double[input.nextInt()];
    double[] vSecond = new double[input.nextInt()];

    if(vFirst.length == 0 || vSecond.length == 0 || vFirst.length < 0 || vSecond.length < 0){
      System.out.println("Invalid array size");
      System.exit(0);
    }

    for(int i = 0; i < vFirst.length; i++){
      vFirst[i] = input.nextDouble();
    }
    
    for(int i = 0; i < vSecond.length; i++){
      vSecond[i] = input.nextDouble();
    }
    
    /* To check if input works properly
    for(int i = 0; i < vFirst.length; i++){
      System.out.println(vFirst[i]);
    }
    for(int i = 0; i < vSecond.length; i++){
      System.out.println(vSecond[i]);
    }
    */

    double [] vResultmethod = convolveVectors(vFirst, vSecond);

    for(int i = 0; i < vResultmethod.length; i++){
      System.out.print(Math.round(vResultmethod[i]) + " ");
    }
  }

  public static double[] convolveVectors(double[] vFirst, double[] vSecond){
    double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
    for(int idx = 0; idx < vResult.length; idx++){
      for(int shift = 0; shift < vSecond.length; shift++){
        if((idx - shift) < vFirst.length && (idx - shift) >= 0){
          vResult[idx] += (vFirst[idx - shift] * vSecond[shift]);  
        }
      } 
    }

    return vResult;
  }
}
