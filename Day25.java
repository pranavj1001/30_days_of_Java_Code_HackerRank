package com.ThirtyDaysOfCode;


import java.util.Scanner;

public class Day25 {

    static boolean isPrime(int number) {
        for(int i=2;i<=Math.sqrt(number);i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tests = sc.nextInt();
        for (int i = 0; i < Tests; i++) {
            int number = sc.nextInt();
            if (number >= 2 && isPrime(number)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            } 
            sc.close();
        }
    }
}
