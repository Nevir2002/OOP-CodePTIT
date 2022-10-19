package test;

import java.io.*;
import java.util.*;

public class J07041 {

    public static void main(String[] args) throws Exception{
        
        ObjectInputStream is = null;
        FileInputStream fi = new FileInputStream("DATA.in");
        is = new ObjectInputStream(fi);
        ArrayList<Pair> arr;
        arr = (ArrayList<Pair>) is.readObject();
        Collections.sort(arr);
        Map<String, Boolean> mp = new HashMap<>();
        for (Pair x : arr) {

            if (x.getFirst() < x.getSecond()) {

                if (!mp.containsKey(x.toString())) {

                    System.out.println(x);
                    mp.put(x.toString(), true);

                }

            }

        }
        
    }
    
}