package com.company;

public class PatternThree {
    public static void main(String args[])
    {
        int rows=5;
        for(int i=0; i<rows-1; i++)
            {
               for(int j=rows-i-1;j>0;j--) {
                   System.out.print(" ");
               }
               for(int k=0;k<i+1;k++) {
                   System.out.print("*");
               }
                for(int k=0;k<i;k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

