package com.company;

public class NumberSwap {
    public static void main(String args[])
    {
        int x=5, y=10, z;
        System.out.println("before swapping x: "+x+ " y: "+y);
        z=x;
        x=y;
        y=z;
        System.out.println("after swapping x: "+x+ " y: "+y);
    }
}
