/**
 * File : Lab4_problem8.java
 * Assignment : Lab 4, Problem 6.8
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 28, 2017
 * Version : 1.1
 *
 * This file converts Celsius to Fahrenheit and Fahrenheit to Celsius and displays it in a table
 */
public class Lab4_problem8 {
  public static void main(String[] args){
    System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
    System.out.println("---------------------------------------------------------------");
  
    double celsius = 40.0;
    double fahrenheit = 120.0;
    int counter = 1;
  
    while(counter <= 10){
      System.out.println(celsius +"\t\t"+celsiusToFahrenheit(celsius)+"\t\t|\t"+fahrenheit+"\t\t"+fahrenheitToCelsius(fahrenheit));
      counter++;
      celsius -= 1;
      fahrenheit -= 10;
    }
  
  }
 
  public static double celsiusToFahrenheit(double celsius){
    double celfahrenheit = (9.0 / 5) * celsius +32;
    celfahrenheit = Math.round(celfahrenheit * 100.0)/100.0;
    return celfahrenheit;
  }

  public static double fahrenheitToCelsius(double fahrenheit){
    double farcelsius = (5.0 / 9) * (fahrenheit - 32);
    farcelsius = Math.round(farcelsius * 100.0)/100.0;
    return farcelsius;
  }
}