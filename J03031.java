package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J03031 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            String s = sc.next();
            int k = sc.nextInt();
            if(s.length() < 26 || count(s) + k < 26){
                
                System.out.println("NO");
                
            } else{
                
                System.out.println("YES");
                
            }
            
        }

        sc.close();
    }
    
    private static int count(String s){
        
        int res = 0;
        int[] a = new int[26];
        for(int i = 0; i < s.length(); i++) a[s.charAt(i)-'a']++;
        for(int i = 0; i < 26; i++) if(a[i] > 0) res++;
        
        return res;
    }
    
}