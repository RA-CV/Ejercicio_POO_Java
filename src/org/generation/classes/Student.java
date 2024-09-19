package org.generation.classes;
import java.util.List;
import java.util.ArrayList;
public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    //Add constructors to your Student class:

//Make the class with at least three different constructors.
    
    public Student (String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toUpperCase();
        this.registration = registration;
        this.grade = (grade >= 0 && grade <= 100) ? grade : 0;
        this.year = year > 0 ? year : 1;
	}//constructor
	
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1);
	}//constructor
	public Student(int year, int grade) {
        this("DefaultFirstName", "DefaultLastName", 0, grade, year);
    }//constructor
    
    public void printFullName(){
        //TODO implement
    	System.out.println(firstName + " " + lastName);
     }//ifelse

     public void isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if ((grade >= 60) && (grade <= 100)) {
    		 System.out.println("True");
          } else { 
        	  System.out.println("False");
          }//ifelse
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
         if ((grade >= 60) && (grade <= 100)) {
             year += 1;
             System.out.println("Congratulations!");
         }//ifelse
         return year;
     }
}//classStudent
