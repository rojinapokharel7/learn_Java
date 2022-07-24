package com.company;

public class FactorialNumber {
    public static void main(String args[]){
        int num = 5;
        int fact=1;
        while(num>0)
        {
            fact = fact * num;
            num--;
        }
        //fact = 10*9*8*7*..........*1
        System.out.println(fact);
    }
}
