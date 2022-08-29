package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MH implements Comparable<MH>{
    
    String id,name,group;
    double buy,sell,rev;
    
    MH(String a, String b, String c, double d, double e){
        
        id = a;
        name = b;
        group = c;
        buy = d;
        sell = e;
        rev = sell - buy;
        
    }
    
    public int compareTo(MH a){
        
        if(a.rev - rev < 0) return -1;
        else if(a.rev - rev > 0) return 1;
        return 0;
        
    }
    
    public void print(){
        
        String s = String.format("%.2f", rev);
        System.out.println(id + " " + name + " " + group + " " + s);
        
    }
    
}

public class J07050 {

    public static void main(String[] args){
        
        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<MH> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                String t = String.valueOf(i+1);
                if(t.length() < 2) t = '0' + t;
                t = "MH" + t;
                
                v.add(new MH(t,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
                
            }

            Collections.sort(v);
            
            for(MH x:v){
                
                x.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
}