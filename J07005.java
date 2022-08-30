package codeptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class J07005 {

    public static void main(String arg[]){

        TreeMap<Integer,Integer> mp = new TreeMap<>();
        try{
            
            FileInputStream fi = new FileInputStream("DATA.IN");
            DataInputStream is = new DataInputStream(fi);
            for(int i = 0; i < 100000; i++){
                
                int t = is.readInt();
                    
                if(!mp.containsKey(t)){

                    mp.put(t,1);

                } else{

                    int c = mp.get(t);
                    mp.put(t, c+1);

                }
                
            }
            
            
            for(Map.Entry<Integer,Integer> x:mp.entrySet()){
            
                System.out.println(x.getKey() + " " + x.getValue());
            
            }
            
        } catch (FileNotFoundException e){
            
            System.out.println(e);
            
        } catch (IOException e){
            
            System.out.println(e);
            
        }

    }

}