package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J02035 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){ 
                
                a[i] = sc.nextInt();
                
            }
            
            System.out.println(check(a,n));
            
        }

        sc.close();
    }
    
    private static int check(int[] a, int n){
        
        int res = 0;
        
        for(int i = 0; i < n-1; i++){
            
            if(a[i] > a[i+1]){
                
                res = i+1;
                break;
                
            }
            
        }
        
        return res;
    }

}