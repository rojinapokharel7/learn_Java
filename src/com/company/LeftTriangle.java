package com.company;

public class LeftTriangle {
    public static void main(String arg[])
    {
        for(int i=1; i<=5; i++)
        {
            for(int k=1; k<=5-i+1; k++)
            {
                System.out .print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
