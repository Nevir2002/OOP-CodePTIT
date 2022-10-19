package test;

import java.io.*;
import java.util.*;

public class J07042 {

    public static void main(String[] args) throws Exception{
        
        ObjectInputStream is = null;
        FileInputStream fi = new FileInputStream("DATA.in");
        is = new ObjectInputStream(fi);
        ArrayList<Pair> arr;
        arr = (ArrayList<Pair>) is.readObject();
        Collections.sort(arr);
        Map<String, Boolean> mp = new HashMap<>();
        for (Pair x : arr) {

            if (x.getFirst() < x.getSecond() && gcd(x.getFirst(),x.getSecond()) == 1) {

                if (!mp.containsKey(x.toString())) {

                    System.out.println(x);
                    mp.put(x.toString(), true);

                }

            }

        }
        
    }
    
    private static int gcd(int a, int b){
        
        if(b == 0) return a;
        return gcd(b,a%b);
        
    }
    
}