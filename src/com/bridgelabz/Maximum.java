package com.bridgelabz;

import java.util.Scanner;

public class Maximum {

    //Main method
    public static void main(String[] args) {
        //Object created named Maximum
        Maximum obj = new Maximum();
        System.out.println("Maximum number among the integer numbers is: " + obj.compareTo());
    }

    //compareTo method checks the max number among three numbers and returns it
    public Integer compareTo() {
        //Scanner to take three numbers from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three number");
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer z = scanner.nextInt();
        Integer max = x;
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
