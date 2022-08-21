package TestPackage;

import java.util.Scanner;

public class J01021 {

    final static long mod = 1000000007;
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        long a,b;
        while(true){

            a = sc.nextLong();
            b = sc.nextLong();

            if(a == 0 && b == 0) break;
            System.out.println(pow(a,b));

        }

        sc.close();
    }

    public static long pow(long a, long b) {

        if(a == 0) return 0;
        if(a == 1) return 1;
        if(b == 0) return 1;
        if(b == 1) return a;

        long x = pow(a,b/2) % mod;

        if(b%2 == 0) return (x*x)%mod;
        return ((a*x)%mod*x)%mod;
    }

}