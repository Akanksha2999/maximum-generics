package com.bridgelabz;

//Generic class
public class Maximum {

    //Generic method which is comparing the given elements and returns maximum of it
    public static <T extends Comparable<T>> T maximum(T x, T y, T z, T a) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        if (a.compareTo(max) > 0) {
            max = a;

        }
        return max;
    }//Main method

    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d, %d and %d is %d \n\n", 50, 40, 20, 10, maximum(50, 40, 20, 10));
        System.out.printf("Maximum of %f, %f, %f and %f is %f \n\n", 3.5, 4.5, 5.5, 2.5, maximum(3.5, 4.5, 5.5, 2.5));
        System.out.printf("Maximum of %s, %s %s and %s is %s \n\n", "Apple", "Peach", "Banana", "Watermelon", maximum("Apple", "Peach", "Banana", "Watermelon"));
        System.out.printf("Maximum of %c, %c %c and %c is %c \n\n", 'a', 'b', 'd', 'c', maximum('a', 'b', 'd', 'c'));
    }
}