package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07001 {

    public static void main(String arg[]){

        try{
            
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext()){
                
                System.out.println(sc.nextLine());
                
            } 
            
            sc.close();
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }    

    }

}