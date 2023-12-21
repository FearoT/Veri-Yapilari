package linkedList_yapýsý_oluþturma;

public class ListeYapisi {
	
	
	Node head = null;  //Düðümün baþý
	Node tail = null;  //Düðümün sonu
	void ekle(int x) {
		
		Node eleman = new Node();  // Eklenecek olan düðüm
		eleman.data=x;
		eleman.next=null;
		
		
		if(head==null) {
			
			head = eleman;
			tail = eleman;
			System.out.println("Liste oluþturuldu ve ilk düðüm eklendi");
		}
		else {
			
			tail.next=eleman;  //Son elemanýn devamýna yeni düðüm ekledik
			tail = eleman;  // tail(son düðüm) güncelledim
			System.out.println("Listenin sonuna yeni bir eleman eklendi.");
			
		}					
	}
	
	void yazdir() {
		
		if(head==null) {
			
			System.out.println("Liste yapýsý boþ!!!");
		}
		else {
			
			Node temp = head; // geçici düðüm tüm düðümlerin üzerinde gezicek.
			System.out.print("\nbas ->");
			while(temp!=null) {
				System.out.print(temp.data + " ->");
				temp=temp.next;
			}
			System.out.println(" son.");
		}
	}
	
	
		
}
