package çift_yönlü_doðrusal_baðlý_liste;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BagliListe bl = new BagliListe();
		
		int secim=-1, sayi, indis;
		
		while(secim!=0) {
			
			System.out.println("1- Baþa ekle");
			System.out.println("2- Sona ekle");
			System.out.println("3- Araya ekle");
			System.out.println("4- Baþtan sil");
			System.out.println("5- Sondan sil");
			System.out.println("6- Aradan sil");
			System.out.println("7- Sondan baþa yazdýr");
			System.out.println("0- Çýkýþ");
			System.out.println("Seçiminiz: ");
			secim=scanner.nextInt();
			
			if(secim==1) {
				
				System.out.println("Sayi: ");
				sayi=scanner.nextInt();
				bl.basaEkle(sayi);
			}
			else if(secim==2) {
				
				System.out.println("Sayi: ");
				sayi=scanner.nextInt();
				bl.sonaEkle(sayi);
			}
			else if(secim==3) {
				
				System.out.println("Sayi: ");
				sayi=scanner.nextInt();
				
				System.out.println("Ýndis: ");
				indis=scanner.nextInt();
				bl.arayaEkle(indis, sayi);		
			}
			else if (secim==4) {
				
				bl.bastanSil();
			}
			else if (secim==5) {
				
				bl.sondanSil();
			}
			else if (secim==6) {
				
				System.out.println("indis: ");
				indis=scanner.nextInt();
				bl.AradanSil(indis);
			}
			else if (secim==7) {
				
				bl.sondanYazdir();
			}
			bl.yazdir();
		}
		
	}

}
