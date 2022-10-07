package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class GV05064{
    
    String id,name;
    long coeff,add,total;
    static int ht = 0, hp = 0;
    
    public GV05064() {
    }

    public GV05064(String id, String name, long base) {
        this.id = id;
        if(id.substring(0,2).equals("HT")){
            
            ht++;
            if(ht > 1) this.id = "";
            
        }
        if(id.substring(0,2).equals("HP")){
            
            hp++;
            if(hp > 2) this.id = "";
            
        }
        this.name = name;
        this.coeff = Integer.parseInt(id.substring(2));
        if(id.substring(0,2).equals("HT")) add = 2000000;
        else if(id.substring(0,2).equals("HP")) add = 900000;
        else if(id.substring(0,2).equals("GV")) add = 500000;
        else add = 0;
        this.total = base*coeff + add;
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d %d",id,name,coeff,add,total);
        
    }
    
}

public class J05064 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            GV05064 x = new GV05064(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()));
            if(x.id.length() > 0) System.out.println(x);

        }

        sc.close();
    }

}

//6
//GV01
//Nguyen Kim Loan
//1420000
//HP02
//LMAO
//1234
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000
//HP10
//xd
//12345
//HP20
//xdd
//123515