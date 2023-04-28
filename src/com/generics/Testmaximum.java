package com.generics;

import java.util.Scanner;

public class Testmaximum {
    static Scanner scan = new Scanner(System.in);

    public void findInteger(Integer X, Integer Y, Integer Z)
    {

        if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
            System.out.println(" First largest value is: " + X);
        } else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
            System.out.println(" Second largest value is:" + Y);
        } else
            System.out.println(" Third is largest" + Z);
    }

    public void findfloat(Float X, Float Y, Float Z)
    {

        if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
            System.out.println(" First largest float value is: " + X);
        } else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
            System.out.println(" Second largest float value is:" + Y);
        } else
            System.out.println(" Third largest float value is" + Z);
    }

    public void findstring(String X, String Y, String Z)
    {
        if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
            System.out.println(" First String is: " + X);
        } else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0)
        {
            System.out.println(" Second String is:" + Y);
        } else
            System.out.println(" Third String is" + Z);
    }

    public <T extends Comparable<T>> void extendmax(T X, T Y, T Z)
    {
        if(X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
            System.out.println(" First is largest "+X);
        }
        else if(Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
            System.out.println(" Second is largest"+Y);
        }
        else
            System.out.println(" Third is largest : "+Z);

    }


    public static void main(String[] args) {
        Testmaximum test = new Testmaximum();
        test.extendmax("apple", "Peach", "banana");

    }

}
