package sorting;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Kaç adet sayý girmek istersiniz: ");
		n= scanner.nextInt();
		int dizi[]= new int[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Sayý: ");
			dizi[i]=scanner.nextInt();
		}		
		Selection_Sort(dizi,n);
		System.out.println("Sýralama yapýldý");
		for (int i = 0; i < n; i++) {
			
			System.out.println(dizi[i] + "  ");
			
		}	
	}
	private static void Selection_Sort(int[] dizi, int n) {
		for(int i=0; i<n-1; i++) {
			
			int min= i;
			for(int j=i; j<n;j++) {
				
				if(dizi[min]>dizi[j]) {
					
					min=j;
				}
			}
			int temp=dizi[min];
			dizi[min]= dizi[i];
			dizi[i]=temp;
		
		}		
	}
}