package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J02036 {

    static int[] a = new int[1001];
    static int[] b = new int[1001];
    static boolean check;
    
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        
        while(t-- != 0){
            
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            b[0] = a[0];
            check = false;
            rec(0,n);
            for(int i = 0; i <= n; i++){

                System.out.print(b[i] + " ");
                
            }
            System.out.println();
            
        }

        sc.close();
    }

    private static void rec(int i, int n){
        
        if(i < n-1){
              
            int x = lcm(a[i],a[i+1]);
            int j = x;
            while(true){

                if(gcd(b[i],j) == a[i]){

                    if(check) return;
                    b[i+1] = j;
                    rec(i+1,n);

                } else j+=x;

            }        
            
        }else if(i == n-1){
            
            int k = a[i];
            while(true){
                
                if(gcd(b[i],k) == a[i]){
                    
                    if(check) return;
                    b[i+1] = k;
                    rec(i+1,n);
                    
                } else k+=a[i];
                
            }
            
        }else if(i == n){
            
            check = true;
            
        }
            
    }
    
    private static int gcd(int a, int b){
        
        if(b == 0) return a;
        return gcd(b,a%b);
        
    }
    
    private static int lcm(int a, int b){
        
        return a*b/gcd(a,b);
        
    }
    
}