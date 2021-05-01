package odev2;

public class Main {

	public static void main(String[] args) {
		
		// Category
		Category category1	=new Category(1, "Backend Programlama", "A��klama");
		Category category2	=new Category(2, "Front Programlama", "A��klama");
		// Course
		Course course1	=new Course(1, 19, 1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Alt Ba�l�k", "/courses/images/1.png", 15, "20.01.2021");
		Course course2	=new Course(2, 20, 1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Alt Ba�l�k", "/courses/images/2.png", 15, "20.04.2021");
		// Lecrute
		Lecrute lecrute1=new Lecrute(1,20 , 1, "1. G�n");
		Lecrute lecrute2=new Lecrute(2,20 , 2, "2. G�n");

		// Category add and update
		CategoryManager categoryManager	=new CategoryManager();
		categoryManager.addToCategory(category1);
		categoryManager.addToCategory(category2);
		categoryManager.updateToCategory(category1);
		Category[] categories= {category1,category2};
		categoryManager.listCategory(categories);
		
		
		// Course add and update
		CourseManager courseManager=new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		Course[] courses= {course1,course2};
		courseManager.listCourse(courses);
		
		// Lecrute add and update
		LecruteManager lecruteManager=new LecruteManager();
		lecruteManager.addLecture(lecrute1);
		lecruteManager.addLecture(lecrute2);
		lecruteManager.deleteLecrute(lecrute2);
		Lecrute[] lecrute= {lecrute1,lecrute2};
		lecruteManager.listLecrute(lecrute);
		
		
	
	

		
		
	}

}
