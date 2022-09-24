package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5024{
    
    String id,name,cls,email;

    public SV5024() {
    }

    
    public SV5024(String id, String name, String cls, String email) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.email = email;
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s", id, name, cls, email));
        
    }
    
    public boolean check(String s){
        
        String cmp;
        if(s.equals("Ke toan")){
            
            return id.substring(3,7).equals("DCKT");
            
        }
        if(s.equals("Cong nghe thong tin")){
            
            return cls.charAt(0) != 'E' && id.substring(3,7).equals("DCCN");
            
        }
        if(s.equals("An toan thong tin")){
            
            return cls.charAt(0) != 'E' && id.substring(3,7).equals("DCAT");
            
        }
        if(s.equals("Vien thong")){
            
            return id.substring(3,7).equals("DCVT");
            
        }
        if(s.equals("Dien tu")){
            
            return id.substring(3,7).equals("DCDT");
            
        }
        
        return false;
        
    }
    
}

public class J05024 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<SV5024> v = new Vector<>();
        while(t-->0){

            v.add(new SV5024(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
            
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            
            String s = sc.nextLine();
            System.out.println(String.format("DANH SACH SINH VIEN NGANH %s:", s.toUpperCase()));
            for(SV5024 x:v) if(x.check(s)) x.print();
            
        }
        
        sc.close();
    }

}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//Ke toan