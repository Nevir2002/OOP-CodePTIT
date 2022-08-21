package codeptit;

import java.util.Scanner;

public class J02103 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int cnt = 1;
        while(t-- != 0){
            System.out.println("Test " + cnt++ + ":");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            for(int i = 0; i < m; i++){
                
                for(int j = 0; j < n; j++) a[i][j] = sc.nextInt();
                
            }
            
            int[][] res = calc(a,m,n);
            
            for(int i = 0; i < m; i++){
                
                for(int j = 0; j < m; j++){
                    
                    System.out.print(res[i][j] + " ");
                    
                }
                System.out.println();
            }
            
        }

        sc.close();
    }

    private static int[][] calc(int[][] a, int m, int n){
        
        int[][] res = new int[m][m];
        
        for(int i = 0; i < m; i++){
            
            for(int j = 0; j < m; j++){
                
                res[i][j] = 0;
                for(int k = 0; k < n; k++) res[i][j] += a[i][k]*a[j][k];
                
            }
            
        }
        
        return res;
        
    }

}