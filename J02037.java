package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J02037 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            String[] s = sc.nextLine().split(" ");
            System.out.println(check(s)?"YES":"NO");

        }

        sc.close();
    }
    
    private static boolean check(String[] s){
        
        int[] a = new int[2];
        a[0] = a[1] = 0;
        
        for(String x:s){
            
            if(x.length() > 0) a[Integer.parseInt(x.substring(x.length()-1))%2]++;
            
        }
        
//        System.out.println(a[0] + " " + a[1] + " " + s.length);
        
        return (a[0]>a[1]&&s.length%2==0) || (a[1]>a[0]&&s.length%2==1);
        
    }

}