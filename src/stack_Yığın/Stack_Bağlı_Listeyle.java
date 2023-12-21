package stack_Y���n;

public class Stack_Ba�l�_Listeyle {

	int size;
	int counter;
	Node top;     // en �st d���m� tutan g�sterici head gibi.
	
	public Stack_Ba�l�_Listeyle(int size) {
		
		this.size=size;
		counter=0;
		top=null;		
	}
	void push(int data) {    //ekle
		
		Node eleman = new Node(data);
		
		if(isFull()) {
			
			System.out.println("Stack dolu, ekleme yap�lamaz!");
		}
		else {
			
			if(isEmpty()) {
				
				top=eleman;
				System.out.println(top.data + " stacke ilk eleman olarak eklendi");
			}
			else {
				
				eleman.next=top;
				top=eleman;
				System.out.println(top.data + " stacke eklendi");
			}
			counter++;
		}	
	}
	void pop() {   //��kar
		
		if(isEmpty()) {
			
			System.out.println("Stack bo� ��kart�cak bir �ey yok.");
		}
		else {
			
			System.out.println(top.data + " ��kart�ld�.");
			top=top.next;
			counter--;
		}
	}
	boolean isFull() {
		
		return counter==size;
	}
	boolean isEmpty() {
		
		return counter==0;
	}
	void print() {
		
		if(isEmpty()) {
			
			System.out.println("Stack bo�, yazd�ralacak bir �ey yok.");
		}
		else {
			
			Node temp=top;
			while (temp!=null) {
				
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println("\n");
		}	
	}
	void topG�ster() {
		
		if(isEmpty()) {
			
			System.out.println("Stack bo�.");
		}
		else {
			
			System.out.println("En �stteki d���m�n datas�: " + top.data);
		}
	}
	
	
}