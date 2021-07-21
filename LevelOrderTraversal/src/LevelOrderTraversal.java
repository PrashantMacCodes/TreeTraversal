import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	
	Node left,right;
	public Node(int data) {
		this.data = data;
		this.left=this.right=null;
	
	}
}

class BinaryTree{
	Node root;
	
	public void printLevelOrder() {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node node = queue.poll();
			System.out.println(node.data);
			
			if(node.left !=null) {
				queue.add(node.left);
			}
			
			if(node.right !=null) {
				queue.add(node.right);
			}			
		}
		
	}
}


public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        tree_level.printLevelOrder();
		
	}

}
