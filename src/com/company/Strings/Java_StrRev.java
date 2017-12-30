package com.company.Strings;

import java.util.Scanner;

public class Java_StrRev {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String revA = (new StringBuilder(A)).reverse().toString();
        if(A.compareTo(revA) == 0){
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}
