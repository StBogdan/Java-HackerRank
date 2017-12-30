package com.company.Strings;

import java.util.Scanner;

public class Java_SubStrComp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,0+k);
        largest= s.substring(0,0+k);

        for(int i=0;i<=s.length()-k;i++) {
            String now = s.substring(i, i + k);
            if (now.compareTo(largest) > 0) {
                largest = now;
            }

            if (now.compareTo(smallest) < 0) {
                smallest = now;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }


}
