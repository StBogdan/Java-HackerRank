package com.Java.S2_Strings;
import java.util.*;


public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap<Character,Integer> occurenceA = new HashMap<>();
        HashMap<Character,Integer> occurenceB = new HashMap<>();

        for(char c : a.toLowerCase().toCharArray()){
            if(occurenceA.containsKey(c))
                occurenceA.put(c,occurenceA.get(c)+1);
            else
                occurenceA.put(c,1);
        }

        for(char c : b.toLowerCase().toCharArray()) {
            if (occurenceB.containsKey(c))
                occurenceB.put(c, occurenceB.get(c) + 1);
            else
                occurenceB.put(c, 1);
        }

        return occurenceA.equals(occurenceB);
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
