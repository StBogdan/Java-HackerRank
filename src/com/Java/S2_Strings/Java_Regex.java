package com.Java.S2_Strings;

import java.util.Scanner;

public class Java_Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}


class MyRegex{
    String numRange="([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = numRange+"."+numRange+"."+numRange+"."+numRange;
}
