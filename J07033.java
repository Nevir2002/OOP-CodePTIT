package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SV{
    
    String id,name,cls,email;
    SV(String a, String b, String c, String d){
        
        id = a;
        name = fix(b);
        cls = c;
        email = d;
        
    }
    
    public String fix(String s){
        
        String[] a = s.toLowerCase().split(" ");
        String res = "";
        for(String x:a) if(x.length() > 0) res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
        
        res = res.substring(0,res.length()-1);
        
        return res;
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + cls + " " + email);
        
    }
    
}

class cmpSV implements Comparator<SV>{
    
    public int compare(SV a, SV b){
        
        return a.id.compareTo(b.id);
        
    }
    
}

public class J07033 {

    public static void main(String arg[]){
        
        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            
            int n = Integer.parseInt(sc.nextLine());
            Vector<SV> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new cmpSV());
            
            for(SV x:v){
                
                x.print();
                
            }
            
            sc.close();
            
            
        } catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
}