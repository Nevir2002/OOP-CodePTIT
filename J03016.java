package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002



public class J03016 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        
        int t = Integer.valueOf(sc.nextLine());
        while(t-- != 0){
            
            String s = sc.next();
            System.out.println(check(s)?1:0);
                
        }

        sc.close();
    }
    
    private static boolean check(String s){
        
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if(i%2 == 0) sum += Integer.parseInt(s.substring(i,i+1));
            else sum -= Integer.parseInt(s.substring(i,i+1));
            
        }
        
        return sum%11==0;
    }

}