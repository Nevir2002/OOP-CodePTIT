package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J02026 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while(t-- != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            Vector<Integer> a = new Vector<>();
            for(int i = 0; i < n; i++) a.add(sc.nextInt());
            Collections.sort(a);
            run(k,0,"",a,n);
            
        }

        sc.close();
    }
    
    private static void run(int n, int i, String str, Vector<Integer> a, int size){
        
        if(n == 0){
            
            System.out.println(str);
            return;
            
        }
        for(int j = i; j < size; j++){
            
            run(n-1,j+1,str + a.get(j) + " ",a,size);

        }
        
    }

}