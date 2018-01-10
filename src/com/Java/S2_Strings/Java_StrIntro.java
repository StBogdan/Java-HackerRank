package com.Java.S2_Strings;

import java.util.Scanner;

public class Java_StrIntro {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println((A.length()+B.length()));
        System.out.println( (A.compareTo(B) > 0) ? "Yes" : "No");

         A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
         B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
         System.out.println(A+ " " + B);
    }
}
