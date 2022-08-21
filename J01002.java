package TestPackage;

import java.util.Scanner;

public class J01002 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            long n = sc.nextLong();
            long x = n*(n+1)/2;
            System.out.println(x);

        }

        sc.close();
    }

}