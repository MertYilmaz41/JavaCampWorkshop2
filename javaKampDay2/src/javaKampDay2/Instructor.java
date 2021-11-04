package javaKampDay2;

public class Instructor {
	
	public Instructor() 
	{
		
	}
	
	public Instructor(int _id, int _courseId, String _firstName, String _lastName, int _age) 
	{
		this.id = _id;
		this.courseId = _courseId;
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.age = _age;
	}
	
	int id;
	int courseId;
	String firstName;
	String lastName;
	int age;

}
