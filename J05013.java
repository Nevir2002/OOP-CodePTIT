package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class TS05013 implements Comparable<TS05013>{
    
    String id, name, status;
    double p1,p2,avg;
    static int idx = 1;

    public TS05013() {
    }

    public TS05013(String name, double p1, double p2) {
        this.id = String.format("TS%02d", idx++);
        this.name = name;
        this.p1 = calc(p1);
        this.p2 = calc(p2);
        this.avg = (this.p1+this.p2)/2;
        if(avg < 5) status = "TRUOT";
        else if(avg < 8) status = "CAN NHAC";
        else if(avg < 9.5) status = "DAT";
        else status = "XUAT SAC";
        
    }
    private double calc(double a){
        
        if(a > 10) return a/10;
        return a;
        
    }
    @Override
    public int compareTo(TS05013 a){
        
        return Double.compare(a.avg, this.avg);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %.2f %s", id, name, avg, status);
        
    }
    
}

public class J05013 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<TS05013> v = new Vector<>();
        while(t-->0){

            v.add(new TS05013(sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));

        }
        Collections.sort(v);
        for(TS05013 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//Nguyen Thai Binh
//45
//75
//Le Cong Hoa
//4
//4.5
//Phan Van Duc
//56
//56