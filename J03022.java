package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J03022 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        String res = "";
        while(sc.hasNext()){
            
            String s = sc.next();
//            if(s.equals("0")) break;
            res += s + " ";
            if(containsEnd(s)){
                
                res = res.substring(0,res.length()-2);
                System.out.println(fixed(res));
                res = "";
                
            }
            
        }

        sc.close();
    }
    
    private static String fixed(String s){
        
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        
    }
    
    private static boolean containsEnd(String s){
        
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!') return true;
        
        return false;
    }

}