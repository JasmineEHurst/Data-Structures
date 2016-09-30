class TreeNode{
	int key;
	TreeNode left,right;
	
	public TreeNode(int key){
		this.key = key;
		left = right = null;
	}
}

public class BinaryTree {

	TreeNode root;
	
	public BinaryTree(){
		
	}
	
	public void postorderTraversal(TreeNode node){
		//base case
		if(node == null)
			return;
		//recur on left subtree
		postorderTraversal(node.left);
		//recur on right subtree
		postorderTraversal(node.right);
		//print current node
		System.out.print(node.key + " ");
	}
	
	public void preorderTraversal(TreeNode node){
		//base case
		if(node == null)
			return;
		//print current node
		System.out.print(node.key + " ");
		//recur on left subtree
		preorderTraversal(node.left);
		//recur on right subtree
		preorderTraversal(node.right);
	}
	
	public void inorderTraversal(TreeNode node){
		//base case
		if(node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.key);
		inorderTraversal(node.right);
	}
	
}
