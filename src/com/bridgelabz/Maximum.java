package com.bridgelabz;

import java.util.Scanner;

public class Maximum {

    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to maximum number program");
        //Object created named Maximum
        Maximum obj = new Maximum();
        System.out.println("Maximum number among the float numbers is: " + obj.compareTo());
    }

    //compareTo method checks the max number among three numbers and returns it
    public Float compareTo() {
        //Scanner to take three numbers from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three float number");
        Float x = scanner.nextFloat();
        Float y = scanner.nextFloat();
        Float z = scanner.nextFloat();
        Float max = x;
        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        } else {
            max = z;
        }
        return max;
    }
}
