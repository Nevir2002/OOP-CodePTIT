package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07040 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("VANBAN.in"));
            FileInputStream fi = new FileInputStream("NHIPHAN.in");
            ObjectInputStream is = new ObjectInputStream(fi);
            ArrayList<String> b = (ArrayList<String>)is.readObject();
            Map<String,Integer> mp = new TreeMap<>();
            Map<String,Integer> res = new TreeMap<>();
            
            for(String x:b){
                
                String[] s = x.toLowerCase().split(" ");
                for(String k:s){
                    
                    mp.put(k,1);
                    
                }
                
               
            }
            while(sc.hasNext()){
                
                String s = sc.next().toLowerCase();
                if(mp.containsKey(s) && !res.containsKey(s)){
                    
                    System.out.println(s);
                    res.put(s,1);
                    
                } 
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }catch(IOException | ClassNotFoundException ce){
            
            System.out.println(ce);
            
        }

    }

}