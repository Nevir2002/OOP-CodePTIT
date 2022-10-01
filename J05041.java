package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class NV05041 implements Comparator<NV05041>{
    
    String id,name;
    int wage,bonus,pos,total;
    static int idx = 1, sum = 0;

    public NV05041() {
    }

    public NV05041(String name, int wage, int days, String pos) {
        
        this.id = String.format("NV%02d", idx++);
        this.name = name;
        this.wage = wage*days;
        if(days >= 25) this.bonus = this.wage/5;
        else if(days >= 22) this.bonus = this.wage/10;
        else this.bonus = 0;
        if(pos.equals("GD")) this.pos = 250000;
        else if(pos.equals("PGD")) this.pos = 200000;
        else if(pos.equals("TP")) this.pos = 180000;
        else if(pos.equals("NV")) this.pos = 150000;
        this.total = this.wage + this.bonus + this.pos;
        sum += this.total;
        
    }
    
    @Override
    public int compare(NV05041 a, NV05041 b){
        
        return b.total - a.total;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d %d %d", id, name, wage,bonus,pos,total);
        
    }
    
}

public class J05041 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<NV05041> v = new Vector<>();
        while(t-->0){

            v.add(new NV05041(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));

        }
        Collections.sort(v, new NV05041());
        for(NV05041 x:v){
            
            System.out.println(x);
            
        }
        
        sc.close();
    }

}

//3
//Cao Van Vu
//50000
//26
//GD
//Truong Thi Tu Linh
//45000
//22
//NV
//Do Van Truong
//40000
//25
//PGD