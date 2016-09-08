package com.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16 {

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in))
            {
              int n=Integer.parseInt(sc.nextLine());
              System.out.println(n);

            }
        catch(NumberFormatException e)
            {
              System.out.println("Bad String");
            }
    }
}
