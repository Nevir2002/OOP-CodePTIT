package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class NV05038{
    
    String id,name;
    int wage,bonus,pos,total;
    static int idx = 1, sum = 0;

    public NV05038() {
    }

    public NV05038(String name, int wage, int days, String pos) {
        
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
    public String toString(){
        
        return String.format("%s %s %d %d %d %d", id, name, wage,bonus,pos,total);
        
    }
    
}

public class J05038 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new NV05038(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine()));

        }
        
        System.out.println("Tong chi phi tien luong: " + new NV05038().sum);

        sc.close();
    }

}

//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV