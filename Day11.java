package com.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int sum = 0, sumf = 0;
        int k = 0,max;
        int[] sum = new int[16];
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                //if(sum>=sumf)sumf=sum;
                k++;
            }
        }
        max = sum[0];
        for(k=1;k<16;k++){
            if(max<=sum[k])max=sum[k];
        }
        System.out.println(max);
        in.close();
    }
}
