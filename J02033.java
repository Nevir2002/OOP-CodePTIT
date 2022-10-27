package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J02033 {

    public static void main(String[] args){

        int n,k;
        Scanner sc;
        sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n];
        long res = 0;
        int negCount = 0, zeroCount = 0;
        for(int i = 0; i < n; i++){
            
            a[i] = sc.nextInt();
            res += a[i];
            if(a[i] == 0) zeroCount++;
            if(a[i] < 0) negCount++;
            
        }
        Arrays.sort(a);
        int i = 0;
        if(zeroCount == 0){
            
            if(k <= negCount){
                
                while(i < k) res -= 2*a[i++];
                
            } else{
                
                k -= negCount;
                while(i < negCount) res -= 2*a[i++];
                if(k%2 != 0){
                    
                    if(i == 0) res -= 2*a[i];
                    else res -= 2*Math.min(Math.abs(a[i]), Math.abs(a[i-1]));
                    
                }
                
            }
            
        } else{
            
            k = Math.min(k,negCount);
            while(i < k) res -= 2*a[i++];
                
        }
        System.out.println(res);
        
    }

}