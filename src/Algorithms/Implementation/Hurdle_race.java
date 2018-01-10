package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Hurdle_race {
    static int hurdleRace(int k, int[] height) {
        int[] h = height.clone();

        int max=-1;
        for(int indH : h){
            if(indH>max) max=indH;
        }

        if(k> max){
            return 0;
        }
        else
            return max-k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
