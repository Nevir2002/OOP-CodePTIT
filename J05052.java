package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Goods05052{
    
    String id,name;
    long cost,saleOff,total;

    public Goods05052() {
    }

    public Goods05052(String name, String id, long price, long num){
        this.name = name;
        this.id = id;
        this.cost = price*num;
        this.saleOff = Math.round(id.substring(id.length()-1).equals("1") ? 0.5*cost : 0.3*cost);
        this.total = cost-saleOff;
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %d",name,id,id.substring(1,4),saleOff,total);
        
    }
    
}

public class J05052 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new Goods05052(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

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