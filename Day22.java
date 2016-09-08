package com.ThirtyDaysOfCode;

import java.util.Scanner;

/* Declare a node class as a node of a binary search tree */
class Node {
	/* Instance variables */
	/* Left and right nodes of the binary tree */
	Node left, right;
	/* Data for the node */
	int data;
	
	/* Constructor for the node */
	Node(int newData) {
		/* Initialize the node with the new data */
		data = newData;
		/* Start with both the left and right nodes empty (null) */
		left = null;
		right = null;
	}
}

public class Day22 {
	
	/* Get the max height of the binary tree, starting at root */
	public static int getHeight(Node root) {
		// Write your code here
		if (root == null) {
			return -1;
		}
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}
	
	/* Insert a Node onto the binary tree */
	public static Node insert (Node root, int data) {
		/* Is the tree empty? */
		if (root == null) {
			/* Return the new Node */
			return new Node(data);
		} else {
			/* Find the current node */
			Node current;
			/* Is this data less than the current nodes data? */
			if (data <= root.data) {
				/* Try to insert the data on the left node */
				current = insert(root.left, data);
				root.left = current;
			} else {
				/* Try to insert the data on the right node */
				current = insert(root.right, data);
				root.right = current;
			}
			/* return the current node after inserting the data */
			return root;
		}
	}

	public static void main(String[] args) {
		/* Instantiate a Scanner to read standard input */
		Scanner stdIn = new Scanner(System.in);
		
		/* Read the number of data values */
		int dataValues = stdIn.nextInt();
		
		/* Start with an empty binary tree */
		Node root = null;
		
		/* While there are more data values to read */
		while(dataValues-- > 0) {
			/* Read the next data item */
			int newData = stdIn.nextInt();
			/* Insert the new data into the tree */
			root = insert(root, newData);
		}
		
		/* Figure out the height of the tree */
		int height = getHeight(root);
		/* Print out the result */
		System.out.println(height);
		

	}

}
