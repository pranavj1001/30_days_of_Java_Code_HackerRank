package com.ThirtyDaysOfCode;

import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Day15 {
	
	public static  Node insert(Node head,int data) {
		
        Node current = head;
        Node newNode = new Node(data);
        
        if (current == null){
            head = newNode;
        } else{
            while (current.next != null) {
            current = current.next;
        }
            current.next = newNode;
        }

        return head;
    }
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
	
	public static void delete(Node head,int n){
		Node delete = head;
		Node final1;
		int i = 0;
		while(++i<n){
			delete = delete.next;
		}
		final1 = delete.next;
		delete.next = final1.next;
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        int ans;

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        System.out.println("Want to delete?");
        if((ans = sc.nextInt())==1){
        	int n = sc.nextInt();
        	delete(head,n);
        }
        display(head);
        sc.close();
    }
}
