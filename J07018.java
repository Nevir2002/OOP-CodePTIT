package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV07018{
    
    String id,name,dob,cls;
    double gpa;
    static int idx = 1;

    public SV07018() {
    }

    public SV07018(String name, String cls, String dob, double gpa) {
        this.id = String.format("B20DCCN%03d",idx++);
        this.name = fix(name);
        this.dob = full(dob);
        this.cls = cls;
        this.gpa = gpa;
    }
    
    private String fix(String s){
        
        String[] x = s.toLowerCase().split(" ");
        String res = "";
        for(String k:x) if(k.length() > 0) res += k.substring(0,1).toUpperCase() + k.substring(1) + " ";
        return res.substring(0,res.length()-1);
        
    }
    private String full(String s){
        
        String[] arr = s.split("/");
        while(arr[0].length() < 2) arr[0] = "0" + arr[0];
        while(arr[1].length() < 2) arr[1] = "0" + arr[1];
        while(arr[2].length() < 4) arr[2] = "0" + arr[2];
        return String.format("%s/%s/%s",arr[0],arr[1],arr[2]);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %.2f", id,name,cls,dob,gpa);
        
    }
    
}

public class J07018 {

    public static void main(String arg[]) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new SV07018(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));;

        }

        sc.close();
    }

}