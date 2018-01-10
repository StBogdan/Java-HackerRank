package com.Java.S2_Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_TagExtractor {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String pattern="<(.+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(line);
            boolean hasSeq = false;

            while(m.find()){
                    System.out.println(m.group(2));
                    hasSeq = true;
                }

            if(!hasSeq) {
                System.out.println("None");
                }

            testCases--;
        }
    }
}
