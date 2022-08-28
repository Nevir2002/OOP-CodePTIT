package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07002 {

    public static void main(String arg[]){

        try{
            
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            long sum = 0;
            while(sc.hasNext()){
                
                try{
                    
                    String s = sc.next();
                    try{
                        
                        int n = Integer.parseInt(s);
                        sum += n;
                        
                    }catch(NumberFormatException e){}
                    
                    
                }catch(NumberFormatException e){}
                
            } 
            
            System.out.println(sum);
            sc.close();
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }    

    }

}