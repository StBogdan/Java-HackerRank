package com.company.DataStructures;

import java.util.Scanner;

public class Java_Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= in.nextInt();
        }
        int negSubArr = 0;

        for(int i=1;i<=n;i++){           //For all subarray sizes
            for(int j=0;j<n-i+1;j++){   //For all subarrays of that size ('s start poz)
                int csum =0;
                for(int k=0;k<i;k++){  // Calculate the sum
                    csum+=arr[j+k];
                }
                if(csum<0){
                    negSubArr+=1;
                }
            }
        }

        System.out.println(negSubArr);
    }

}
