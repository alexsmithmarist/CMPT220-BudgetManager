/**
 * File : Lab7_problem102.java
 * Assignment : Lab 7
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : April 27, 2017
 * Version : 1.0
 *
 * This file creates the BMI class which stores data about a user and calculates their BMI
 */

public class Lab7_problem102{
  public static void main(String[] args){
    BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
    System.out.println("The BMI for " +bmi1.getName() + " is " +bmi1.getBMI() + " " + bmi1.getStatus());

    BMI bmi2 = new BMI("Susan King", 215, 70);
    System.out.println("The BMI for " +bmi2.getName() + " is " +bmi2.getBMI() + " " + bmi2.getStatus());
    
    //This tests the new constructor
    BMI bmi3 = new BMI("Bob Jones", 18, 140, 5, 11);
    System.out.println("The BMI for " +bmi3.getName() + " is " +bmi3.getBMI() + " " + bmi3.getStatus());
  }

  public static class BMI{
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(){}

    public BMI(String name, int age, double weight, double height){
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

    public BMI(String name, double weight, double height){
      this(name, 20, weight, height);
    }

    /* Construct a BMI with the specified name, age, weight, feet, and inches */
    public BMI(String name, int age, double weight, double feet, double inches){
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = (feet * 12) + inches; //This converts feet to inches since the formula uses height in inches
    }

    public double getBMI(){
      double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus(){
      double bmi = getBMI();
      if (bmi < 18.5){
        return "Underweight";
      }
      else if (bmi < 25){
        return "Normal";
      }
      else if (bmi < 30){
        return "Overweight";
      }
      else{
        return "Obese";
      }
    }

    public String getName(){
      return name;
    }

    public int getAge(){
      return age;
    }
  
    public double getWeight(){
      return weight;
    }

    public double getHeight(){
      return height;
    }

  }
}