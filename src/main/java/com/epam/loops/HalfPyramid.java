package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int c = 0; c < cathetusLength; c++) {
                if(c<cathetusLength-(i+1))
                {
                    System.out.print(" ");
                }else System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
