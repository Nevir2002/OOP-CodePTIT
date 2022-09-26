package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class GV5026{
    
    String id, name, subject, subjectShort;
    static int index = 1;

    public GV5026() {
    }

    public GV5026(String name, String subject) {
        this.id = String.format("GV%02d",index++);
        this.name = name;
        this.subject = subject;
        this.subjectShort = "";
        String[] tmp = subject.split(" ");
        for(String x:tmp) if(x.length() > 0) this.subjectShort += x.substring(0,1).toUpperCase();
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s", id, name, subjectShort));
        
    }
    
}

public class J05026 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<GV5026> v = new Vector<>();
           
        while(t-->0){

            v.add(new GV5026(sc.nextLine(),sc.nextLine()));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String q = sc.nextLine();
            System.out.println(String.format("DANH SACH GIANG VIEN BO MON %s:", shortened(q)));
            for(GV5026 x:v) if(x.subject.equals(q)) x.print();
            
        }

        sc.close();
    }
    
    private static String shortened(String s){
        
        String[] tmp = s.toUpperCase().split(" ");
        String res = "";
        for(String x:tmp) if(x.length() > 0) res += x.substring(0,1);
        
        return res;
    }

}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//2
//Cong nghe phan mem
//Khoa hoc may tinh