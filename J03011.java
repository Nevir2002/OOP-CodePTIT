package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- != 0){

            BigInteger n1 = new BigInteger(sc.nextLine());
            BigInteger n2 = new BigInteger(sc.nextLine());
            System.out.println(n1.gcd(n2));

        }

        sc.close();
    }

}