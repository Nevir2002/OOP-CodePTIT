package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J02027 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            
            for(int i = 0; i < n; i++){
                
                res += upperBound(a, a[i]+k-1) - i-1;
                
            }
            
            System.out.println(res);
            
        }

        sc.close();
    }
    
    private static int upperBound(int[] a, int key){
        
        int index = Arrays.binarySearch(a, key);
        if(index < 0) return Math.abs(index)-1;
        else{
            
            while(index < a.length){
                
                if(a[index] == key) index++;
                else return index;
                
            }
            return index;
        }
        
    }

}