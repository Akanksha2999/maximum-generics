package com.bridgelabz;

import java.util.Scanner;

public class Maximum {

    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to maximum string program");
        //Object created named Maximum
        Maximum obj = new Maximum();
        System.out.println("Maximum string among the three string is: " + obj.compareTo());
    }

    //compareTo method checks the max string among three strings and returns it
    public String compareTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three strings: ");
        String x = scanner.nextLine();
        System.out.println(x);

        String y = scanner.nextLine();
        System.out.println(y);

        String z = scanner.nextLine();
        System.out.println(z);

        String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;

        }
        return max;
    }
}
