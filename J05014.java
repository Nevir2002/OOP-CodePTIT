package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class GV05014 implements Comparable<GV05014>{
    
    String id, name, status, subject;
    double p1,p2,avg,bonus;
    static int idx = 1;

    public GV05014() {
    }

    public GV05014(String name, String code, double p1, double p2) {
        this.id = String.format("GV%02d", idx++);
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        if(code.charAt(0) == 'A') subject = "TOAN";
        if(code.charAt(0) == 'B') subject = "LY";
        if(code.charAt(0) == 'C') subject = "HOA";
        bonus = 0;
        if(code.charAt(1) == '1') bonus = 2;
        if(code.charAt(1) == '2') bonus = 1.5;
        if(code.charAt(1) == '3') bonus = 1;
        this.avg = this.p1*2+this.p2 + bonus;
        if(avg < 18) status = "LOAI";
        else status = "TRUNG TUYEN";
        
    }
    @Override
    public int compareTo(GV05014 a){
        
        return Double.compare(a.avg, this.avg);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %.1f %s", id, name, subject, avg, status);
        
    }
    
}

public class J05014 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<GV05014> v = new Vector<>();
        while(t-->0){

            v.add(new GV05014(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));

        }
        Collections.sort(v);
        for(GV05014 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0