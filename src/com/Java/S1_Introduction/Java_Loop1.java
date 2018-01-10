package com.Java.S1_Introduction;

import java.util.Scanner;

public class Java_Loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(N + " x " + i + " = " + (N*i));
        }
    }

}
