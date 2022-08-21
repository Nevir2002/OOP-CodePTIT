package TestPackage;

import java.util.Scanner;

public class J01011 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            long a = sc.nextInt();
            long b = sc.nextInt();
            long gcdVal = gcd(a,b);
            System.out.println(a*b/gcdVal + " " + gcdVal);

        }

        sc.close();
    }

    private static long gcd(long a, long b) {

        if(b == 0) return a;

        return gcd(b,a%b);
    }

    

}