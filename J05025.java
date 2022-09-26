package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class GV5025 implements Comparator<GV5025>{
    
    String id, name, subject;
    static int index = 1;

    public GV5025() {
    }

    public GV5025(String name, String subject) {
        this.id = String.format("GV%02d",index++);
        this.name = name;
        this.subject = "";
        String[] tmp = subject.split(" ");
        for(String x:tmp) if(x.length() > 0) this.subject += x.substring(0,1).toUpperCase();
    }
    
    @Override
    public int compare(GV5025 a, GV5025 b){
        
        String[] s1 = a.name.split(" ");
        String[] s2 = b.name.split(" ");
        if(s1[s1.length-1].equals(s2[s2.length-1])) return a.id.compareTo(b.id);
        return s1[s1.length-1].compareTo(s2[s2.length-1]);
        
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s", id, name, subject));
        
    }
    
}

public class J05025 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<GV5025> v = new Vector<>();
           
        while(t-->0){

            v.add(new GV5025(sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new GV5025());
        for(GV5025 x:v) x.print();

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