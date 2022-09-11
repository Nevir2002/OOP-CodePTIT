package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J07085 {

    public static void main(String arg[]){

        try{
            
//            FileOutputStream fo = new FileOutputStream("DATA.in");
//            ObjectOutputStream os = new ObjectOutputStream(fo);
//            ArrayList<String> v = new ArrayList<>();
//            v.add("Jhsf00dklT12uhf780LPPZH");
//            v.add("AAAAddd0000000000000000001T");
//            os.writeObject(v);
            
            FileInputStream fi = new FileInputStream("DATA.in");
            ObjectInputStream is = new ObjectInputStream(fi);
            ArrayList<String> a = (ArrayList<String>) is.readObject();
            for(String x:a){
                
                System.out.println(process(x) + " " + sum(process(x)));
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }catch(IOException | ClassNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
    private static String process(String s){
        
        String res = "";
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                
                if(!(s.charAt(i) == '0' && res.length() == 0)) res += s.charAt(i);
                
            }
            
        }
        return res;
        
    }
    
    private static int sum(String s){
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            
            sum += Integer.parseInt(s.substring(i,i+1));
            
        }
        return sum;
    }

}