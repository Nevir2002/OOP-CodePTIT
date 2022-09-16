package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J020356 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if(k <= 0 || k > 9*n){
            
            if(k == 0 && n == 1) System.out.println("0 0");
            else System.out.println("-1 -1");
            
        } else{
            
            System.out.println(getMin(n,k) + " " + getMax(n,k));
            
        }

        sc.close();
    }

    private static String getMin(int n, int k){
        
        String res = "";
        int[] a = new int[n];
        a[0] = 1;
        k--;
        int i = n-1;
        while(k > 0 && i > 0){

            a[i--] = k>=9?9:k;
            k -= k>=9?9:k;
            
        }
        
        a[0] += k;
        for(int x = 0; x < n; x++) res += a[x];
        
        return res;
        
    }
    
    private static String getMax(int n, int k){
        
        String res = "";
        int[] a = new int[n];
        int i = 0;
        while(k > 0){
            
            a[i++] = k>=9?9:k;
            k -= k>=9?9:k;
            
        }
        
        for(int x = 0; x < n; x++) res += a[x];
        
        return res;
        
    }
    
}