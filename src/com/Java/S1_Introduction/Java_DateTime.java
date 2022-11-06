package com.Java.S1_Introduction;

import java.time.LocalDate;
import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-date-and-time?isFullScreen=true
public class Java_DateTime {
    public static String getDay(String day, String month, String year) {
        /*
         * Write your code here.
         */
        LocalDate ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month),
                Integer.parseInt(day));
        return ld.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();

        System.out.println(getDay(day, month, year));
        sc.close();
    }
}
