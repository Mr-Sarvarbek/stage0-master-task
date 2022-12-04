package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        
       if(month>=1&&month<=12&&year>0){
        if(((month<8&&month%2!=0))||(month>=8&&month%2==0))
            System.out.println(31);
        if(((month<8&&month%2==0&&month!=2))||(month>8&&month%2!=0))
            System.out.println(30);
        if(month==2)
            System.out.println(28);}
        else
            System.out.println("invalid date");
       

    }
}
