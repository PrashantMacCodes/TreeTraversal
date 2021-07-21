package com.prashant.tree;

import java.util.ArrayList;
import java.util.List;

class Node {
	Node right;
	Node left;
	int data;
	
	public Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

}

class LeftView {
	
	int maxLevel=0;
	
	public void leftView(Node root, int currentLevel, List<Integer> result) {
		if(null==root) {
			return;
		}
		
		if(maxLevel<currentLevel) {
			result.add(root.data);
			maxLevel=currentLevel;
		}
		leftView(root.left, currentLevel+1, result);
		leftView(root.right, currentLevel+1, result);

		
	}
}

public class Main {
	
	public static void main(String[] args) {
	
		Node root = new Node(1);
		root.right = new Node(3);
		root.left = new Node(2);
		
		root.left.left= new Node(4);
		root.left.right = new Node(5);
		
		root.right.right = new Node(6);
		root.right.left = new Node(7);

		
		root.right.right.right = new Node(8);
		root.right.right.left = new Node(9);

		root.right.right.right.right = new Node(10);

		
		
		List<Integer> result = new ArrayList<Integer>();
		
		LeftView instance = new LeftView();
		instance.leftView(root, 1 , result);
		
		result.forEach(System.out :: println);
	}
}

/*
 * 			1
 * 		2		3
 * 	  4	  5   7   6
 * 			    9	8
 * 						10
 * 
 * Left view : 1,2,4,9,10
 * 
 * 
 */



