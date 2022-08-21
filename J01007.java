package TestPackage;

import java.util.Scanner;

public class J01007 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        long[] a = new long[93];
        a[1] = a[2] = 1;
        for(int i = 3; i <= 92; i++) a[i] = a[i-2] + a[i-1];

        int t = sc.nextInt();

        while(t-- != 0){

            long n = sc.nextLong();
            boolean check = false;
            for(int i = 0; i <= 92; i++) if(a[i] == n){

                check = true;
                break;

            }
            if(n == 0) check = true;
            if(check) System.out.println("YES"); else System.out.println("NO");

        }

        sc.close();
    }

}