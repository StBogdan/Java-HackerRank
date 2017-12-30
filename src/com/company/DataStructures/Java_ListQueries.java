package com.company.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_ListQueries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }
        int q=in.nextInt();
        in.nextLine();//Get the new line char
        for(int i=0;i<q;i++){
            String query = in.nextLine();
            if(query.compareTo("Insert") == 0){
                arr.add(in.nextInt(),in.nextInt());
            }
            else if(query.compareTo("Delete") == 0){
                int x = in.nextInt();
                arr.remove(x);
            }
            if(in.hasNext()){
                in.nextLine();//Get the new line char
            }
        }

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
