package �ift_y�nl�_do�rusal_ba�l�_liste;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BagliListe bl = new BagliListe();
		
		int secim=-1, sayi, indis;
		
		while(secim!=0) {
			
			System.out.println("1- Ba�a ekle");
			System.out.println("2- Sona ekle");
			System.out.println("3- Araya ekle");
			System.out.println("4- Ba�tan sil");
			System.out.println("5- Sondan sil");
			System.out.println("6- Aradan sil");
			System.out.println("7- Sondan ba�a yazd�r");
			System.out.println("0- ��k��");
			System.out.println("Se�iminiz: ");
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
				
				System.out.println("�ndis: ");
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
