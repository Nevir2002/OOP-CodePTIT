package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J02023 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if(k > n*9 || k <= 0) System.out.println("-1 -1");
        else System.out.println(genMin(n,k) + " " + genMax(n,k));

        sc.close();
    }
    
    private static String genMin(int n, int k){
        
        int[] res = new int[n];
        res[0] = 1;
        for(int x = 1; x < n; x++) res[x] = 0;
        k--;
        int i = n-1;
        while(k > 0 && i >= 0){
            
            int t = (k>9) ? 9 : k;
            res[i--] += t;
            k -= t;
            
        }
        
        String s = "";
        for(int x = 0; x < n; x++) s += String.valueOf(res[x]);
        
        return s;        
    }
    
    private static String genMax(int n, int k){
                     
        String s = "";
        for(int i = 0; i < n; i++){
            
            int t = (k>9)?9:k;
            k -= t;
            s += String.valueOf(t);
            
        }
        
        return s;        
    }

}