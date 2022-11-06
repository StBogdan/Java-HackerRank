package com.Java.S1_Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-currency-formatter/problem
public class Java_CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        String us = usFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        String india = indiaFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
