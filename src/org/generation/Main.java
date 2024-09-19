package org.generation;
import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {
	  public static void main(String[] args) {
	        // Example usage
	        Courses historia = new Courses("Historia", "Ricardo", 2024);
	        Student estudiante1 = new Student("Ali", "Muhammad", 123, 85, 1);
	        Student estudiante2 = new Student("John", "Wick", 456, 75, 1);
	        
	        historia.enroll(estudiante1);
	        historia.enroll(estudiante2);
	        
	        System.out.println("Total de estudiantes inscritos: " + historia.countStudents());
	        System.out.println("Mejor Calificación: " + historia.bestGrade());
	    }
	  
}//main
