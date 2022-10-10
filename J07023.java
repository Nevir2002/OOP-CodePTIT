package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J07023 {

    public static void main(String arg[]) throws Exception{

        FileInputStream fi = new FileInputStream("DATA1.in");
        ObjectInputStream os = new ObjectInputStream(fi);
        ArrayList<Integer> arr1 = (ArrayList<Integer>) os.readObject();
        fi = new FileInputStream("DATA2.in");
        os = new ObjectInputStream(fi);
        ArrayList<Integer> arr2 = (ArrayList<Integer>) os.readObject();
        Set<Integer> st = new TreeSet<>();
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        for(int x:arr1){
            
            if(palindrome(x) && prime(x)){
                
                st.add(x);
                if(m1.containsKey(x)) m1.put(x,m1.get(x)+1);
                else m1.put(x,1);
                
            }
            
        }
        for(int x:arr2){
            
            if(palindrome(x) && prime(x)){
                
                st.add(x);
                if(m2.containsKey(x)) m2.put(x,m2.get(x)+1);
                else m2.put(x,1);
                
            }
            
        }
        
        for(int x:st) System.out.println(String.format("%d %d %d",x,m1.get(x),m2.get(x)));

    }

    private static boolean palindrome(int n){
        
        String s = String.valueOf(n);
        int l = 0, r = s.length()-1;
        while(l < r){
            
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
            
        }
        return true;
    }
    
    private static boolean prime(int n){
        
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i <= n; i+=2) if(n%i == 0) return false;
        
        return true;
    }
    
}