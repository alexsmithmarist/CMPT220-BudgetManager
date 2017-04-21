/**
 * File : Driver_lab3.java
 * Assignment : Lab 3, Kattis Problem
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 22, 2017
 * Version: 2.0
 *
 * This file computes the p-norm distance between a pair of inputed points
 */
 
import java.util.Scanner;
import java.io.BufferedInputStream;
 
public class Driver_lab3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String coordinatestring = input.nextLine();
  
  
    int stringposition = 0;
      double x1 = 0.0;
      double x2 = 0.0;
      double y1 = 0.0;
      double y2 = 0.0;
      double p = 0.0;
      String temp = "temp";
      String spacecheck = "space";
      String subb4decimal = "temp sub";
      String subafterdecimal = "temp sub2";
      int decimalpos = 0;
      int spacepos = 0;
      double distance;
  
    while (!"0".equals(coordinatestring)) {
    //substring before the decimal is added to substring after the decimal, then the value is converted to a double and saved in the variable
      if(Character.isDigit(coordinatestring.charAt(stringposition))){
        decimalpos = coordinatestring.indexOf('.', stringposition);
        subb4decimal = coordinatestring.substring(stringposition, decimalpos);
        spacepos = coordinatestring.indexOf(' ', decimalpos);
        subafterdecimal = coordinatestring.substring(decimalpos, spacepos);
    
        temp = subb4decimal + subafterdecimal;
        x1 = Double.parseDouble(temp);
        stringposition = spacepos + 1;
    
        decimalpos = coordinatestring.indexOf('.', stringposition);
        subb4decimal = coordinatestring.substring(stringposition, decimalpos);
        spacepos = coordinatestring.indexOf(' ', decimalpos);
        subafterdecimal = coordinatestring.substring(decimalpos, spacepos);
    
        temp = subb4decimal + subafterdecimal;
        y1 = Double.parseDouble(temp);
        stringposition = spacepos + 1;
    
        decimalpos = coordinatestring.indexOf('.', stringposition);
        subb4decimal = coordinatestring.substring(stringposition, decimalpos);
        spacepos = coordinatestring.indexOf(' ', decimalpos);
        subafterdecimal = coordinatestring.substring(decimalpos, spacepos);
    
        temp = subb4decimal + subafterdecimal;
        x2 = Double.parseDouble(temp);
        stringposition = spacepos + 1;
    
        decimalpos = coordinatestring.indexOf('.', stringposition);
        subb4decimal = coordinatestring.substring(stringposition, decimalpos);
        spacepos = coordinatestring.indexOf(' ', decimalpos);
        subafterdecimal = coordinatestring.substring(decimalpos, spacepos);
    
        temp = subb4decimal + subafterdecimal;
        y2 = Double.parseDouble(temp);
        stringposition = spacepos + 1;
    
        decimalpos = coordinatestring.indexOf('.', stringposition);
        subb4decimal = coordinatestring.substring(stringposition, decimalpos);
        spacepos = coordinatestring.indexOf(' ', decimalpos);
        subafterdecimal = coordinatestring.substring(decimalpos);
    
        temp = subb4decimal + subafterdecimal;
        p = Double.parseDouble(temp);
        stringposition = spacepos + 1;
    
        distance = Math.pow(((Math.pow((Math.abs(x1-x2)),p)) + (Math.pow((Math.abs(y1-y2)),p))),(1.0/p));
        System.out.println(distance);
    
        stringposition = 0;
        coordinatestring = input.nextLine();
      }
    }
  }
} 