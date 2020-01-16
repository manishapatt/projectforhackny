package projectforhackNY;

import java.io.File;
import java.util.Scanner;


public class BST {


	public static void main(String args[]) throws Exception  {
		
		BST dictionary = new BST();

		File file = new File("/Users/Manisha/Desktop/352 Project Files/dictionary.txt");
		
		//Scanner scan = new Scanner(File);
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNext()) {
			String key = scan.next();
			dictionary.put(key);
		}
		
		scan.close(); 
		
		// dictionary.isOrdered(); 
		
		//dictionary.get("again");
		
		if (dictionary.get("again") == true) {
		System.out.println("True");  
		}
}


	Node root = null;
	// Now we put methods that belong to class 
	
	public boolean put(String word) {
		//boolean so that we know if it worked or not
		if (root==null) {
			root = new Node(word);
			return true;
		}
		else {
			return root.put(word);
		}		
	}
	
	public boolean get(String word) {
		if (root == null) {
			return false; 
		}
		else {
			return root.get(word);
		}
	}
	
	public void isOrdered() {
		if (root != null) {
			System.out.println("isOrdered: ");
			root.isOrdered(); 
		}
	}
	

	
	public class Node{ 
		public String val; 
		public Node left;
		public Node right;
		
		public Node(String word) {
			val = word;
		}
		public boolean put(String word) { 
			boolean isPut = false;
			int cmp = word.compareTo(val);
			
			if (val == null) {
				val = word; 
				isPut = true;
			}	
			else { 
				if (cmp < 0) {
					if (left == null) {
						left = new Node(word);
						
						isPut = true; 
					}
					else {
						isPut = left.put(word);
					}
				}
				
				else if (cmp > 0) {
					if (right == null) {
						right = new Node(word); 
						
						isPut = true;
					}
					else {
						isPut = right.put(word);
					}
				}	
//for this BST, no need to do cmp == 0 because there are no repeated words in the dictionary file 
			}
				return isPut; 
		}
		
		public boolean get(String word) {
			boolean isGet = false;
			int cmp = word.compareTo(val);
			
			if (val == null) {
				return isGet;  
			}
			else {
				if (cmp == 0) {
					isGet = true; 
				}
				else if ( cmp < 0 && left != null) {
					isGet = left.get(word); 
				}
				else if ( cmp > 0 && right != null) {
					isGet = right.get(word); 
				}
				return isGet; 
			}
			//return isGet; 
		}
		
		
		public void isOrdered() {
			if (this.val != null) {
				if (this.left != null) {
					this.left.isOrdered();
				}
			
			
			System.out.println(this.val);
			if (this.right != null) {
				this.right.isOrdered(); 
			}
		}
	 }	
		
		
}
	
}
