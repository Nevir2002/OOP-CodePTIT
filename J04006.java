package codeptit;

import java.util.*;

class Student04006{
    
    String name,cls,dob,id;
    float gpa;
    static int n = 1;
    
    Student04006(String a, String b, String c, float d){
        
        id = "B20DCCN";
        String s = String.valueOf(n);
        while(s.length() < 3) s = '0' + s;
        id += s;
        name = a;
        cls = b;
        dob = fix(c);
        gpa = d;
        
    }
    
    public String fix(String s){
        
        String[] a = s.split("/");
        if(a[0].length() < 2) a[0] = '0' + a[0];
        if(a[1].length() < 2) a[1] = '0' + a[1];
        
        return (a[0] + "/" + a[1] + "/" + a[2]);
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + cls + " " + dob + " " + String.format("%.2f",gpa));
        
    }
    
}

public class J04006 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        
        Student04006 obj = new Student04006(sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
        obj.print();
        
        sc.close();
    }

}