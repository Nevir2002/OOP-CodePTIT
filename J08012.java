package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08012 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        int[][] a = new int[t][2];
        
        for(int i = 0; i < t-1; i++){
            
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();

        }
        
        boolean check = true;
        
        int key = 0;
        
        if(a[0][0] != a[1][0] && a[0][0] != a[1][1] && a[0][1] != a[1][0] && a[0][1] != a[1][1]) check = false;

        if(check){
            
            if(a[0][0] == a[1][0] || a[0][0] == a[1][1]) key = a[0][0];
            if(a[0][1] == a[1][0] || a[0][1] == a[1][1]) key = a[0][1];
//            System.out.println(key);
            for(int i = 2; i < t-1; i++) if(a[i][0] != key && a[i][1] != key) check = false; 
            
        }
        
        if(check) System.out.println("Yes"); else System.out.println("No");

        sc.close();
    }

}