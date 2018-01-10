package Algorithms.Implementation;

import java.util.Scanner;

public class CatAndMouse {
    static String[] catAndMouse(int x, int y, int z) {
        int da= Math.abs(x-z);
        int db= Math.abs(y-z);
        String[] ans = new String[2];
        ans[0]="Cat";
        if(da==db) {
            ans[0]="Mouse";
            ans[1]="C";
        }
        else if(da>db){
            ans[1]="B";
        }
        else
            ans[1]="A";
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            String[] result = catAndMouse(x, y, z);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
