package com.ThirtyDaysOfCode;

import java.util.*;

class Calculator{
    public int power(int n,int p) throws Exception{
            if(n<0 || p<0)throw new Exception("n and p should be non-negative");
            else{
                int ans=1;
                for(int i=1;i<=p;i++){
                    ans = ans * n;
                }
                return ans;
            }
    }
}

class Day17{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
