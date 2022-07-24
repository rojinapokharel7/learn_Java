package com.company;

import java.util.Scanner;
public class Fibonacci {
    public static void main (String args[])
    {
//        1,1,2,3,5,8
        int previous=1, current=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.print(previous + " ");
        while(current<n){
            int temp=current;
            System.out.print(current + " ");
            current=current+previous;
            previous=temp;
        }

    }
}
