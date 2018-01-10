package com.Java.S4_DataStructures;

import java.util.Scanner;

public class Java_2Darray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        int maxHG = -9 * 7; //Min value for given constraints
        for (int i = 1; i<5; i++){
            for (int j = 1; j<5; j++){
                int currHG = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                                       + arr[i][j] +
                             arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1] ;
                if(currHG>maxHG){
                    maxHG=currHG;
                }
            }
        }
        System.out.println(maxHG);
    }
}
