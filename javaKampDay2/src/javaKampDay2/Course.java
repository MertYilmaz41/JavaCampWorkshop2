package javaKampDay2;

public class Course {

	public Course() 
	{
		
	}
	
	public Course(int _id, String _courseName, String _instructorName) 
	{
		this.id = _id;
		this.courseName = _courseName;
		this.instructorName = _instructorName;
	}
	
	int id;
	String courseName;
	String instructorName;
}
