package com.Java.S2_Strings;

import java.util.Scanner;

public class Java_StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            s=s.replaceAll("[!,?._'@]+"," ");   //Remove evil other separators
            s=s.trim();                                         //Remove evil leading spaces
            String[] tokens = s.split("[ ]+");

            int len = tokens.length; //Listen, this would be REALLY easy in python
            if(tokens[0].compareTo("")==0){
                for(int i=1;i<tokens.length;i++){
                   tokens[i-1]=tokens[i];
                }
                len-=1;
            }

            System.out.println(len);
            for(int i=0;i<len;i++){
                System.out.println(tokens[i]);
            }
           }

    }
}
