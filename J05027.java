package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class GV5027{
    
    String id, name, subject;
    static int index = 1;

    public GV5027() {
    }

    public GV5027(String name, String subject) {
        this.id = String.format("GV%02d",index++);
        this.name = name;
        this.subject = "";
        String[] tmp = subject.split(" ");
        for(String x:tmp) if(x.length() > 0) this.subject += x.substring(0,1).toUpperCase();
    }
    
    public boolean check(String s){
        
        return name.toLowerCase().contains(s.toLowerCase());
        
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s", id, name, subject));
        
    }
    
}

public class J05027 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<GV5027> v = new Vector<>();
           
        while(t-->0){

            v.add(new GV5027(sc.nextLine(),sc.nextLine()));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String q = sc.nextLine();
            System.out.println(String.format("DANH SACH GIANG VIEN THEO TU KHOA %s:", q));
            for(GV5027 x:v) if(x.check(q)) x.print();
            
        }

        sc.close();
    }

}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN