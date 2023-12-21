package stack_Yýðýn;

public class Uygulama1 {

	public static void main(String[] args) {
		Stack_dizilerle stack = new Stack_dizilerle(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		//pushh ekle pop çýkar.
		System.out.println("Pop(): " + stack.pop());
		
		
	}

}