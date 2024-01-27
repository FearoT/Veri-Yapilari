package sorting;

import java.util.Scanner;

public class Ýnsertion_Sort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Kaç adet sayý girmek isterseniz: ");
		int n= scanner.nextInt();
		int[] dizi = new int [n];
		
		for (int i = 0; i < n; i++) {
				
			System.out.print("Sayý: ");
			dizi[i]= scanner.nextInt();
		}
		insertSort(dizi,n);
		System.out.println("Sýralama iþlemi tamam.");
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("  " + dizi[i]);
		}
	}
	private static void insertSort(int[] dizi, int n) {
		
		for(int i =1; i<n; i++) {
			
			for(int k=i; k>0; k--) {
				
				if(dizi[k]<dizi[k-1]) {
					
					int temp =dizi[k];
					dizi[k]= dizi[k-1];
					dizi[k-1]= temp;
				}
			}
		}	
	}
}