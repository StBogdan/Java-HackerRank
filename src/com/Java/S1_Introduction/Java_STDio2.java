package com.Java.S1_Introduction;

import java.util.Scanner;


// Link: https://www.hackerrank.com/challenges/java-stdin-stdout/problem
public class Java_STDio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Get past of line ending for second line
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
