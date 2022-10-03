package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Goods05053 implements Comparator<Goods05053>{
    
    String id,name,idx;
    long cost,saleOff,total;

    public Goods05053() {
    }

    public Goods05053(String name, String id, long price, long num){
        this.name = name;
        this.id = id;
        this.cost = price*num;
        this.idx = id.substring(1,4);
        this.saleOff = Math.round(id.substring(id.length()-1).equals("1") ? 0.5*cost : 0.3*cost);
        this.total = cost-saleOff;
    }
    
    @Override
    public int compare(Goods05053 a, Goods05053 b){
        
        return a.idx.compareTo(b.idx);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %d",name,id,idx,saleOff,total);
        
    }
    
}

public class J05053 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<Goods05053> v = new Vector<>();
        while(t-->0){

            v.add(new Goods05053(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }
        Collections.sort(v,new Goods05053());
        for(Goods05053 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12