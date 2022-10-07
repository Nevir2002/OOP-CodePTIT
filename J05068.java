package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class MH05068 implements Comparator<MH05068>{
    
    String id,brand;
    long base,tax,total;
    double taxRate;

    public MH05068() {
    }

    public MH05068(String input) {
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
    public int compare(MH05068 a, MH05068 b){
        
        return Double.compare(b.total,a.total);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d %d", id, brand, base, tax, total);
        
    }
    
}

public class J05068 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());    
        Vector<MH05068> v = new Vector<>();
        while(t-->0){

            v.add(new MH05068(sc.nextLine()));

        }
        Collections.sort(v,new MH05068());
        for(MH05068 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//4
//N89BP 4500
//D00BP 3500
//X92SH 2600
//X11TN 12304