package com.Java.S6_Advanced;


import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Java_MD5 {
    public static void main(String []args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = (MessageDigest.getInstance("MD5"));
        Scanner in = (new Scanner(System.in));
        String msg = in.nextLine();
        byte[] digest = md.digest(msg.getBytes());
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

    }
}
