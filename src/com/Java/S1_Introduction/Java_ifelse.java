package com.Java.S1_Introduction;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-if-else?isFullScreen=true
public class Java_ifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ans = "";

        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (2 <= n && n <= 5) {
                ans = "Not Weird";
            } else if (n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
            // Complete the code

        }
        System.out.println(ans);
        sc.close();
    }
}
