/**
 * File : Lab1_part2.java
 * Assignment : Lab 1, Part 2
 * Author : Alex Smith
 * Course : CMPT220
 * Date : January 24, 2017
 */
 
import java.util.Scanner;
 
public class Lab1_part2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the following as a percentage...");
	System.out.print("midterm exam: ");
	double midtermexamgrade = input.nextDouble();
	
	System.out.print("final exam: ");
	double finalexamgrade = input.nextDouble();
	
	System.out.print("projects: ");
	double projectsgrade = input.nextDouble();
	
	System.out.print("homework and labs: ");
	double homeworklabgrade = input.nextDouble();
	
	double midtermexamweighted = midtermexamgrade * .2;
	double finalexamweighted = finalexamgrade * .2; 
	double projectsweighted = projectsgrade * .2;
	double homeworklabweighted = homeworklabgrade * .4;
	
	double finalgrade = midtermexamweighted + finalexamweighted + projectsweighted + homeworklabweighted;
	System.out.println("Your final grade is: " + finalgrade + "%");
  }
}
	