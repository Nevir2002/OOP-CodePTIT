package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07004 {

    public static void main(String arg[]) throws FileNotFoundException{

        try{
            
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            HashMap<Integer,Integer> mp = new HashMap<>();
            while(sc.hasNextLine()){

                String s = sc.nextLine();
                String[] a = s.split(" ");
                for(String x:a){
                    
                    if(x.length() == 0) continue;
                    int t = Integer.parseInt(x);
                    if(!mp.containsKey(t)){
                        
                        mp.put(t,1);
                        
                    }else{
                        
                        int val = mp.get(t);
                        mp.put(t,val+1);
                        
                    }
                    
                }

            }
            for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                
                System.out.println(x.getKey() + " " + x.getValue());
                
            }            
            sc.close();
            
        } catch (FileNotFoundException e){
                
            System.out.println(e);
                
        }
        
    }

}