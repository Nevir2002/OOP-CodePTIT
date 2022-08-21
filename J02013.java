package codeptit;

import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class J02013 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int step = 1;
  
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        while(!check(a,n)){
            
            for(int i = 0; i < n-1; i++) if(a[i] > a[i+1]){
                
                   int tmp = a[i];
                   a[i] = a[i+1];
                   a[i+1] = tmp;
                
            }
            
            System.out.print("Buoc " + step++ + ": ");
            for(int i = 0; i < n; i++) System.out.print(a[i] + " ");
            System.out.println();
            
        }

        sc.close();
    }
    
    private static boolean check(int[] a, int n){
        
        for(int i = 0; i < n-1; i++) if(a[i] > a[i+1]) return false;
        return true;
        
    }

}