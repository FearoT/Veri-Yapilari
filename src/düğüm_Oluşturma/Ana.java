package d���m_Olu�turma;

public class Ana {

	public static void main(String[] args) {
		
		Sinif A = new Sinif();
		//Yukar�da nesne olu�turduk yada d���m yada obje diyebiliriz.
		Sinif B = new Sinif();
		Sinif C = new Sinif();
		
		A.sayi=11;  //d���mlere de�erleri atad�k.
		B.sayi=22;
		C.sayi=33;
		
		A.next = B;  //d���mleri birbirine ba�lama
		B.next = C;
		C.next = null;
		
		Sinif temp = A; //ge�ici de�i�ken olu�turduk
		
		while(temp != null) {
			
			System.out.println(temp.sayi);
			temp = temp.next;
		}

		
	}

}
