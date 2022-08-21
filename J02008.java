package TestPackage;

import java.util.Scanner;

public class J02008 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            long n = sc.nextLong();
            System.out.println(minGCD(n));

        }

        sc.close();
    }

    private static long minGCD(long n) {
        long res = n;
        long x = n-1;
        while(x > 0){

            res = lcm(res,x);
            x--;

        }

        return res;
    }

    private static long gcd(long a, long b) {

        if(b == 0) return a;
        return gcd(b,a%b);
        
    }

    private static long lcm(long a, long b) {

        return a*b/gcd(a, b);
        
    }

}