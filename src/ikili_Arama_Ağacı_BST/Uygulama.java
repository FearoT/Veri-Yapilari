package ikili_Arama_A�ac�_BST;

public class Uygulama {

	public static void main(String[] args) {
		
		BTree bt=new BTree();
		bt.root=bt.insert(bt.root, 10);
		bt.root=bt.insert(bt.root, 15);
		bt.root=bt.insert(bt.root, 8);
		bt.root=bt.insert(bt.root, 20);
		bt.root=bt.insert(bt.root, 4);
		bt.root=bt.insert(bt.root, 12);
		
		System.out.print("preOrder: ");
		bt.preOrder(bt.root);
		
		System.out.println();
		
		System.out.print("inOrder: ");
		bt.inOrder(bt.root);
		
		System.out.println();
		
		System.out.print("postOrder: ");
		bt.postOrder(bt.root);
		
		bt.root=bt.delete(bt.root, 4);
		
		System.out.println();
		
		System.out.print("inOrder: ");
		bt.inOrder(bt.root);
		
		System.out.println("\n\nA�ac�n y�ksekli�i: "+ bt.height(bt.root));
		System.out.println("A�a� �zerindeki eleman say�s� "+bt.size(bt.root));
		
		//System.out.println("K�k�n datas�: "+ bt.root.data);
		//System.out.println("K�k�n sa��ndaki datas�: "+ bt.root.right.data);
		//System.out.println("K�k�n solundaki datas�: "+ bt.root.left.data);
		//System.out.println("K�k�n solunun solunun datas�: "+ bt.root.left.left.data);
		
	}

}