package linkedList_yap�s�_olu�turma;

public class ListeYapisi {
	
	
	Node head = null;  //D���m�n ba��
	Node tail = null;  //D���m�n sonu
	void ekle(int x) {
		
		Node eleman = new Node();  // Eklenecek olan d���m
		eleman.data=x;
		eleman.next=null;
		
		
		if(head==null) {
			
			head = eleman;
			tail = eleman;
			System.out.println("Liste olu�turuldu ve ilk d���m eklendi");
		}
		else {
			
			tail.next=eleman;  //Son eleman�n devam�na yeni d���m ekledik
			tail = eleman;  // tail(son d���m) g�ncelledim
			System.out.println("Listenin sonuna yeni bir eleman eklendi.");
			
		}					
	}
	
	void yazdir() {
		
		if(head==null) {
			
			System.out.println("Liste yap�s� bo�!!!");
		}
		else {
			
			Node temp = head; // ge�ici d���m t�m d���mlerin �zerinde gezicek.
			System.out.print("\nbas ->");
			while(temp!=null) {
				System.out.print(temp.data + " ->");
				temp=temp.next;
			}
			System.out.println(" son.");
		}
	}
	
	
		
}
