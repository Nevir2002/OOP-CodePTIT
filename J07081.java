package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Nevir2002

class SV7081 implements Comparator<SV7081>{
    
    String id,name,phone,email;
    
    SV7081(){};
    SV7081(String a, String b, String c, String d){
        
        id = a;
        name = b;
        phone = c;
        email = d;
        
    }
    
    @Override
    public int compare(SV7081 a, SV7081 b){
        
        String[] s1 = a.name.split(" ");
        String[] s2 = b.name.split(" ");
        
        int x1 = s1.length-1;
        int x2 = s2.length-1;
        
        if(s1[x1].equals(s2[x2])){
            
            for(int i = 0; i < Math.min(s1.length, s2.length)-1; i++){
                
                if(!s1[i].equals(s2[i])) return s1[i].compareTo(s2[i]);
                
            }
            
        }else return(s1[x1].compareTo(s2[x2]));
        
        return a.id.compareTo(b.id);
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + phone + " " + email);
        
    }
    
}

public class J07081 {

    public static void main(String arg[]){
        
        try{
            
            File f = new File("SINHVIEN.in");
            Scanner sc = new Scanner(f);
            int n = Integer.parseInt(sc.nextLine());
            Vector<SV7081> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new SV7081(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new SV7081());
            for(SV7081 x:v){
                
                x.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
        
    }

}