package com.generics;

import java.util.Scanner;

/**
 * This program is for calculating teh greatest of three integers
 */

class IntGenerics<T> {
    private T Val1;
    private T Val2;
    private T Val3;

    public IntGenerics(T Val1, T Val2, T Val3) {
        super();

        this.Val1 = Val1;
        this.Val2 = Val2;
        this.Val3 = Val3;


    }

    /*
     * To define getters and setters
     */


    public String getVal1() {
        return (String) Val1;
    }

    public void setVal1(T val1) {
        Val1 = val1;
    }

    public String getVal2() {
        return (String) Val2;
    }

    public void setVal2(T val2) {
        Val2 = val2;
    }

    public String getVal3() {
        return (String) Val3;
    }

    public void setVal3(T val3) {
        Val3 = val3;
    }

    /*
     * Method to define the greatest integer
     */

    public String findMaximum(String a, String b, String c) {
        String longest = a;
        if (b.length() > longest.length()) {
            longest = b;
        }
        if (c.length() > longest.length()) {
            longest = c;
        }
        return longest;
    }


}




/*
 * Creating a main method
 */

public class GenericsGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Creating input for three variables.
         */
        System.out.println("Enter first Word");

        String a = sc.next();

        System.out.println("Enter second Word");

        String b = sc.next();

        System.out.println("Enter third Word");

        String c = sc.next();

        /*
         * To create generic class object
         */

        IntGenerics<Float> gen1 = new IntGenerics(a, b, c);

        /*
         * To call method findMaximum();
         */

        System.out.println("Character having maximum letters is " + gen1.findMaximum(gen1.getVal1(), gen1.getVal2(), gen1.getVal3()));

    }
}
