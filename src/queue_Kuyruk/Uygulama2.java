package queue_Kuyruk;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Queue_Ba�l�_Listeyle kuyruk= new Queue_Ba�l�_Listeyle(5);
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.deQueue();
		kuyruk.print();
		System.out.println("Kuyruktaki eleman say�s�: "+ kuyruk.counter);
		System.out.println("Kuyru�un ba��ndaki eleman: "+ kuyruk.front.data);
		System.out.println("Kuyru�un sonundaki eleman: "+ kuyruk.rear.data);
	}
}