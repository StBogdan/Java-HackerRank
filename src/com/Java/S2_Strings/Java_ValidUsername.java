package com.Java.S2_Strings;

import java.util.Scanner;

public class Java_ValidUsername {



    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[A-Z|a-z]\\w{7,29}";
}
