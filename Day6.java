package com.ThirtyDaysOfCode;

import java.util.*;


public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] myString = new String[n+1];
        for(int i=0;i<n+1;i++){
            myString[i] = sc.nextLine();
        }
        for(int i=1;i<n+1;i++){
            String pre = new String();
            String suf = new String();
            char[] myCharArray = myString[i].toCharArray();
            for(int j=0;j<myString[i].length();j++){
                if(j%2==0){
                   char c = myCharArray[j];
                   pre += c;
                }else{
                   char c = myCharArray[j]; 
                   suf += c;
                }
            }
            System.out.println(pre+" "+suf);
            sc.close();
        }
    }
}