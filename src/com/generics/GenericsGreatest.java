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


    public T getVal1() {
        return Val1;
    }

    public void setVal1(T val1) {
        Val1 = val1;
    }

    public T getVal2() {
        return Val2;
    }

    public void setVal2(T val2) {
        Val2 = val2;
    }

    public T getVal3() {
        return Val3;
    }

    public void setVal3(T val3) {
        Val3 = val3;
    }

    /*
     * Method to define the greatest integer
     */

    public int findMaximum(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        return max;


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
        System.out.println("Enter first integer");

        int a = sc.nextInt();

        System.out.println("Enter second integer");

        int b = sc.nextInt();

        System.out.println("Enter third integer");

        int c = sc.nextInt();

        /*
         * To create generic class object
         */

        IntGenerics<Integer> gen1 = new IntGenerics(a, b, c);

        /*
         * To call method findMaximum();
         */

        System.out.println("Maximum number is " + gen1.findMaximum(gen1.getVal1(), gen1.getVal2(), gen1.getVal3()));

    }
}
