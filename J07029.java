package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class J07029 {

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
            
            FileInputStream fi = new FileInputStream("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATABIN.in");
            ObjectInputStream is = new ObjectInputStream(fi);
            
            ArrayList<Integer> a = (ArrayList<Integer>)is.readObject();
            
            Map<Integer,Integer> mp = new TreeMap<>(Collections.reverseOrder());
            
            for(Integer x:a){
                
                if(prime(x)){
                    
                    if(mp.containsKey(x)){

                        int c = mp.get(x);
                        mp.put(x,c+1);

                    } else mp.put(x,1);
                    
                }
                
            }
            
            int cnt = 0;
            
            for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                
                System.out.println(x.getKey() + " " + x.getValue());
                cnt++;
                if(cnt == 10) break;
                
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