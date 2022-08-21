package TestPackage;

import java.util.Scanner;

public class J01004 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- != 0){

            int n = sc.nextInt();
            if(primeCheck(n)) System.out.println("YES"); else System.out.println("NO");

        }

        sc.close();
    }

    public static boolean primeCheck(int x){

        if(x%2 == 0) return false;
        for(int i = 3; i*i <= x; i += 2){

            if(x%i == 0) return false;

        }

        return true;

    }

}