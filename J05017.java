package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH05017 implements Comparable<KH05017>{
    
    String id, name;
    long total;
    static int idx = 1;

    public KH05017() {
    }

    public KH05017(String name, int start, int end) {
        this.id = String.format("KH%02d",idx++);
        this.name = name;
        int diff = end-start;
        total = 0;
        double fee;
        if(diff > 100) fee = 0.05;
        else if(diff > 50) fee = 0.03;
        else fee = 0.02;
        if(diff > 100){
            
            total += 200*(diff-100);
            diff = 100;
            
        }
        if(diff > 50){
            
            total += 150*(diff-50);
            diff = 50;
            
        }
        if(diff > 0) total += 100*diff;
        total = Math.round(total*(1+fee));
        
    }
    
    @Override
    public int compareTo(KH05017 a){
        
        return Long.compare(a.total, this.total);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %d", id,name,total);
        
    } 
    
}

public class J05017 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<KH05017> v = new Vector<>();
        while(t-->0){

            v.add(new KH05017(sc.nextLine() ,Integer.parseInt(sc.nextLine()) ,Integer.parseInt(sc.nextLine()) ));

        }
        Collections.sort(v);
        for(KH05017 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}


//3
//Le Thi Thanh
//468
//500
//Le Duc Cong
//160
//230
//Ha Hue Anh
//410
//613