package odev2;


public class CourseManager {
	

	public void	addToCourse(Course course) {
	
	System.out.println(course.title+" adl� kurs eklenmi�tir.");
    }
	
	public void deleteToCourse(Course course) {
		
		System.out.println(course.title+" adl� kurs silinmi�tir.");
		
	}
	
	int i=1;
	public void listCourse(Course[] course) {
		
		System.out.println("Kurslar:");
		for (Course courses : course) {
			System.out.println("Kurs-"+i+" : "+courses.title);
			i++;
		}
		
		
	}
	

}
