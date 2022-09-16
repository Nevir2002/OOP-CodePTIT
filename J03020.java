package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002



public class J03020 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> mp = new LinkedHashMap<>();
        int maxLen = 0;
        
        while(sc.hasNext()){
            
            String s = sc.next();
//            if(s.equals("0")) break;
            if(check(s)){
                maxLen = maxLen>s.length()?maxLen:s.length();
                if(mp.containsKey(s)){
                    
                    int x = mp.get(s);
                    mp.put(s,x+1);
                    
                } else mp.put(s,1);
                
            }
            
        }
        
        for(Map.Entry<String, Integer> k:mp.entrySet()){
            
            if(k.getKey().length() == maxLen) System.out.println(k.getKey() + " " + k.getValue());
            
        }

        sc.close();
    }

    private static boolean check(String s){
        
        int l = 0, r = s.length()-1;
        while(l<r){
            
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
            
        }
        return true;
    }
    
}

//AAA BAABA HDHDH ACBSD SRGTDH DDDDS
//DUAHD AAAAA AD DA HDHDH AAA AAA AAA AAA
//DDDAS HDHDH HDH AAA AAA AAA AAA AAA
//AAA AAA AAAAA
//DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
//TDTD