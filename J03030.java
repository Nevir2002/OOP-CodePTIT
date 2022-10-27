package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J03030 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        sc = new Scanner(System.in);
        long a = 0, b = 0;
        char[] s = sc.next().trim().toCharArray();
//        System.out.println(s);
        int n = s.length;
        int i = 0;
        while(i < n){
            
            if(s[i++] == 'A') b = (a<b?a:b) + 1;
            else a = (a<b?a:b) + 1;
            
        }
        
        System.out.println(a);
        
    }

}

//AAABBBAAABBB