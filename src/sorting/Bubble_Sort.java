package sorting;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("kaç adet sayý girmek istersiniz: ");
		n= scanner.nextInt();
		int dizi[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			
			System.out.print("sayý: ");
			dizi[i]= scanner.nextInt();
		}
		
		bubbleSort(dizi,n);
		System.out.println("Bubble sort ile sýralama iþelemi yapýldý.");
		
		for(int i =0; i<n; i++) {
			
			System.out.println(dizi[i]+ "  ");
		}
		

	}
	private static void bubbleSort(int[] dizi, int n) {
		
		for(int i =0; i<n-1; i++) {
			
			for(int j=0;j<n-i-1; j++) {
				
				if(dizi[j]>dizi[j+1]) {
					
					int gecici= dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=gecici;
				}
			}
		}
	}
}