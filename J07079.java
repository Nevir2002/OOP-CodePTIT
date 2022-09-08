package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class J07079 {

    public static void main(String arg[]){

        
//        try{
//            
//            ObjectOutputStream is = new ObjectOutputStream(new FileOutputStream("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
//            
//            ArrayList<String> a = new ArrayList<>();
//            a.add("5678321010286421");
//            a.add("9999999000000000000000000");
//            is.writeObject(a);
//            
//        }catch(FileNotFoundException e){
//            
//            System.out.println(e);
//            
//        }catch(IOException e){
//            
//            System.out.println(e);
//            
//        }
        
        try{
            
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<String> a = (ArrayList<String>) is.readObject();
            for(String x:a){
                
                String s = getBinary(x);
                System.out.println(s + " " + val(s));
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }catch(IOException | ClassNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
    private static String getBinary(String s){
        
        String res = "";
        for(int i = 0; i < s.length(); i++) if(s.charAt(i) == '0' || s.charAt(i) == '1') res += s.substring(i,i+1);
        return res;
    }
    
    private static long val(String s){
        
        long res = 0;
        for(int i = 0; i < s.length(); i++){
            
            res = res*2 + Integer.parseInt(s.substring(i,i+1));
            
        }
        return res;
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in