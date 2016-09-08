package com.ThirtyDaysOfCode;

import java.util.*;

public class Day18 {
    // Write your code here.
    
    char[] stack = new char[100];
    char[] queue = new char[100];
    int i = 0,j = 0,k = 0;
    
    void pushCharacter(char c){
        stack[i] = c;
        i++;
    }
    
    void enqueueCharacter(char c){
        queue[j] = c;
        j++;
    }
    
    char popCharacter(){
        i--;
        if(i>=0){
            char x = stack[i];
            return x;
        }else{
            return 0;
        }
    }
    
    char dequeueCharacter(){
        if(k<=j){
            char x = queue[k];
            k++;
            return x;
        }else{
            return 0;
        }
    
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}