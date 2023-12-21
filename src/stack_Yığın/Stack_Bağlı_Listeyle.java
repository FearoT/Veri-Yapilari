package stack_Yýðýn;

public class Stack_Baðlý_Listeyle {

	int size;
	int counter;
	Node top;     // en üst düðümü tutan gösterici head gibi.
	
	public Stack_Baðlý_Listeyle(int size) {
		
		this.size=size;
		counter=0;
		top=null;		
	}
	void push(int data) {    //ekle
		
		Node eleman = new Node(data);
		
		if(isFull()) {
			
			System.out.println("Stack dolu, ekleme yapýlamaz!");
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
	void pop() {   //çýkar
		
		if(isEmpty()) {
			
			System.out.println("Stack boþ çýkartýcak bir þey yok.");
		}
		else {
			
			System.out.println(top.data + " çýkartýldý.");
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
			
			System.out.println("Stack boþ, yazdýralacak bir þey yok.");
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
	void topGöster() {
		
		if(isEmpty()) {
			
			System.out.println("Stack boþ.");
		}
		else {
			
			System.out.println("En üstteki düðümün datasý: " + top.data);
		}
	}
	
	
}