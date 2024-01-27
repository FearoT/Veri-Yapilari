package hash_Table;

public class Uygulama1 {

	public static void main(String[] args) {
		Tablo hTablo = new Tablo(5);
		
		hTablo.ekle(0, "Ahmet");
		hTablo.ekle(10, "Mehmet");
		
		hTablo.ekle(3, "Hasan");
		hTablo.ekle(4, "Hüseyin");
		
		hTablo.ekle(2, "Ayþe");
		hTablo.ekle(22, "Fatma");
		
		hTablo.ekle(15, "Beyza");
		hTablo.ekle(9, "Ece");

		System.out.println();
		hTablo.yazdir();
	
	
		
		
		
		
		
		
	
	}	
}