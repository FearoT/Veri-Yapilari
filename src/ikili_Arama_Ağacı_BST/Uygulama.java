package ikili_Arama_Aðacý_BST;

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
		
		System.out.println("\n\nAðacýn yüksekliði: "+ bt.height(bt.root));
		System.out.println("Aðaç üzerindeki eleman sayýsý "+bt.size(bt.root));
		
		//System.out.println("Kökün datasý: "+ bt.root.data);
		//System.out.println("Kökün saðýndaki datasý: "+ bt.root.right.data);
		//System.out.println("Kökün solundaki datasý: "+ bt.root.left.data);
		//System.out.println("Kökün solunun solunun datasý: "+ bt.root.left.left.data);
		
	}

}