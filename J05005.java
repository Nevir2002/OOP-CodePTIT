package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5005 implements Comparator<SV5005>{
    
    String id,name,cls,dob;
    String gpa;
    static int index = 1;
    
    public SV5005() {
    }

    public SV5005(String name, String cls, String dob, double gpa) {
        String x = String.valueOf(index++);
        while(x.length() < 3) x = '0' + x;
        this.id = "B20DCCN" + x;
        this.name = fix(name);
        this.cls = cls;
        this.dob = fixdob(dob);
        this.gpa = String.format("%.2f", gpa);
    }
    private String fixdob(String s){
        
        String[] str = s.split("/");
        while(str[0].length() < 2) str[0] = '0' + str[0];
        while(str[1].length() < 2) str[1] = '0' + str[1];
        while(str[2].length() < 4) str[2] = '0' + str[2];
        
        return str[0]+'/'+str[1]+'/'+str[2];
    }
    private String fix(String s){
        
        String[] str = s.toLowerCase().split(" ");
        String res = "";
        for(String x:str){
            
            if(x.length() > 0) res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
            
        }
        
        return res.substring(0,res.length()-1);
        
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s %s", id, name, cls, dob, gpa));
        
    }
    
    @Override
    public int compare(SV5005 a, SV5005 b){
        
        return b.gpa.compareTo(a.gpa);
        
    }
    
}

public class J05005 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        Vector<SV5005> v = new Vector<>();
        
        while(t-- != 0){

            v.add(new SV5005(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));

        }
        
        Collections.sort(v,new SV5005());
        for(SV5005 x:v){
            
            x.print();
            
        }

        sc.close();
    }

}