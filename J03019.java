package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002



public class J03019 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String res = "";
        char curr = s.charAt(s.length()-1);
        for(int i = s.length()-1; i >= 0; i--){
            
            if(curr <= s.charAt(i)){
                
                curr = s.charAt(i);
                res = curr + res;
                
            }
            
        }
        
        System.out.println(res);

        sc.close();
    }

}