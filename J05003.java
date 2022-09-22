package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5003{
    
    String id,name,cls,dob;
    String gpa;
    static int index = 1;
    
    public SV5003() {
    }

    public SV5003(String name, String cls, String dob, double gpa) {
        String x = String.valueOf(index++);
        while(x.length() < 3) x = '0' + x;
        this.id = "B20DCCN" + x;
        this.name = name;
        this.cls = cls;
        this.dob = fix(dob);
        this.gpa = String.format("%.2f", gpa);
    }
    private String fix(String s){
        
        String[] str = s.split("/");
        while(str[0].length() < 2) str[0] = '0' + str[0];
        while(str[1].length() < 2) str[1] = '0' + str[1];
        while(str[2].length() < 4) str[2] = '0' + str[2];
        
        return str[0]+'/'+str[1]+'/'+str[2];
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s %s", id, name, cls, dob, gpa));
        
    }
    
}

public class J05003 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            new SV5003(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())).print();

        }

        sc.close();
    }

}