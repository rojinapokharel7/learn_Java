package com.company;

public class CharacterCaseConversion {
    public static void main(String args[]){
       String inputString = "Rojina Pokharel";
        System.out.println(inputString.toUpperCase());
        //char [] inputArray = new char[5];
        char nameArray [] = inputString.toCharArray() ;
        char resultArray [] = new char[nameArray.length];
        for (int i = 0; i<nameArray.length; i++){
            //System.out.println(nameArray[i]);
            if (nameArray[i]>='a'&&nameArray[i]<='z'){
                resultArray[i] = (char) ((int)nameArray[i]-32);
            }
            if (nameArray[i]>='A'&&nameArray[i]<='Z'){
                resultArray[i] = (char) ((int)nameArray[i]+32);
            }
        }
        for (int i=0; i<resultArray.length; i++){
            System.out.print(resultArray[i]);
        }
    }
}
