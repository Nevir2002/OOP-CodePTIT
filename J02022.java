package codeptit;

import java.util.Scanner;

public class J02022 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){
            
            int n = sc.nextInt();
            int[] a = new int[n];
            rec(a,0,n);

        }

        sc.close();
    }

    private static void rec(int[] a, int i, int n) {
       
        if(i == n){
            
            printx(a,n);
            return;
            
        }
        
        for(int j = 1; j <= n; j++) if(!exist(a,n,j)) {
            
            if(i == 0 || Math.abs(j-a[i-1]) > 1){
                
                a[i] = j;
                rec(a,i+1,n);
                a[i] = 0;
                
            }
            
        }
        
    }

    private static boolean exist(int[] a, int n, int i) {
       
        for(int j = 0; j < n; j++) if(a[j] == i) return true;
        
        return false;
        
    }

    private static void printx(int[] a, int n) {
        
        for(int i = 0; i < n; i++){
            
            System.out.print(a[i]);
            
        }
        System.out.println("");
        
    }

}