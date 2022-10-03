package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Goods05049 implements Comparator<Goods05049>{
    
    String id,init,end;
    int in,out,cost,total,tax;

    public Goods05049() {
    }

    public Goods05049(String id, int in) {
        this.id = id;
        this.init = id.substring(0,1);
        this.in = in;
        this.end = id.substring(id.length()-1);
        this.out = (int) (init.equals("A")? Math.round(in*0.6) : Math.round(in*0.7));
        this.cost = end.equals("Y") ? 110000 : 135000;
        this.total = out*cost;
        if(init.equals("A") && end.equals("Y")) this.tax = (int) (0.08*total);
        if(init.equals("A") && end.equals("N")) this.tax = (int) (0.11*total);
        if(init.equals("B") && end.equals("Y")) this.tax = (int) (0.17*total);
        if(init.equals("B") && end.equals("N")) this.tax = (int) (0.22*total);
    }
    @Override
    public int compare(Goods05049 a, Goods05049 b){
        
        return b.tax - a.tax;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %d %d %d %d %d",id,in,out,cost,total,tax);
        
    }
   
}

public class J05049 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<Goods05049> v = new Vector<>();
        while(t-->0){

            v.add(new Goods05049(sc.nextLine(),Integer.parseInt(sc.nextLine())));

        }
        Collections.sort(v,new Goods05049());
        String q = sc.nextLine();
        for(Goods05049 x:v) if(x.init.equals(q)) System.out.println(x);

        sc.close();
    }

}

//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B