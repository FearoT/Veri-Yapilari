package queue_Kuyruk;

public class Queue_Dizilerle {

	int[] dizi;
	int size;
	int front;   //dizinin ba�taki eleman�
	int rear;	// dizinin sondaki eleman�
	public Queue_Dizilerle(int size) {
		
		this.size=size;
		dizi=new int[size];		//kuyruk yap�m�z
		front = 0;
		rear = -1;
	}
	void enQueue(int data) {
		
		if(isFull()) {
			System.out.println("Kuyruk dolu, ekleme yapamazs�n!");
	
		}
		else {
			
			rear++;
			dizi[rear] = data;
			System.out.println(dizi[rear] + " kuyru�a eklendi.");
		}
	}
	void deQueue() {
		
		if(isEmpty()) {
			
			System.out.println("Kuyruk bo�, silinecek eleman yok.");
		}
		else {
			
			int sayi = dizi[front];
			for(int i=1; i<=rear; i++) {
				
				dizi[i-1] = dizi[i];
			}
			rear--;
			System.out.println(sayi + " kuyruktan ��kart�ld�.");
		}
	}
	private boolean isFull() {
		
		return rear == size -1;
	}
	private boolean isEmpty() {
		
		return rear ==-1;
	}
	void elemanSayisi() {
		
		System.out.println("Eleman say�s�: "+ (rear+1));
	}
	void yazdir() {
		
		int i=rear;
		System.out.print("son->");
		while(i>=0) {
			System.out.print(dizi[i]+ " ->");
			i--;
		}
		System.out.println(" ba�");
	}
}