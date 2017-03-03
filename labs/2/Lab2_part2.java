/**
 * File : Lab2_part2.java
 * Assignment : Lab 2, Part 2
 * Author : Alex Smith
 * Course : CMPT220
 * Date : February 7, 2017
 * Version: 2.0
 */
 
import java.util.Scanner;
 
public class Lab2_part2{
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
	
	  String lettergrade = "temp";
	
	  if(finalgrade >= 95){
	    lettergrade = "A";
	  }
	
	  else if(finalgrade < 95 && finalgrade >= 90){
	    lettergrade = "-A";
	  }
	
	  else if(finalgrade < 95 && finalgrade >= 90){
	    lettergrade = "A-";
	  }
	
	  else if(finalgrade < 90 && finalgrade >= 87){
	   lettergrade = "B+";
	  }
	
	  else if(finalgrade < 87 && finalgrade >= 83){
	    lettergrade = "B";
	  }
	
	  else if(finalgrade < 83 && finalgrade >= 80){
	    lettergrade = "B-";
	  }
	
	  else if(finalgrade < 80 && finalgrade >= 77){
	    lettergrade = "C+";
	  }
	
	  else if(finalgrade < 77 && finalgrade >= 73){
	    lettergrade = "C";
	  }
	
	  else if(finalgrade < 73 && finalgrade >= 70){
	    lettergrade = "C-";
	  }
	
	  else if(finalgrade < 70 && finalgrade >= 65){
	    lettergrade = "D+";
	  }
	
	  else if(finalgrade < 65 && finalgrade >= 60){
	    lettergrade = "D";
	  }
	
	  else if(finalgrade < 60){
	    lettergrade = "F";
	  }
	
	  System.out.println("Your final grade is: " + lettergrade);
  }
}