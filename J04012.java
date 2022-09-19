package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class NV{
    
    String name,id;
    int wage,bonus,add,total;
    static int index = 1;
    
    NV(){}
    NV(String a, int b, int c, String d){
        
        id = String.valueOf(index++);
        if(id.length() < 2) id = '0' + id;
        id = "NV" + id;
        name = a;
        wage = b*c;
        if(c >= 25) bonus = 20;
        else if(c >= 22) bonus = 10;
        else bonus = 0;
        bonus = bonus * wage / 100;
        if(d.equals("GD")) add = 250000;        
        if(d.equals("PGD")) add = 200000;        
        if(d.equals("TP")) add = 180000;        
        if(d.equals("NV")) add = 150000;   
        total = wage+bonus+add;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + wage + " " + bonus + " " + add + " " + total);
        
    }
    
}

public class J04012 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        NV x = new NV(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
        x.print();

        sc.close();
    }

}