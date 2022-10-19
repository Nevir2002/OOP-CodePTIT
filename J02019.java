package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J02019 {

    static int limit = 1000000;
    static int[] arr = new int[limit+1];
    static int res = 0,a,b;
    
    public static void main(String[] args){
        
        Arrays.fill(arr, 0);
        for(int i = 2; i <= limit; i++){
            
            for(int j = i*2; j <= limit; j += i) arr[j] += i;
            
        }
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(arr[i] > i){
                
                res++;
                
            }
            
        }
        System.out.println(res);        
        sc.close(); 
   }

}
//1 1000000