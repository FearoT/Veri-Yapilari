package düðüm_Oluþturma;

public class Ana {

	public static void main(String[] args) {
		
		Sinif A = new Sinif();
		//Yukarýda nesne oluþturduk yada düðüm yada obje diyebiliriz.
		Sinif B = new Sinif();
		Sinif C = new Sinif();
		
		A.sayi=11;  //düðümlere deðerleri atadýk.
		B.sayi=22;
		C.sayi=33;
		
		A.next = B;  //düðümleri birbirine baðlama
		B.next = C;
		C.next = null;
		
		Sinif temp = A; //geçici deðiþken oluþturduk
		
		while(temp != null) {
			
			System.out.println(temp.sayi);
			temp = temp.next;
		}

		
	}

}
