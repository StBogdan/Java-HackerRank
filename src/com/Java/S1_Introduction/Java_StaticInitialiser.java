package com.Java.S1_Introduction;

import java.util.*;

// Link: https://www.hackerrank.com/challenges/java-static-initializer-block/problem

public class Java_StaticInitialiser {

    public static int breadth, height;
    public static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        if (breadth <= 0 || height <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
        scanner.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = breadth * height;
            System.out.print(area);
        }

    }// end of main

}// end of class
