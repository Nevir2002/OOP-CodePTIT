package TestPackage;

import java.util.Scanner;

public class J01014 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long n;
        while(t-- != 0){

            n = sc.nextLong();
            System.out.println(maxPrime(n));

        }
        sc.close();
        
    }

    public static long maxPrime(long n){

        long res = -1;
        while(n%2 == 0){

            res = 2;
            n /= 2;

        }

        for(int i = 3; i <= Math.sqrt(n); i+=2){

            while(n%i == 0){

                res = i;
                n /= i;

            }

        }

        if(n > 2) res = n;

        return res;
    }

}