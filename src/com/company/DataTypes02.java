package com.company;

import java.util.Scanner;
public class DataTypes02 {
    public static void main(String[] args){
        System.out.println("Write your character: ");
        Scanner sc= new Scanner (System.in);
        char name = sc.next().charAt(0);
        System.out.println("The character you have type is: "+name);
    }
}
