package TestPackage;

import java.util.Scanner;

public class J01006 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        long[] a = new long[93];
        a[1] = a[2] = 1;
        for(int i = 3; i <= 92; i++) a[i] = a[i-2] + a[i-1];

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            System.out.println(a[n]);

        }

        sc.close();
    }

}