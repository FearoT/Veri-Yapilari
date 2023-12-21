package YeniPkg;

public class AnaSinif {	
	byte sayi1;
	String kelime1;
	double kesirli1;
	
	
	public static void main(String[] args) {
	
		yazdir(5);
		IkinciSinif IkýncýSýnýf = new IkinciSinif();
		ikinciSinifDegerYazdir(IkýncýSýnýf);
		IkinciSinif[] dizi=new IkinciSinif[10];
		for(int i=0; i<dizi.length; i++) {
			dizi[i]=new IkinciSinif();
		}
		
		
	}
	
	public AnaSinif(byte sayi1, String kelime1, double kesirli1) {
		
		this.sayi1=sayi1;
		this.kelime1=kelime1;
		this.kesirli1=kesirli1;
		
	}
	
	public AnaSinif(byte sayi1, String kelime1) {
		
		this.sayi1=sayi1;
		this.kelime1=kelime1;
		kesirli1=1.5; //gerekirse sil
		
	}
	
	public AnaSinif() {
		
		
	}
	
	public static void yazdir(int sayi) {
		
		System.out.println("Girilen sayý: "+sayi);
	}
	
	public static void ikinciSinifDegerYazdir(IkinciSinif iks) {
		
		System.out.println("Harf: " + iks.getHarf());
        System.out.println("Sayý bir: " + iks.getSayi1());
        System.out.println("Sayý iki: " + iks.getSayi2());
		
	}
	
	public static IkinciSinif ikinciSinifaDegerAta(char deger1,short deger2,long deger3) {
		
		IkinciSinif ikinciSiniff=new IkinciSinif();
		
		ikinciSiniff.setHarf(deger1);
		ikinciSiniff.setSayi1(deger2);
		ikinciSiniff.setSayi2(deger3);
		
		return ikinciSiniff;
		
	}
	
	
	
}
