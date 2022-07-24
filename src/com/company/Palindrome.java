package com.company;

public class Palindrome {
    public static void main(String args[])
    {
        int a=121;
        int temp=a;
        int reverseNumber=0;
        while(a!=0){
            int mod = a%10;
            reverseNumber = reverseNumber*10+mod;
            a=a/10;
        }
        System.out.println(reverseNumber);

        if(temp==reverseNumber)

        {
            System.out.println("This number " + temp +" is palindrome");
        }
    }
}
