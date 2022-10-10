package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08010 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Map<String,Integer> mp = new LinkedHashMap<>();

        int mxLen = 0;
        
        while(sc.hasNext()){
            
            String x = sc.next();
//            if(x.equals("-1")) break;
            if(palindrome(x)){
                
                if(x.length() > mxLen) mxLen = x.length();
                if(mp.containsKey(x)) mp.put(x,mp.get(x)+1);
                else mp.put(x,1);
                
            }
            
        }
        
        for(Map.Entry<String, Integer> x:mp.entrySet()){
        
            if(x.getKey().length() == mxLen) System.out.println(x.getKey() + " " + x.getValue());
        
    }
        
        sc.close();
    }
    
    private static boolean palindrome(String s){
        
        int l = 0, r = s.length()-1;
        while(l < r){
            
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
            
        }
        
        return true;
    }

}

//AAAAA BAABA HDHDH ACBSD SRGTDH DDDDS
//DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
//DDDAS HDHDH HDH AAAAA AAA AAA AAA AAA AAA
//AAA AAA AAA
//DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
//TDTD