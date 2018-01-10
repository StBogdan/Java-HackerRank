package com.Java.S1_Introduction;
import java.util.*;


public class Java_StaticInitialiser {

    public static int B,H;
    public static boolean flag = true;

    static {
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if( B <=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag= false;
        }
        else {
            flag= true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
