package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002
class MH05036{
    
    String id,name,unit;
    long total,fee,sell;
    static int idx = 1;
    public MH05036() {
    }
    public MH05036(String name, String unit, long cost, long quantity){
        
        this.id = String.format("MH%02d",idx++);
        this.name = name;
        this.unit = unit;
        
        fee = Math.round((cost*quantity)/20);
        total = cost*quantity + fee;
        sell = Math.round(total*1.02);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %d %d", id,name,unit,fee,total,sell);
        
    }
    
}

public class J05036 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new MH05036(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }

        sc.close();
    }

}

//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430