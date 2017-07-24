package sample;

public class devi6 {

	
		public class BinaryTree {
			 
			 BinaryTree left;
			 BinaryTree right;
			 int value;
			 
			 public BinaryTree(int v) {
			  value = v;
			 }
			 
			 // Insert a value into the tree
			 public void insert(int v) {
			  if(v < value) {
			   if(left == null)
			    left = new BinaryTree(v);
			   else
			    left.insert(v);
			  }
			 
			  else if(v > value) {
			   if(right == null)
			    right = new BinaryTree(v);
			   else
			    right.insert(v);
			  }
			 }
			 
			 
			 
			 public void preorder() {
			  System.out.println(value);
			  if(left != null) left.preorder();
			  if(right != null) right.preorder();
			 }
			 
			 
			 
			 
			 public void inorder() {
			  if(left != null) left.inorder();
			  System.out.println(value);
			  if(right != null) right.inorder();
			 }
			 
			 
			 public void postorder() {
			  if(left != null) left.postorder();
			  if(right != null) right.postorder();
			  System.out.println(value);
			 }
			 
		
			 
			 class devi6{
			 public static void main(String args[])
			 {
			 
			 
			  BinaryTree b = new BinaryTree(50);
			 
			 
			  b.insert(20);
			  b.insert(40);
			  b.insert(10);
			  b.insert(5);
			  b.insert(45);
			 
			  b.insert(70);
			  b.insert(60);
			  b.insert(80);
			  b.insert(55);
			  b.insert(85);
			 
			  System.out.println("preorder traversal"+ b.preorder());
			  System.out.print("inorder traversal"+b.inorder());
			  System.out.print("postorder traversal"+b.postorder());
			 }}
			 
			 }
} 
			


	


