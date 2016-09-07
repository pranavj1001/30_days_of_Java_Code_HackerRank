package com.ThirtyDaysOfCode;


import java.util.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=1,ansf=1,i=0,remainder;
        int[] answerArray = new int[100];
        while(n > 0){
            remainder = n%2;
            n = n/2;
            answerArray[i] = remainder;
            i++;
        }
        for(i=0;i<answerArray.length-1;i++){
            if((answerArray[i]==1)&&(answerArray[i+1]==1)){
            ans++;
            if(ans>=ansf)ansf=ans;
            }else{
                ans=1;
            }
        }   
        System.out.println(ansf);
        in.close();
    }
}
