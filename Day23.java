package com.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23{
    static void levelOrder(Node root){
        //Write your code here
        //I had actually overthought on this problem and i came up with a much more complex solution. Therefore i searched on google for the solution and this one to be the easiest. Credits go to Mr. Charles Wangkai.
        Queue<Node> queue = new LinkedList<Node>();
  		queue.offer(root);
  		while (!queue.isEmpty()) {
  			Node head = queue.poll();

  			if (head == null) {
  				continue;
  			}

  			System.out.print(head.data + " ");

  			queue.offer(head.left);
  			queue.offer(head.right);
  		}
  		System.out.println();
      }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
