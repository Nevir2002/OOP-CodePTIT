package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

class SV{
    
    String id,name,cls,dob;
    float gpa;
    
    SV(String a,String b, String c, float d){
        
        name = a;
        cls = b;
        dob = fix(c);
        gpa = d;
        
    }
    
    public void setID(String s){
        
        id = s;
        
    }
    
    public String fix(String s){
        
        String[] a = s.split("/");
        while(a[0].length() < 2) a[0] = '0' + a[0];
        while(a[1].length() < 2) a[1] = '0' + a[1];
        String res = a[0]+"/"+a[1]+"/"+a[2];
        return res;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + cls + " " + dob + " " + String.format("%.2f", gpa));
        
    }
    
}

public class J07010 {
    
    public static void main(String arg[]){

        try{
            
            File f = new File("SV.in");
            Scanner sc = new Scanner(f);
            int n = Integer.parseInt(sc.nextLine());
            SV[] a = new SV[n];
            
            for(int i = 1; i <= n; i++){
                
                a[i-1] = new SV(sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
                String s = "B20DCCN0";
                String num = String.valueOf(i);
                if(num.length() < 2) num = '0' + num;
                a[i-1].setID(s+num);
                a[i-1].print();
                
            }
            
            sc.close();
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }

    }

}