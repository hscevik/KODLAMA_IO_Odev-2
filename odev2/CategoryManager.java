package odev2;


public class CategoryManager {
	
	public void  addToCategory(Category category) {
		
		System.out.println(category.name+" adl� kategori Ba�ar� ile eklendi.");		
	}
	public void updateToCategory(Category category) {
		
		System.out.println(category.id+" adl� kategori Ba�ar� ile g�ncellendi.");		

		
	}
	int i=1;
	public void listCategory(Category[] category) {
		
		System.out.println("Kategoriler:");
		for (Category categories : category) {
			System.out.println("Kategori-"+i+" : "+categories.name);
			i++;
		}
		
		
	}
}
