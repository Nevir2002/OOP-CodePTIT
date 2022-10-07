package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class MH05067{
    
    String id,brand;
    long base,tax,total;
    double taxRate;

    public MH05067() {
    }

    public MH05067(String input) {
        String[] s = input.split(" ");
        id = s[0];
        int quantity = Integer.parseInt(s[1]);
        if(id.substring(0,1).equals("X")){
            
            base = 128000;
            taxRate = 0.03;
            
        }
        if(id.substring(0,1).equals("D")){
            
            base = 11200;
            taxRate = 0.035;
            
        }
        if(id.substring(0,1).equals("N")){
            
            base = 9700;
            taxRate = 0.02;
            
        }
        if(id.substring(3).equals("BP")) brand = "British Petro";
        if(id.substring(3).equals("ES")) brand = "Esso";
        if(id.substring(3).equals("SH")) brand = "Shell";
        if(id.substring(3).equals("CA")) brand = "Castrol";
        if(id.substring(3).equals("MO")) brand = "Mobil";
        if(id.substring(3).equals("TN")){
            
            brand = "Trong Nuoc";
            taxRate = 0;
            
        }
        tax = (long)(base*quantity*taxRate);
        total = base*quantity + tax;
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d %d", id, brand, base, tax, total);
        
    }
    
}

public class J05067 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new MH05067(sc.nextLine()));

        }

        sc.close();
    }

}

//4
//N89BP 4500
//D00BP 3500
//X92SH 2600
//X11TN 12304