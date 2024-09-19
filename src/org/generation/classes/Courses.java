package org.generation.classes;
import java.util.List;
import java.util.ArrayList;
public class Courses {
	//Your Course class must have, as attributes: courseName, professorName, year.
	String courseName;
    String professorName;
    int year;
	//Your class must also contain a collection that lists all students enrolled in them.
    List<Student> enrolledStudents;
    
    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }//constructor
    
	   public void enroll(Student student){
		      //TODO add the student to the collection
		   if (!enrolledStudents.contains(student)) {
	            enrolledStudents.add(student);
	        }
//			Overload the enroll method to take in an array of students.
		   public void enroll(Student[] students){
		      //TODO add all the students to the collection
		        for (Student student : students) {
		            enroll(student);
		        }

		   }

		   public void unEnroll(Student student){
		       //TODO remove this student from the collection
		       // Hint: check if that really is this student
			   if (enrolledStudents.contains(student)) {
			        enrolledStudents.remove(student);
			    } else {
			        System.out.println("El estudiante no está inscrito.");
			    }
		   }

		   public int countStudents(){
		       //TODO implement
			   return enrolledStudents.size();
		   }
		   
		   public int bestGrade(){
		       //TODO implement
			   if (enrolledStudents.isEmpty()) return 0;
		   }//if
		   int bestGrade = Integer.MIN_VALUE;
	        for (Student student : enrolledStudents) {
	            if (student.getGrade() > bestGrade) {
	                bestGrade = student.getGrade();
	            }
	        }
	        return bestGrade;
}
}//class Courses
