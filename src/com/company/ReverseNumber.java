package com.company;

public class ReverseNumber {
    public static void main(String arg[])
    {
        int a = 324;
        int reverse = 0;
        int n=0;
        int temp = a;
        while(a>0){
            a=a/10;
            n++;
        }
        while(temp>0){
            int lastdigit = temp%10;
            reverse = (int) (reverse + lastdigit * Math.pow(10, n - 1));
            temp = temp/10;
            n--;
        }
        System.out.println(reverse);
    }
}
