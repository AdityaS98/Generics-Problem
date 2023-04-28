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

    public float findMaximum(float a, float b, float c) {
        float max = Math.max(Math.max(a, b), c);
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
        System.out.println("Enter first decimal value");

        float a = sc.nextFloat();

        System.out.println("Enter second decimal value");

        float b = sc.nextFloat();

        System.out.println("Enter third decimal value");

        float c = sc.nextFloat();

        /*
         * To create generic class object
         */

        IntGenerics<Float>gen1 = new IntGenerics(a, b, c);

        /*
         * To call method findMaximum();
         */

        System.out.println("Maximum number is " + gen1.findMaximum(gen1.getVal1(), gen1.getVal2(), gen1.getVal3()));

    }
}
