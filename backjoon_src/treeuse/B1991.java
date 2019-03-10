package treeuse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B1991 {	
    public static void main(String[] args) throws IOException{
    	BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	    

    	int n = Integer.parseInt(BR.readLine());
    	
    	char[] value  = BR.readLine().replaceAll(" ","").toCharArray();

    	tree x =new tree(value[0], value[1], value[2]);
    	
    	for(int i=1; i<n; i++) {
    		value = BR.readLine().replaceAll(" ", "").toCharArray();
    		x.addN(value[0], value[1], value[2]);
    	}
    	
    	x.preOrder(x.root);
    	System.out.println();
    	x.inOrder(x.root);
    	System.out.println();
    	x.postOrder(x.root);
    }
}

class tnode{
	char value;
	tnode left;
	tnode right;
	
	public tnode(char value) {
		this.value = value;
	}
	
}
class tree{
	tnode root;
	public tree(char value, char left, char right) {
		root = new tnode(value);
		
		if(value != '.') 
			root =new tnode(value);
		
		if(left != '.') 
			root.left = new tnode(left);
		
		if(right != '.') 
			root.right = new tnode(right);
		
		
	}
	public void addN(char value, char left, char right) {
		next(root.left, value, left, right);
		next(root.right, value, left, right);
		
	}
	public void next(tnode node,char value, char left, char right) {
		if(node == null)
			return;
		if(node.value == value) {
			if(left != '.') 
				node.left = new tnode(left);
			
			if(right != '.') 
				node.right = new tnode(right);
			
		}else {
			next(node.left, value, left, right);
			next(node.right, value, left, right);

		}
	}
	public void preOrder(tnode node) {
		System.out.print(node.value);
		if(node.left !=null)
			preOrder(node.left);
		if(node.right != null)
			preOrder(node.right);
	}
	
	public void inOrder(tnode node) {
		if(node.left !=null)
			inOrder(node.left);
		
		System.out.print(node.value);

		if(node.right != null)
			inOrder(node.right);
	}
	public void postOrder(tnode node) {
		if(node.left !=null)
			postOrder(node.left);
		if(node.right != null)
			postOrder(node.right);
		System.out.print(node.value);

	}
}