package queue_Kuyruk;

public class Queue_Ba�l�_Listeyle {
	
	Node front;		//head
	Node rear;		//tail
	int counter;	//saya�
	int size;
	public Queue_Ba�l�_Listeyle(int size) {
		
		this.size=size;
		counter=0;
		front=null;
		rear=null;
	}
	void enQueue(int data) {		//ekleme i�lemi kuyru
		
		if(isFull()) {
			
			System.out.println("Kuyruk dolu, ekleme yap�lamad�.");
		}
		else {
			Node eleman= new Node(data);
			if(isEmpty()) {
				
				front=eleman;
				rear=eleman;
				System.out.println(data+" kuyru�a ilk eleman eklendi.");
			}
			else {
				
				rear.next=eleman;
				rear=rear.next;
				System.out.println(data+ " kuyru�a eklendi.");
			}	
			counter++;
		}	
	}
	void deQueue() {
		
		if(isEmpty()) {
			
			System.out.println("Kuyruk bo�, silinecek eleman yok.");
		}
		else {
			System.out.println(front.data + " silindi");
			front=front.next;
			counter--;
		}
	
	}
	private boolean isEmpty() {
		
		return counter==0;
	}
	private boolean isFull() {
		
		return counter==size;
	}
	void print() {
		
		if(isEmpty()) {
			
			System.out.println("Kuyruk bo�, yazd�ralacak eleman yok.");
		}
		else {
			
			Node temp = front;
			System.out.print("Ba� <- ");
			while(temp!=null) {
				
				System.out.print(temp.data + " <-");
				temp=temp.next;
			}
			System.out.print(" Son");
		}
	}
}