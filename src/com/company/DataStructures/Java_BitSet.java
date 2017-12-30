package com.company.DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class Java_BitSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n,m;
        n=in.nextInt();
        m=in.nextInt();
        in.nextLine();

        BitSet[] bs = new BitSet[2];
        bs[0]=new BitSet(n);
        bs[1]=new BitSet(n);

        for(int i=0;i<m;i++){
            String[] query = in.nextLine().split(" ");
            String cmd = query[0];
            int s1,s2;
            s1=Integer.parseInt(query[1])-1;
            s2=Integer.parseInt(query[2])-1;

            if(cmd.compareTo("AND") == 0){
                bs[s1].and(bs[s2]);
            }
            else if(cmd.compareTo("OR") == 0){
                bs[s1].or(bs[s2]);
            }
            else if(cmd.compareTo("XOR") == 0){
                bs[s1].xor(bs[s2]);
            }
            else if(cmd.compareTo("FLIP") == 0){
                s2+=1;
                bs[s1].flip(s2);
            }
            else if(cmd.compareTo("SET") == 0){
                s2+=1;
                bs[s1].set(s2);
            }
            System.out.println(bs[0].cardinality()+ " "+ bs[1].cardinality());
        }
    }
}
