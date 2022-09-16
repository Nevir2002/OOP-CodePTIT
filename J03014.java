package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002



public class J03014 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            
        BigInteger n1 = new BigInteger(sc.next());
        BigInteger n2 = new BigInteger(sc.next());
        System.out.println(n1.add(n2));

        sc.close();
    }

}