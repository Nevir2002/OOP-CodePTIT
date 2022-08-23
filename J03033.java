package codeptit;

import java.math.BigInteger;
import java.util.*;

public class J03033 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- != 0){
            
            BigInteger n1 = new BigInteger(sc.next());
            BigInteger n2 = new BigInteger(sc.next());
            System.out.println(n1.multiply(n2).divide(n1.gcd(n2)));
            
        }

        sc.close();
    }

}