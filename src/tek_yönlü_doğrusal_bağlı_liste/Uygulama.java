package tek_y�nl�_do�rusal_ba�l�_liste;

public class Uygulama {

	public static void main(String[] args) {
		TekY�nl�ListeYap�s� tekYonList = new TekY�nl�ListeYap�s�();
		tekYonList.basaEkle(10);
		tekYonList.basaEkle(30);
		tekYonList.basaEkle(40);
		tekYonList.basaEkle(50);
		tekYonList.basaEkle(60);
		//tekYonList.sonaEkle(40); 
		//System.out.println("Ba�taki d���m�n elman�:" + tekYonList.head.data);
		//System.out.println("Sondaki d���m�n elman�:" + tekYonList.tail.data);
		//tekYonList.arayaEkle(0, 0);
		//tekYonList.arayaEkle(5, 37);		
		//tekYonList.arayaEkle(8, 45);
		//tekYonList.bastanSil();
		//tekYonList.sondanSil();
		tekYonList.aradanSil(2);
		
		
		
		tekYonList.yazdir();


		
	}

}
