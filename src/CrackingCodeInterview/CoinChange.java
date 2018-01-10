package CrackingCodeInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoinChange {
    static long[][] mem;

    public long partWays(int[] coins,int n, int minCoin){

        if(n<0){
           // System.out.println("OH no negative");
            return 0;
        }
        else if(n==0){
           // System.out.println("Got one");
            return 1;
        }
        else if(mem[n][minCoin]!=-1) {
            //System.out.println("GOt from mem " + n + " is part in ways " + mem.get(n));
            return mem[n][minCoin];
        }
        else{
            long ways=0;
            for(int i=minCoin;i<coins.length;i++){
               // System.out.println("Considering "+ coins[i] + " for "+n+ " with coin min: "+ minCoin);
                ways+=partWays(coins,n-coins[i],i);
                //System.out.println();
            }
            mem[n][minCoin]=ways;
            return ways;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        mem= new long[n+1][m];
        for(int i=0;i<=n;i++){
            for(int j=0;j<m;j++){
                mem[i][j]=-1;
                mem[0][j]=1;
            }

        }
        System.out.println((new CoinChange()).partWays(coins,n,0));
    }
}
