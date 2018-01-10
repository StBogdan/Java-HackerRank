package com.Java.S4_DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_ArrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
            int cn = in.nextInt();
            for(int j=0;j<cn;j++){
                arr.get(i).add(in.nextInt());
            }
        }

        int q =in.nextInt();
        for(int i=0;i<q;i++){
            int x,y;
            x=in.nextInt();
            y=in.nextInt();
            try {
                System.out.println(arr.get(x-1).get(y-1));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
