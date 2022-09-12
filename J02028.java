package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J02028 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){ 
                
                a[i] = sc.nextLong();
                
            }
            
            System.out.println(found(a,k,n)?"YES":"NO");
            
        }

        sc.close();
    }
    
    private static boolean found(long[] a, long sum, int n){
        
        int start = 0;
        long currSum = a[0];
        
        for(int i = 1; i < n; i++){
            
            currSum += a[i];
            while(currSum > sum && start < i) currSum -= a[start++];
            if(currSum == sum) return true;
            
        }
        
        return false;
    }

}