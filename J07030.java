package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class J07030 {

    public static void main(String arg[]){

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(24);
//        arr.add(25);
//        arr.add(25);
//        arr.add(23);
//        arr.add(10);
//        arr.add(25);
//        arr.add(251);
//        arr.add(2135);
//        arr.add(25);
//        arr.add(256);
//        arr.add(25);
//        arr.add(235);
//        arr.add(26);
//        arr.add(2455);
//        arr.add(2275);
//        try{
//            
//            FileOutputStream fo = new FileOutputStream("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATABIN.in");
//            ObjectOutputStream os = new ObjectOutputStream(fo);
//            
//            os.writeObject(arr);
//            
//        }catch(FileNotFoundException e){
//            
//            System.out.println(e);
//            
//        }catch(IOException ioe){
//            
//            System.out.println(ioe);
//            
//        }
        
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
            
            for(Integer x:a){
                
                if(prime(x)){
                    
                    if(mp1.containsKey(x)){

                        int c = mp1.get(x);
                        mp1.put(x,c+1);

                    } else mp1.put(x,1);
                    
                }
                
            }
            for(Integer x:b){
                
                if(prime(x)){
                    
                    if(mp2.containsKey(x)){

                        int c = mp2.get(x);
                        mp2.put(x,c+1);

                    } else mp2.put(x,1);
                    
                }
                
            }
            
            for(Map.Entry<Integer,Integer> x:mp1.entrySet()){
                
                int k = 1000000-x.getKey();
                if(prime(x.getKey()) && prime(k) && mp2.containsKey(k) && x.getKey() < k){
                    
                    res.put(x.getKey(),k);
                    
                }
                
            }
            
            for(Map.Entry<Integer,Integer> x:res.entrySet()){
                
                System.out.println(x.getKey() + " " + x.getValue());
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }catch(IOException ioe){
            
            System.out.println(ioe);
            
        }catch(ClassNotFoundException ce){
            
            System.out.println(ce);
            
        }

    }
    
    public static boolean prime(int n){
        
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i <= n; i+=2) if(n%i == 0) return false;
        return true;
        
    }

}