package com.Java.S3_BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Java_BigFract {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        Arrays.sort( s, (as, bs) ->
                {
                    BigDecimal bd = new BigDecimal(bs);
                    return bd.compareTo(new BigDecimal(as));
                }
            );

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
