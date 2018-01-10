package Algorithms.Implementation;

import java.io.FileInputStream;
import java.util.Scanner;

public class GridSubPattern {

    static String gridSearch(String[] G, String[] P) {
            char[][] a = new char[G.length][G[0].length()];
            int an = G.length;
            int am= G[0].length();
            for(int i=0;i<G.length;i++){
                a[i]=G[i].toCharArray();
            }

            char[][] p = new char[P.length][P[0].length()];
            int pn= P.length;
            int pm=P[0].length();
            for(int i=0;i<P.length;i++){
                p[i]=P[i].toCharArray();
            }


            boolean pat = false;
            int ci,cj;

            for(int i=0;i<an;i++){
                for(int j=0;j<am;j++){
                    if(a[i][j] == p[0][0]){
                        //System.out.println("\n Possible match");
                        pat = true;
                        for(int k=0;k<pn && pat;k++){
                            for(int k2=0;k2<pm && pat;k2++){
                                ci=(i+k) % an;
                                cj=(j+k2) % am;
                                if(j+k2 == am){
                                    pat =false; //Prevent overflow that seems to be disliked by 5
                                }
                                if(a[ci][cj] != p[k][k2]){
                                    //System.out.println("Wrong as" + a[ci][cj] + " is not " + p[k][k2]);
                                    pat=false;
                                }
                            }
                        }
                        if(pat){
//                            System.out.println("Found at " +  i + " and " + j );
//                            for(int k=0;k<pn && pat;k++){
//                                for(int k2=0;k2<pm && pat;k2++){
//                                    ci=(i+k) % an;
//                                    cj=(j+k2) % am;
//                                        System.out.println("Right as " + a[ci][cj] + " "+ ci + ":" + cj+ " \t  " + p[k][k2]);
//                                }
//                            }

                            return "YES";
                        }

                    }
                }
            }
            return "NO";
    }

    public static void main(String[] args) throws  Exception {
        Scanner in = new Scanner(new FileInputStream("input.txt"));
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i = 0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i = 0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            String result = gridSearch(G, P);
            System.out.println(result);
        }
        in.close();
    }
}
