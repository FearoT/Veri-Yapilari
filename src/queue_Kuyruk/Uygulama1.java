package queue_Kuyruk;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Queue_Dizilerle kuyruk = new Queue_Dizilerle(5);
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.deQueue();
		kuyruk.elemanSayisi();
		kuyruk.yazdir();
		System.out.println("Kuyruðun baþýndaki eleman: " + kuyruk.dizi[kuyruk.front]);
		System.out.println("Kuyruðun sonundaki eleman: " + kuyruk.dizi[kuyruk.rear]);
	}
}