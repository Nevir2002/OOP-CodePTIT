package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV05062 implements Comparable<SV05062>{
    
    String name,status;
    double gpa,pts;
    int id;
    static int idx = 0;

    public SV05062(String name, double gpa, double pts) {
        id = idx++;
        this.name = name;
        this.gpa = gpa;
        this.pts = pts;
        setStatus();
    }
    private void setStatus(){
        
        if(gpa >= 3.6 && pts >= 90) status = "XUATSAC";  
        else if(gpa >= 3.2 && pts >= 80) status = "GIOI";
        else if(gpa >= 2.5 && pts >= 70) status = "KHA";
        else status = "KHONG";
        
    }
    public void nope(){
        
        status = "KHONG";
        
    }
    @Override
    public int compareTo(SV05062 a){
        
        return Double.compare(a.gpa, gpa);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s: %s",name,status);
        
    }
    
}

public class J05062 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int q = sc.nextInt()-1;
        sc.nextLine();
        Vector<SV05062> v1 = new Vector<>();
        Vector<SV05062> v2 = new Vector<>();
        for(int i = 0; i < t; i++){

            SV05062 tmp = new SV05062(sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            sc.nextLine();
            v1.add(tmp);
            v2.add(tmp);

        }
        Collections.sort(v2);
        while(q < t-1 && v2.get(q).gpa == v2.get(q+1).gpa) q++;
        System.out.println(q);
        for(int i = q+1; i < t; i++) v1.get(v2.get(i).id).nope();
        for(SV05062 x:v1) System.out.println(x);
        sc.close();
    }

}

//3 2
//Nguyen Van Nam
//3.59 75
//Tran Hong Ngoc
//3.61 90
//Do Van An
//3.22 90