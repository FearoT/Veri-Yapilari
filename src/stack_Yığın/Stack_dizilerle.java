package stack_Yýðýn;

public class Stack_dizilerle {

	int dizi[];
	int size;
	int indis;
	
	public Stack_dizilerle(int size) {
		
		this.size=size;
		dizi=new int[size];
		indis = -1;
		
	}
	void push(int data) {
		
		if(isFull()) {
			
			System.out.println("Stack dolu.");
		}
		else {
			
			indis++;
			dizi[indis]=data;
			System.out.println("push(): "+dizi[indis]);
		}

	}
	int pop() {
		
		if(!isEmpty()) {
			
			return dizi[indis--];
		}
		else {
			
			System.out.println("Dizi boþ.");
			return -1;
		}
		
	}
	boolean isFull() {
		
		return(indis==size-1);
	}
	boolean isEmpty() {
		
		return(indis==-1);
	}
}