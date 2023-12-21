package queue_Kuyruk;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Queue_Baðlý_Listeyle kuyruk= new Queue_Baðlý_Listeyle(5);
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.deQueue();
		kuyruk.print();
		System.out.println("Kuyruktaki eleman sayýsý: "+ kuyruk.counter);
		System.out.println("Kuyruðun baþýndaki eleman: "+ kuyruk.front.data);
		System.out.println("Kuyruðun sonundaki eleman: "+ kuyruk.rear.data);
	}
}