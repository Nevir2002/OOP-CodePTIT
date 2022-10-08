package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Goods05076{

    String id,name,type;
    long in,cost,out;
    double rate;

    public Goods05076() {
    }

    public Goods05076(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        if(type.equals("A")) rate = 1.08;
        if(type.equals("B")) rate = 1.05;
        if(type.equals("C")) rate = 1.02;
        
    }
    
    public void calc(long a, long b, long c){
        
        in = a;
        cost = b;
        out = (long)(cost*c*rate);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d", id,name,in*cost,out);
        
    }

}

public class J05076 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<Goods05076> v = new Vector<>();
        while(t-->0){

            v.add(new Goods05076(sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String id = sc.next();
            for(Goods05076 x:v){
                
                if(x.id.equals(id)){
                    
                    x.calc(sc.nextLong(), sc.nextLong(), sc.nextLong());
                    System.out.println(x);
                    break;
                    
                }
                
            }
            
        }

        sc.close();
    }

}

//2
//A001
//Tu lanh
//A
//P002
//May giat
//B
//2
//A001 500 100 300
//P002 1000 1000 500