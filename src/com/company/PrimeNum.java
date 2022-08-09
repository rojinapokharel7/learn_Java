package com.company;

public class PrimeNum {
    public static void main(String args[]) {
        for ( int i = 2; i <= 100; i++) {
           boolean isPrime = checkPrimeNumber(i);
           if (isPrime){
               System.out.print(i+ " , ");
           }
        }
    }
    public static boolean checkPrimeNumber(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }else{
            return false;
        }
    }
}
