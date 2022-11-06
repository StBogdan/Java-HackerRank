package com.Java.S1_Introduction;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
public class Java_Loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inInt = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(inInt + " x " + i + " = " + (inInt * i));
        }
    }

}
