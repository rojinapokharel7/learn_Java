package com.company;

public class PrimeNumber {
    public static void main(String args[]){
        int a= 35;
        int count=0;
        for(int i = 1; i <= a; i++)
        {
            if (a%i == 0){
             count++;
            }
        }
        if(count==2){
            System.out.println("This number  " +a+ " is prime ");

        }
        else {
            System.out.println("This number "+a+ " is not prime ");
        }
    }
}
