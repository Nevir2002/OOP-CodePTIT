package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DN{
    
    String id,name,num;
    DN(String a, String b, String c){
        
        id = a;
        name = b;
        num = c;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + num);
        
    }
    
}

class cmpDN implements Comparator<DN>{
    
    public int compare(DN a, DN b){
        
        return a.id.compareTo(b.id);
        
    }
    
}

public class J07037 {

    public static void main(String arg[]){
        
        try{
            
            Scanner sc = new Scanner(new File("DN.in"));
            
            int n = Integer.parseInt(sc.nextLine());
            Vector<DN> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new DN(sc.nextLine(),sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new cmpDN());
            
            for(DN x:v){
                
                x.print();
                
            }
            
            sc.close();
            
            
        } catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
}