package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J02102 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];
        Vector<Integer> v = new Vector<>();
        for(int i = 0; i < n*n; i++) v.add(sc.nextInt());
        Collections.sort(v);
        int cnt = 0;
        int l = 0, r = n-1, u = 0, d = n-1;
        while(true){
            
            for(int i = l; i <= r; i++){
                
                a[u][i] = v.get(cnt++);
                
            }
            u++;
            if(cnt >= n*n) break;
            for(int i = u; i <= d; i++){
                
                a[i][r] = v.get(cnt++);
                
            }
            r--;
            for(int i = r; i >= l; i--){
                
                a[d][i] = v.get(cnt++);
                
            }
            d--;
            if(cnt >= n*n) break;
            for(int i = d; i >= u; i--){
                
                a[i][l] = v.get(cnt++);
                
            }
            l++;
            
        }
        
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n; j++){
                
                System.out.print(a[i][j] + " ");
                
            }
            System.out.println();
            
        }
        
        sc.close();
    }

}