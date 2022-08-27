package codeptit;

import java.math.BigInteger;
import java.util.*;

public class J03039 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){

            String[] s = sc.nextLine().split(" ");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            if(a.compareTo(b) < 0){
                
                BigInteger tmp = a;
                a = b;
                b = tmp;
                
            }
            
            if(a.mod(b) == BigInteger.ZERO){
                
                System.out.println("YES");
                
            } else{
                
                System.out.println("NO");
                
            }

        }

        sc.close();
    }

}