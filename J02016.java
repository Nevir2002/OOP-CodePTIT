package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J02016 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            
            System.out.println(checkTriplet(a, n) ? "YES" : "NO");

        }

        sc.close();
    }
    
    private static boolean checkTriplet(long[] a, int n){
        
        Arrays.sort(a);
        for(int i = 2; i < n; i++){
            
            int l = 0, r = i-1;
            
            while(l < r){
                
                if(a[l]*a[l] + a[r]*a[r] == a[i]*a[i]) return true;
                if(a[l]*a[l] + a[r]*a[r] > a[i]*a[i]) r--;
                else l++;
                
            }
            
        }
        return false;
    }

}