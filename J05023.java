package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5023{
    
    String id,name,cls,email;

    public SV5023() {
    }

    
    public SV5023(String id, String name, String cls, String email) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.email = email;
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s", id, name, cls, email));
        
    }
    
}

public class J05023 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<SV5023> v = new Vector<>();
        while(t-->0){

            v.add(new SV5023(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
            
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            
            String s = sc.nextLine();
            System.out.println(String.format("DANH SACH SINH VIEN KHOA %s:", s));
            for(SV5023 x:v) if(x.cls.substring(1,3).equals(s.substring(2))) x.print();
            
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
//2015