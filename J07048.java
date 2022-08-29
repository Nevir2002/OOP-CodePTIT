package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SP implements Comparable<SP>{
    
    String id,name;
    int price,month;
    
    SP(String a, String b, int c, int d){
        
        id = a;
        name = b;
        price = c;
        month = d;
        
    }
    
    public int compareTo(SP a){
        
        if(price == a.price) return id.compareTo(a.id);
        return a.price - price;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + price + " " + month);
        
    }
    
}

public class J07048 {

    public static void main(String[] args){
        
        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<SP> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new SP(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
                
            }

            Collections.sort(v);
            
            for(SP x:v){
                
                x.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
}