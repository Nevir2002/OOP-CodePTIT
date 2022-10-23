package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class JAHA003 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            char[] s = sc.next().toCharArray();
            int sum = 0;
            for(int i = 0; i < s.length; i++){
                
                if(i%2 == 0) sum += s[i]-'0';
                else sum -= s[i]-'0';
                
            }
            String res = sum%11==0?"YES":"NO";
            System.out.println(res);

        }

        sc.close();
    }

}

//2
//12341
//123456789123456789