package com.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String st,sf;

        /* Read and save an integer, double, and String to your variables.*/
        i2=scan.nextInt();
        d2=scan.nextDouble();
        scan.nextLine();
        st=scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        s=s.concat(st);
        System.out.println(s);
        scan.close();
    }
}
