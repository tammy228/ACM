import java.io.*;
import java.util.*;
public class no_483_B {
    
    public static void main(String[] args) throws IOException{
           Scanner in = new Scanner(System.in);
           
           int N = in.nextInt();

           int[][] dp = new int[N][N];
           int[][] dpMax = new int[N][N];
           int[] vals = new int[N];

           for(int i = 0; i < N; i++)
              vals[i] = in.nextInt();

           for(int i = 0; i < N; i++)
              for (int j = 0; j < N; j++)
                    dp[i][j]  = 0;

           for(int i = 0; i < N; i++)
               dp[i][i] = vals[i];

           for(int i = 1; i < N; i++) {
              for (int j = 0; j + i< N; j++) {
                  dp[j][j+i]  = dp[j][j+i-1] ^ dp[j+1][j+i];

              }
           }

           for(int i = 0; i < N; i++)
               for(int j = 0; j < N; j++)
                  dpMax[i][j] = -1;

           for(int i = 0; i < N; i++)
               dpMax[i][i] = vals[i];


        for(int i = 1; i < N; i++) {
            for (int j = 0; j + i< N; j++) {
                dpMax[j][j+i]  = Math.max(Math.max(dpMax[j][j+i-1], dpMax[j+1][j+i]), dp[j][j+i]);

            }
        }
        
           int Q = in.nextInt();

           int[][] queries = new int[Q][2];

           for(int i = 0; i < Q; i++) {
               queries[i][0] = in.nextInt() - 1;
               queries[i][1] = in.nextInt() - 1;
           }

           for(int i = 0; i < Q; i++)
               System.out.println(dpMax[queries[i][0]][queries[i][1]]);
           
    }
}