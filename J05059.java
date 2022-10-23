package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class TS05059 implements Comparable<TS05059>{
    
    String id,name;
    double bonus,total;

    public TS05059() {
    }

    public TS05059(String id, String name, double a, double b, double c) {
        this.id = id;
        this.name = name;
        bonus = 0;
        if(id.charAt(2) == '1') bonus = 0.5;
        if(id.charAt(2) == '2') bonus = 1;
        if(id.charAt(2) == '3') bonus = 2.5;
        total = a+a+b+c+bonus;
    }
    
    @Override
    public int compareTo(TS05059 a){
        
        return Double.compare(a.total, this.total);
        
    }
    @Override
    public String toString(){
        
        String bbonus,ttotal;
        if(bonus == Math.round(bonus)) bbonus = String.format("%.0f",bonus);
        else bbonus = String.format("%.1f",bonus);
        if(total == Math.round(total)) ttotal = String.format("%.0f",total);
        else ttotal = String.format("%.1f",total);
        return String.format("%s %s %s %s ", id,name,bbonus,ttotal);
        
    }
    
}

public class J05059 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<TS05059> v = new Vector<>();
        while(t-->0){

            v.add(new TS05059(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
            sc.nextLine();

        }
        Collections.sort(v);
        int q = sc.nextInt();
        double threshold = v.get(q-1).total;
        System.out.println(String.format("%.1f", threshold));
        for(TS05059 x:v){
            
            String status = "TRUNG TUYEN";
            if(x.total < threshold) status = "TRUOT";
            System.out.println(x + status);
            
        }

        sc.close();
    }

}

//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV3B123
//Ly Thi Thu Ha
//8
//6.5
//7
//1