package queue_Kuyruk;

public class Queue_Baðlý_Listeyle {
	
	Node front;		//head
	Node rear;		//tail
	int counter;	//sayaç
	int size;
	public Queue_Baðlý_Listeyle(int size) {
		
		this.size=size;
		counter=0;
		front=null;
		rear=null;
	}
	void enQueue(int data) {		//ekleme iþlemi kuyru
		
		if(isFull()) {
			
			System.out.println("Kuyruk dolu, ekleme yapýlamadý.");
		}
		else {
			Node eleman= new Node(data);
			if(isEmpty()) {
				
				front=eleman;
				rear=eleman;
				System.out.println(data+" kuyruða ilk eleman eklendi.");
			}
			else {
				
				rear.next=eleman;
				rear=rear.next;
				System.out.println(data+ " kuyruða eklendi.");
			}	
			counter++;
		}	
	}
	void deQueue() {
		
		if(isEmpty()) {
			
			System.out.println("Kuyruk boþ, silinecek eleman yok.");
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
			
			System.out.println("Kuyruk boþ, yazdýralacak eleman yok.");
		}
		else {
			
			Node temp = front;
			System.out.print("Baþ <- ");
			while(temp!=null) {
				
				System.out.print(temp.data + " <-");
				temp=temp.next;
			}
			System.out.print(" Son");
		}
	}
}