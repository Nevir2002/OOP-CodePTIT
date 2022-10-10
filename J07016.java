package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J07016 {

    public static void main(String arg[]) throws Exception {

        TreeSet<Integer> list = new TreeSet<>();
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        FileInputStream fi = new FileInputStream("DATA1.in");
        ObjectInputStream is = new ObjectInputStream(fi);
        ArrayList<Integer> arr1 = (ArrayList<Integer>) is.readObject();
        fi = new FileInputStream("DATA2.in");
        is = new ObjectInputStream(fi);
        ArrayList<Integer> arr2 = (ArrayList<Integer>) is.readObject();
        for(int tmp: arr1){
            
            if(prime(tmp)){
                
                list.add(tmp);
                if(m1.containsKey(tmp)) m1.put(tmp,m1.get(tmp)+1);
                else m1.put(tmp,1);
                
            }
            
        }
        for(int tmp:arr2){
            
            if(prime(tmp)){
                
                list.add(tmp);
                if(m2.containsKey(tmp)) m2.put(tmp,m2.get(tmp)+1);
                else m2.put(tmp,1);
                
            }
            
        }
        
        for(int x:list){
            
            System.out.println(String.format("%d %d %d", x,m1.get(x),m2.get(x)));
            
        }
        
    }

    private static boolean prime(int n){
        
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i <= n; i+=2) if(n%i == 0) return false;
        
        return true;
        
    }
    
}