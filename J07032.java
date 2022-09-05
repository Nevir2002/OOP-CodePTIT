package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032 {

    public static void main(String arg[]){

        try{
            
            FileInputStream fi1 = new FileInputStream("DATA1.in");
            ObjectInputStream is1 = new ObjectInputStream(fi1);
            FileInputStream fi2 = new FileInputStream("DATA2.in");
            ObjectInputStream is2 = new ObjectInputStream(fi2);
            
            ArrayList<Integer> a = (ArrayList<Integer>)is1.readObject();
            ArrayList<Integer> b = (ArrayList<Integer>)is2.readObject();
            Map<Integer,Integer> mp1 = new TreeMap<>();
            Map<Integer,Integer> mp2 = new TreeMap<>();
            Map<Integer,Integer> res = new TreeMap<>();
            
            for(int x:a){

                if(mp1.containsKey(x)){

                    int c = mp1.get(x);
                    mp1.put(x,c+1);

                } else mp1.put(x,1);
                
            }
            for(int x:b){

                if(mp2.containsKey(x)){

                    int c = mp2.get(x);
                    mp2.put(x,c+1);

                } else mp2.put(x,1);
                
            }
            
            for(Map.Entry<Integer,Integer> x:mp1.entrySet()){
                
                if(mp2.containsKey(x.getKey()) && check(x.getKey())){
                    
                    res.put(x.getKey(),x.getValue()+mp2.get(x.getKey()));
                    
                }
                
            }
            
            int cnt = 0;
            for(Map.Entry<Integer,Integer> x:res.entrySet()){
                
                System.out.println(x.getKey() + " " + x.getValue());
                cnt++;
                if(cnt == 10) break;
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }catch(IOException | ClassNotFoundException ce){
            
            System.out.println(ce);
            
        }

    }
    
    public static boolean check(int x){
        
        String s = String.valueOf(x);
        if(s.length()%2 == 0 || s.length() <= 1) return false;
        int l = 0, r = s.length()-1;
        while(l < r){
            
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
            
        }
        
        for(int i = 0; i < s.length(); i++){
            
            if(Integer.parseInt(s.substring(i,i+1))%2 == 0) return false;
            
        }
        
        return true;
        
    }

}