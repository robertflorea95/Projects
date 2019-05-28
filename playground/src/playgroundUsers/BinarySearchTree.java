package playgroundUsers;

public class BinarySearchTree {
	
	int counter = 0;
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int item) {
			key =item;
			left = right = null;
		}
		
		
	}
	
	Node root;
	
	BinarySearchTree() {
		root = null;
		
	}
	
	void insert(int key) {
		
		root = insertRec(root, key);
		
		
	}
	
	Node insertRec(Node root, int key) {
		
		counter++;
		
		if(root == null) {
			root = new Node(key);
			
			return root;
		}
		
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else {
			
			if(key > root.key) {
				root.right = insertRec(root.right, key);
			}
		}
		
		return root;
		
		
	}
	
	void inOrder() {
		inOrderRec(root);
		
	}
	
	void inOrderRec(Node root) {
		if (root!=null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
