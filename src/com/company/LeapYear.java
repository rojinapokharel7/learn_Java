package com.company;

public class LeapYear {
    public static void main(String args[]){

        int currentYear = 2022;
        for (int i=0; i<=currentYear; i++){
            boolean isLeapyear = checkLeapYear(i);
            if(isLeapyear==true) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkLeapYear(int year){
        boolean isLeapyear;
        if(year%4==0){
            if(year%100!=0){
                isLeapyear=true;

            }else{
                if (year % 400 == 0){
                    isLeapyear=true;
                }else{
                    isLeapyear=false;
                }
            }
        }else{
            isLeapyear=false;
        }
        return isLeapyear;
    }
}
