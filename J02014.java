package codeptit;

import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class J02014 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- != 0){
            
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;

            for(int i = 0; i < n; i++){
                
                a[i] = sc.nextInt();
                sum += a[i];
                
            }
            
            System.out.println(check(a,n,sum));
                
        }
        
        sc.close();
    }

    private static int check(int[] a, int n, int sum) {
        
        int s = 0;
        for(int i = 0; i < n; i++){
            
            if((sum-a[i])%2 == 0) if(s == (sum-a[i])/2) return i+1;
            s += a[i];
            
        }
        
        return -1;
    }

}