package odev2;

public class LecruteManager {
	
	public void addLecture(Lecrute lecrute) {
		
			System.out.println(lecrute.name+" adl� ders eklenmi�tir.");
		
	}
	
	public void deleteLecrute(Lecrute lecrute) {
		
		System.out.println(lecrute.name+" adl� ders silinmi�tir.");

	}
	int i=1;
	public void listLecrute(Lecrute[] lecrute) {
		
		for (Lecrute lecrutes : lecrute) {
			System.out.println("Ders-"+i+" : "+lecrutes.name);
			i++;			
		}
		
	}
	

}
