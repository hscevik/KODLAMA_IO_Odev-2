package odev2;

public class LecruteManager {
	
	public void addLecture(Lecrute lecrute) {
		
			System.out.println(lecrute.name+" adlý ders eklenmiþtir.");
		
	}
	
	public void deleteLecrute(Lecrute lecrute) {
		
		System.out.println(lecrute.name+" adlý ders silinmiþtir.");

	}
	int i=1;
	public void listLecrute(Lecrute[] lecrute) {
		
		for (Lecrute lecrutes : lecrute) {
			System.out.println("Ders-"+i+" : "+lecrutes.name);
			i++;			
		}
		
	}
	

}
