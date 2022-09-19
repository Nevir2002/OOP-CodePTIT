package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J03028 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            String s = sc.next();
            System.out.println(DRM(s));
            
        }

        sc.close();
    }
    
    private static int value(char x){
        
        return x-'A';
        
    }
    
    private static String DRM(String s){
        
        String[] str = Divide(s);
        str[0] = Rotate(str[0]);
        str[1] = Rotate(str[1]);
        return Merge(str[0],str[1]);
    }

    private static String[] Divide(String s){
        
        int n = s.length();
        return new String[] {s.substring(0,n/2),s.substring(n/2)};
        
    }
    
    private static String Rotate(String s){
        
        int n = s.length();
        int k = 0;
        for(int i = 0; i < n; i++) k += value(s.charAt(i));
        String res = "";
        for(int i = 0; i < n; i++){
            
            res += move(s.charAt(i),k);
            
        }
        
        return res;
    }
    
    private static char move(char a, int k){
        
        return (char)('A' + (value(a)+k)%26);
        
    }
    
    private static String Merge(String a, String b){
        
        String res = "";
        for(int i = 0; i < a.length(); i++) res += move(a.charAt(i), value(b.charAt(i)));
        
        return res;
    }
    
}