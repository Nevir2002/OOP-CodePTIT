package TestPackage;

import java.util.Arrays;
import java.util.Scanner;

public class J02006 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[] a = new int[m+n];
        for(int i = 0; i < m+n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.print(a[0] + " ");
        for(int i = 1; i < m+n; i++) if(a[i] != a[i-1]) System.out.print(a[i] + " ");       

        sc.close();
    }

}