package com.Java.S4_DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Java_Dequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int maxUniq = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int num = in.nextInt();
            deque.add(num);
            hs.add(num);


            if (deque.size() == m) {
                if (hs.size() > maxUniq)
                    maxUniq = hs.size();

                int fe = (int) deque.pollFirst();
                if (!deque.contains(fe))
                    hs.remove(fe);
            }
        }

        if (hs.size() > maxUniq) {
            maxUniq = hs.size();
        }

        System.out.println(maxUniq);
    }
}
