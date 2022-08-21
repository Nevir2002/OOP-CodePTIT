package TestPackage;

import java.util.Scanner;

public class J01009 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        long[] a = new long[21];
        a[1] = 1;
        for(int i = 2; i <= 20; i++) a[i] = a[i-1]*i;

        int t = sc.nextInt();

        long res = 0;
        for(int i = 1; i <= t; i++) res += a[i];
        System.out.println(res);

        sc.close();
    }

}