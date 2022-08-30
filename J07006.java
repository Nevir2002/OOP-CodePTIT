package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class J07006 {

    public static void main(String arg[]){

//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(24);
//        arr.add(25);
//        arr.add(25);
//        arr.add(23);
//        arr.add(10);
//        arr.add(25);
//        arr.add(25);
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
            
            FileInputStream fi = new FileInputStream("DATA.in");
            ObjectInputStream os = new ObjectInputStream(fi);
            
            ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();
            TreeMap<Integer,Integer> mp = new TreeMap<>();
            for(Integer x:a){
                
                if(mp.containsKey(x)){
                    
                    int c = mp.get(x);
                    mp.put(x,c+1);
                    
                } else mp.put(x,1);
                
            }
            
            for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                
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

}