package com.Java.S3_BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInt {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger a  = new BigInteger(in.nextLine());
        BigInteger b  = new BigInteger(in.nextLine());
        BigInteger sum   = BigInteger.ZERO.add(a).add(b);
        BigInteger product = BigInteger.ONE.multiply(a).multiply(b);
        System.out.println(sum);
        System.out.println(product);
    }
}
