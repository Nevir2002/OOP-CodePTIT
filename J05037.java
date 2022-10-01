package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002
class MH05037 implements Comparator<MH05037>{
    
    String id,name,unit;
    long total,fee,sell;
    static int idx = 1;
    public MH05037() {
    }
    public MH05037(String name, String unit, long cost, long quantity){
        
        this.id = String.format("MH%02d",idx++);
        this.name = name;
        this.unit = unit;
        
        fee = Math.round((cost*quantity)/20);
        total = cost*quantity + fee;
        sell = (long) Math.ceil(total*1.02/quantity/100)*100;
        
    }
    
    @Override
    public int compare(MH05037 a, MH05037 b){
        
        return (int)(b.sell-a.sell);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %d %d", id,name,unit,fee,total,sell);
        
    }
    
}

public class J05037 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<MH05037> v = new Vector<>();

        while(t-->0){

            v.add(new MH05037(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }

        Collections.sort(v, new MH05037());
        for(MH05037 x:v){
            
            System.out.println(x);
            
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