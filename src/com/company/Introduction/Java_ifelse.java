package com.company.Introduction;

import java.util.Scanner;

public class Java_ifelse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String ans="";

        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(2<=n && n<=5){
                ans = "Not Weird";
            }
            else if(n<=20){
                ans= "Weird";
            }
            else{
                ans = "Not Weird";
            }
            //Complete the code

        }
        System.out.println(ans);
    }
}
