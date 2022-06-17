package com.bridgelabz;

import java.util.Scanner;

public class Maximum {

    //Generic method which is comparing the given elements and returns maximum of it
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;

        }
        return max;
    }//Main method

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d \n\n", 50, 40, 20, maximum(50, 40, 20));
        System.out.printf("Maximum of %f, %f and %f is %f \n\n", 3.5, 4.5, 5.5, maximum(3.5, 4.5, 5.5));
        System.out.printf("Maximum of %s, %s and %s is %s \n\n", "Apple", "Peach", "Banana", maximum("Apple", "Peach", "Banana"));
    }
}
