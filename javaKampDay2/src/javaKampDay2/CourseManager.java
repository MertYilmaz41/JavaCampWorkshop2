package javaKampDay2;

public class CourseManager {
	public void add(Course course) 
	{
		System.out.println(course.courseName + " " + " adlı kurs sisteme eklendi.");
	}
	
	public void delete(Course course) 
	{
		System.out.println(course.courseName + " " + " adlı kurs sistemden çıkarıldı.");
	}
}
