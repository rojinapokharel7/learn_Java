package com.company;

public class LCMHCF {
    public int findLcm(int a,int b){
        if(a>b){
            if(a%b==0){
                return a;
            }
        }
        if(b>a){
            if(b%a==0){
                return b;
            }
        }
        return 0;
    }
}
