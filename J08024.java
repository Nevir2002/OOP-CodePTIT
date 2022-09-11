package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002



public class J08024 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            int k = sc.nextInt();
            BigInteger n = new BigInteger(String.valueOf(k));
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(true){
                
                BigInteger num = new BigInteger(q.remove());
                if(num.mod(n) == BigInteger.ZERO){
                    
                    System.out.println(num);
                    break;
                    
                }
                q.add(num+"0");
                q.add(num+"9");
                
            }

        }
        

        sc.close();
    }

}