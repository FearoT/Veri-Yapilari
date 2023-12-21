package tek_yönlü_doðrusal_baðlý_liste;

public class Uygulama {

	public static void main(String[] args) {
		TekYönlüListeYapýsý tekYonList = new TekYönlüListeYapýsý();
		tekYonList.basaEkle(10);
		tekYonList.basaEkle(30);
		tekYonList.basaEkle(40);
		tekYonList.basaEkle(50);
		tekYonList.basaEkle(60);
		//tekYonList.sonaEkle(40); 
		//System.out.println("Baþtaki düðümün elmaný:" + tekYonList.head.data);
		//System.out.println("Sondaki düðümün elmaný:" + tekYonList.tail.data);
		//tekYonList.arayaEkle(0, 0);
		//tekYonList.arayaEkle(5, 37);		
		//tekYonList.arayaEkle(8, 45);
		//tekYonList.bastanSil();
		//tekYonList.sondanSil();
		tekYonList.aradanSil(2);
		
		
		
		tekYonList.yazdir();


		
	}

}
