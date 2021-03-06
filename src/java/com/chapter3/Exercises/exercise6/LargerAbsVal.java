package com.chapter3.Exercises.exercise6;

public class LargerAbsVal {
    /*
    Write a method called largerAbsVal
    that takes two integers as parameters and returns the larger of the two absolute values.
    A call of largerAbsVal(11, 2) would return 11, and a call of largerAbsVal(4, -5) would return 5.
     */

    public static void main(String[] args){
        largerAbsVal(11, 2);
    }

    public static void largerAbsVal(int x, int y){
        int z = 0;
        x = Math.abs(x);
        y = Math.abs(y);
        z = Math.max(x,y);
        System.out.print(z);
    }

}
