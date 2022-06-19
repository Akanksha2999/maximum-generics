package com.bridgelabz;

import java.util.Arrays;

//Generic class
public class Maximum<T> {

    //Method to sort the array to get the maximum element
    public T testCase(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
        return max;
    }

    //Method to print the maximum values
    private void printMax(T max) {
        System.out.println("Maximum among the following is: " + max);
    }

    //Main method to initialize the variables
    public static void main(String[] args) {
        Maximum<Integer> integerMaximum = new Maximum<>();
        Maximum<Float> floatMaximum = new Maximum<>();
        Maximum<String> stringMaximum = new Maximum<>();
        integerMaximum.testCase(50, 40, 20, 10);
        floatMaximum.testCase(3.5f, 4.5f, 5.5f, 2.5f);
        stringMaximum.testCase("Apple", "Peach", "Banana", "Watermelon");
    }
}