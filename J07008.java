package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class J07008 {

    static Vector<String> res = new Vector<>();
    
    public static void main(String arg[]){

        try{
            
            File f = new File("DAYSO.in");
            Scanner sc = new Scanner(f);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            for(int i = 0; i < n-1; i++){
                
                check(a,"",i,n);
                
            }
            Collections.sort(res);
            for(String x:res){
                
                String[] s = x.split(" ");
                if(s.length > 1) System.out.println(x);
                
            }
            
            sc.close();
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }

    }
    
    public static void check(int[] a, String s, int j, int n){
        
        s += String.valueOf(a[j]) + " ";
        res.add(s);
        
        for(int i = j+1; i < n; i++){
            
            if(a[i] > a[j]){
                
                check(a,s,i,n);
                
            } 
            
        }
        
    }

}