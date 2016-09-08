package com.ThirtyDaysOfCode;

//import java.lang.reflect.Method;

class Day21 {

    //E is just used as a paramter. It is used to make the code more robust.
    //Here, the task is to print both intArray and stringArray.
    //So the procedure is same but both of them are of different datatypes.
    //Therefore we have used Generics to implement the same method for both datatypes.

    static <E> void printArray(E[] array){
        for(E element : array){
            System.out.println(element);
        }
    }
    
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Day21.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
    
}


