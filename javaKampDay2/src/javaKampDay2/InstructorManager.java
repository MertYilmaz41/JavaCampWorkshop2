package javaKampDay2;

public class InstructorManager {
	public void joinCourse(Instructor instructor) 
	{
		System.out.println(instructor.firstName + " " + instructor.lastName + " adlý eðitmen kursa katýldý.");
	}
	
	public void leaveCourse(Instructor instructor) 
	{
		System.out.println(instructor.firstName + " " + instructor.lastName + " adlý eðitmen kurstan ayrýldý.");
	}
}
