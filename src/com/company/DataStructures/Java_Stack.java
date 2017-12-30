package com.company.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            Stack<Character> chs = new Stack<>();
            Boolean matched = true;
            for(char c : input.toCharArray()){
                if( c == '[' || c=='(' || c=='{'){
                    chs.push(c); //Thank god for autoboxing
                }
                else{
                    char temp;
                    try {
                        temp = chs.pop();
                        if ((temp == '[' && c!=']') || (temp == '{' && c!='}' ) || (temp == '(' && c!=')')){
                               matched=false;
                               break;
                        }
                    }
                    catch (Exception e){
                        matched=false;
                        break;
                    }

                }
            }
            if(chs.size() != 0)         //If elements left,it's unmatched
                matched=false;
            System.out.println(matched);

        }

    }
}
