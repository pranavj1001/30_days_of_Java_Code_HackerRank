package com.ThirtyDaysOfCode;

import java.util.*;

public class Day26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //variables
        int aDate, aMonth, aYear, eDate, eMonth, eYear, fine = 0, diff;
        Scanner sc = new Scanner(System.in);
        
        //Input
        aDate = sc.nextInt();
        aMonth = sc.nextInt();
        aYear = sc.nextInt();
        eDate = sc.nextInt();
        eMonth = sc.nextInt();
        eYear = sc.nextInt();
        
        //main logic
        if(aYear == eYear){
            if(aMonth == eMonth){
                 if(aDate == eDate){
                 }else if(aDate >= eDate){
                    diff = aDate - eDate;
                    fine = fine + (diff*15);
                 }
            }else if(aMonth >= eMonth){
                diff = aMonth - eMonth;
                fine = fine + (diff*500);
            }
        }else if(aYear >= eYear){
            fine = 10000;
        }
        
        //output
        System.out.println(fine);
        
        sc.close();
    }
}
