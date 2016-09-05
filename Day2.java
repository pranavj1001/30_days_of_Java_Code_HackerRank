package com.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day2 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip=0.0,tax=0.0,tp,tx;
        tp = (double) tipPercent;
        tx = (double) taxPercent;
        tip = mealCost*(tp/100);
        tax = mealCost*(tx/100);
        mealCost = mealCost + tip + tax;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost);
      
        // Print your result
        System.out.println(totalCost);
    }

}
