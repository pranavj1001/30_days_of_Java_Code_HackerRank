package com.ThirtyDaysOfCode;

import java.util.*;
import java.util.regex.*;
import java.util.Collections;

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String emailRegEx = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);
        List<String> myList = new ArrayList<String>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()){
                myList.add(firstName);
            }
        }
        Collections.sort(myList);
        for (String name : myList){
            System.out.println(name);
        }
        in.close();
    }
}
