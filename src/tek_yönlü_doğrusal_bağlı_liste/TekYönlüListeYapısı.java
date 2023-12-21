package tek_y�nl�_do�rusal_ba�l�_liste;

public class TekY�nl�ListeYap�s� {

	Node head = null;
	Node tail = null;
	
	void basaEkle(int x) {
		
		Node eleman = new Node();
		eleman.data=x;
		
		if(head == null) {
			
			eleman.next=null;
			head= eleman;
			tail=eleman;
			System.out.println("�lk eleman eklendi.");
		}
		else {
			
			eleman.next=head;
			head=eleman;
			System.out.println("Ba�a eleman eklendi.");
		}
	}
	void sonaEkle(int x) {
		
		Node eleman = new Node();
		eleman.data=x;
		
		if(head == null) {
			
			eleman.next=null;
			head= eleman;
			tail=eleman;
			System.out.println("�lk eleman eklendi.");
		}
		else {
			eleman.next=null;
			tail.next=eleman;  //ekleme yapt�k
			tail=eleman;	//isim g�ncelledik
			System.out.println("Sona eleman eklendi.");
		}
	}
	void arayaEkle(int indis, int x) {
		
		Node eleman = new Node();
		eleman.data=x;
		
		if(head == null && indis == 0) {
			
			eleman.next=null;
			head= eleman;
			tail=eleman;
			System.out.println("�lk eleman eklendi.");
		}	
		else if (head != null && indis == 0) {
			
			eleman.next=head;
			head=eleman;
			System.out.println(indis + " indisinci s�raya yeni eleman eklendi.");			
		}		
		else {
			
			int n = 0;
			Node temp=head;
			Node temp2=head;
			
			while(temp.next!=null) {
				
				n++;
				temp2=temp;
				temp=temp.next;
			}
			if(n==indis) {
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("Eleman eklendi.");
			}
			else {
				
				temp=head;
				temp2=head;
				int i =0;
				while(i!=indis) {
					
					temp2=temp;
					temp=temp.next;
					i++;
				}
				
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println(indis + " .s�raya yeni eleman eklendi.");
				
				
			}
		}
	}
	void bastanSil() {
		
		if(head==null) {
			System.out.println("Liste bo� silinecek nesne yok.");
		}
		else if (head.next==null) {
			head=null;
			tail=null;
			System.out.println("Listede kalan son eleman silindi.");
		}
		else {
			
			head=head.next;
			System.out.println("Ba�taki eleman silindi.");
			
		}
	
	}
	void sondanSil() {
		
		if(head==null) {
			System.out.println("Liste bo� silinecek nesne yok.");
		}
		else if (head.next==null) {
			head=null;
			tail=null;
			System.out.println("Listede kalan son eleman silindi.");
		}
		else {
			
			Node temp= head;
			Node temp2 =head;
			while(temp.next!=null) {
				
				temp2=temp;
				temp=temp.next;
			}
			temp2.next=null;
			tail=temp2;
			System.out.println("Sondan eleman silindi");
		}
	
	}
	void aradanSil(int indis) {
		
		if(head==null) {
			System.out.println("Liste bo�, silinecek bir �ey yok!!!");
		}
		else if (head.next==null && indis == 0) {
			
			head = null;
			tail=null;
			System.out.println("Listede kalan son elemanda silindi.");
		}
		else if (head.next!=null && indis == 0) {
			
			head= head.next;
			System.out.println("Ba�taki eleman silindi.");
		}
		else {
			
			int i = 0;
			Node temp=head;
			Node temp2=head;
			while(temp!=null) {
				
				i++;
				temp=temp.next;
			}
			if(i==indis) {
				
				temp2.next=null;
				tail=temp2;
				System.out.println("Listedeki son s�radaki eleman silinidi");
			}
			else {
				temp=head;
				temp2=head;
				int j=0;
				while(j!=indis) {
					
					temp2=temp;
					temp=temp.next;
					j++;
					
				}
				temp2.next=temp.next;
				System.out.println("Aradaki nesne silindi.");
			}
		}	
	}
	void yazdir() {
		
		if(head == null) {
			
			System.out.println("Liste yap�s� bo�.");
		}
		else {
			
			Node temp = head;
			System.out.println("Bas ->");
			while(temp!=null) {
				
				System.out.print(temp.data + " -> ");
				temp= temp.next;
			}
			System.out.print(" son.");
		
		}
		
		
	}	
	
	
}