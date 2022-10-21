package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Pair{
    
    char ft;
    int sc;

    public Pair(char ft, int sc) {
        this.ft = ft;
        this.sc = sc;
    }
    
}

public class J03036 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){

            arr[i] = sc.next();

        }
        
        System.out.println(res(arr,n));

        sc.close();
    }

    private static int res(String[] arr, int n){
        
        int[] a = new int[n];
        int k = arr[0].length();
        a[0] = 0;
        for(int i = 1; i < n; i++){
            
            a[i] = move(arr[i],arr[0]);
            if(a[i] == -1) return -1;
            
        }
        int res = k*n;
        
        for(int i = 0; i < k; i++){
            
            int tmp = 0;
            for(int j = 0; j < n; j++){
                
                tmp += (a[j] + i) % k;
            }
            res = Math.min(res, tmp);
            
        }
        
        return res;
        
    }
    
    private static int move(String a, String b){
        
        for(int i = 0; i < b.length(); i++){
            
            if(b.equals(a.substring(i) + a.substring(0,i))) return i;
            
        }
        
        return -1;        
    }
    
}


//4
//xzzwo
//zwoxz
//zzwox
//xzzwo

//2
//molzv
//lzvmo

//3
//kc
//kc
//kc

//3
//aa
//aa
//ab