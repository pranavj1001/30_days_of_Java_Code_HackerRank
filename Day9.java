package com.ThirtyDaysOfCode;

import java.util.*;

public class Day9{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,fact=1;
        n=sc.nextInt();
        fact=factorial(n);
        System.out.println(fact);
        sc.close();
    }
    public static int factorial(int n){
        int fact = n;
        if(n==0||n==1){
            return 1;
        }else if(n<0){
            return 0;
        }else{
            fact = fact*factorial(n-1);
            return fact;
        }
    }
}
