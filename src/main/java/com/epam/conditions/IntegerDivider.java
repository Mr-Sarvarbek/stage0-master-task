package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int dividen =dividend/divider;
        if(divider!=0)
            if(divider*dividen==dividend)
                System.out.println("can be divided completely");
            else
                System.out.println("cannot be divided completely");
        if(divider==0)
            System.out.println("division by zero");
    }
}
