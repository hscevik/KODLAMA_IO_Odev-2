package odev2;


public class CategoryManager {
	
	public void  addToCategory(Category category) {
		
		System.out.println(category.name+" adlý kategori Baþarý ile eklendi.");		
	}
	public void updateToCategory(Category category) {
		
		System.out.println(category.id+" adlý kategori Baþarý ile güncellendi.");		

		
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
