/**
 * File : Lab6_problem91.java
 * Assignment : Lab 6
 * Author : Alex Smith
 * Course : CMPT220
 * Due Date : April 20, 2017
 * Version : 1.0
 *
 * This file creates the Rectangle class(with default constructor, methods to get area and perimeter, and a constructor for setting width and height) 
 * and prints the width, height, area, and perimeter of the created Rectangles
 */

public class Lab6_problem91{

  public static class Rectangle{
    double width = 1;
    double height = 1;

    Rectangle(){
    }

    Rectangle(double setwidth, double setheight){
      height = setheight;
      width = setwidth;
    }

    double getArea(){
      return width * height;
    }

    double getPerimeter() {
      return (width + width + height + height);
    }
  }

  public static void main(String[] args){
    Rectangle rectangle1 = new Rectangle(4, 40);
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);

    System.out.println("rectangle1 : Width = "+rectangle1.width+", Height = "+rectangle1.height+", Area = "+rectangle1.getArea()+", Perimeter = "+rectangle1.getPerimeter());
    System.out.println("rectangle2 : Width = "+rectangle2.width+", Height = "+rectangle2.height+", Area = "+rectangle2.getArea()+", Perimeter = "+rectangle2.getPerimeter());
  }

}