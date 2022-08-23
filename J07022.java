package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07022 {

    public static void main(String arg[]){

        try{
            
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            Vector<String> v = new Vector<>();
            while(sc.hasNextLine()){
                
                String s = sc.nextLine();
                String[] a = s.split(" ");
                for(String x:a){
                    
                    try{
                        
                        Integer.parseInt(x);
                        
                    }catch(NumberFormatException e){
                        
                        v.add(x);
                        
                    }
                    
                }
                
            }
            Collections.sort(v);
            for(String x:v){
                
                System.out.print(x + " ");
                
            }
            sc.close();
            
        } catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}