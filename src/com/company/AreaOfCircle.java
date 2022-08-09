package com.company;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        float PI =3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius = sc.nextFloat();
        float aoc = PI* (radius * radius);
        System.out.println("The area of circle is" +aoc);
    }
}
