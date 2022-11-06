package com.Java.S1_Introduction;

import java.util.ArrayList;
import java.util.Scanner;

//Link: https://www.hackerrank.com/challenges/java-end-of-file/problem
public class Java_EOF {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
         * named Solution.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();


        while (sc.hasNext()) {
            lines.add(sc.nextLine());
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + " " + lines.get(i));
        }
        sc.close();
    }
}
