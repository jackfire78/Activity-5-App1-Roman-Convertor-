package com.example.jackf.romannumberconvertor;

import java.util.Hashtable;

public class NumberConvertor {

    public String toRoman(int numberInput){

        if(numberInput < 0 || numberInput > 10000){
            return "Sorry, I can't do that.";
        }
        String returnValue ="";

        while(numberInput >=1000){
            returnValue += "M";
            numberInput = numberInput - 1000;
        }
        while(numberInput >=500){
            returnValue += "D";
            numberInput = numberInput - 500;
        }
        while(numberInput >=400){
            returnValue += "CD";
            numberInput = numberInput - 400;
        }
        while(numberInput >=100){
            returnValue += "C";
            numberInput = numberInput - 100;
        }
        while(numberInput >=90){
            returnValue += "XC";
            numberInput = numberInput - 90;
        }
        while(numberInput >=50){
            returnValue += "L";
            numberInput = numberInput - 50;
        }
        while(numberInput >=40){
            returnValue += "XL";
            numberInput = numberInput - 40;
        }
        while(numberInput >=10){
            returnValue += "X";
            numberInput = numberInput - 10;
        }
        while(numberInput >=9){
            returnValue += "IX";
            numberInput = numberInput - 9;
        }
        while(numberInput >=5){
            returnValue += "V";
            numberInput = numberInput - 5;
        }
        while(numberInput >=4){
            returnValue += "IV";
            numberInput = numberInput - 4;
        }
        while(numberInput >=1){
            returnValue += "I";
            numberInput = numberInput - 1;
        }
        //return a string value of the number
        return returnValue;
    }

    public int toNumber(String numeral){
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        ht.put('I',1);
        ht.put('X',10);
        ht.put('C',100);
        ht.put('M',1000);
        ht.put('V',5);
        ht.put('L',50);
        ht.put('D',500);

        int intNum=0;
        int prev = 0;
        for(int i = numeral.length()-1; i>=0 ; i--)
        {
            int temp = ht.get(numeral.charAt(i));
            if(temp < prev)
                intNum-=temp;
            else
                intNum+=temp;
            prev = temp;
        }
        //return an integer of the number
        return intNum;
    }

}
