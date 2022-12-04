package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int b,c,d,e,sum;
        b=(number%1000)/100;  
        c=number/1000; 
        e=(number%100)/10; 
        d=number%10; 
        sum=b+c+d+e;
        System.out.println(sum);
    }
}
