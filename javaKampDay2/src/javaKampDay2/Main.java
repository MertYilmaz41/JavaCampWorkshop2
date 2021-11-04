package javaKampDay2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1,1,"Engin","Demiroð",33);
		
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.courseId = 2;
		instructor2.firstName = "Mert";
		instructor2.lastName = "Yýlmaz";
		instructor2.age = 20;
		
		Course course1 = new Course(1,"Java","Engin Demiroð");
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "C#";
		course2.instructorName = "Mert Yýlmaz";
		
		Instructor[] instructors = {instructor1,instructor2};
		
		for (Instructor instructor : instructors) 
		{
			System.out.println(instructor.firstName + " " + instructor.lastName);
		}
		 
		System.out.println("----------------------------------------------------");
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) 
		{
			System.out.println(course.courseName + " adlý kurs " + course.instructorName + " eðitmeni tarafýndan verilmektedir.");
		}
		
		System.out.println("----------------------------------------------------");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
			
		System.out.println("----------------------------------------------------");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.joinCourse(instructor1);
		instructorManager.leaveCourse(instructor2);
		
		
	}

}
