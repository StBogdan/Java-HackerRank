package com.Java.S1_Introduction;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-output-formatting/problem
public class Java_OutputFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = String.format("%1$-15s", sc.next());
            int x = sc.nextInt();
            String s2 = String.format("%03d", x);
            // Complete this line
            System.out.println(s1 + s2);
        }
        System.out.println("================================");
        sc.close();
    }
}
