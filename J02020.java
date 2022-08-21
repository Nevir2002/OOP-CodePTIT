package codeptit;

import java.util.Scanner;

public class J02020 {

    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        for(int i = 0; i < k; i++) a[i] = i+1;
        int cnt = 0;
        do{
            
            printx(a,k);
            cnt++;
            
        } while(nextCombination(a,n,k));
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close();
    }

    private static void printx(int[] a, int k) {
        
        for(int i = 0; i < k; i++) System.out.print(a[i] + " ");
        System.out.println();
        
    }

    private static boolean nextCombination(int[] a, int n, int k) {
        
        int i = k-1;
        while(i >= 0 && a[i] == n-k+i+1) i--;
        if(i < 0) return false;
        a[i]++;
        for(int j = i+1; j < k; j++) a[j] = a[j-1]+1;
        return true;
    }
    
    

}