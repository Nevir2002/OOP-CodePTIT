package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class CH050512 implements Comparable<CH050512>{
    
    String id,name,brand;
    long quantity,cost,sub,total;
    
    public CH050512() {
    }

    public CH050512(String id, String nameAndBrand, long quantity, long cost, long sub) {
        this.id = id;
        String[] str = nameAndBrand.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(String x:str) if(x.length()>0) arr.add(x);
        this.name = "";
        for(int i = 0; i < arr.size()-1; i++){
            
            this.name += arr.get(i) + " ";
            
        }
        this.name = this.name.substring(0,this.name.length()-1);
        this.brand = arr.get(arr.size()-1);
        this.quantity = quantity;
        this.cost = cost;
        this.sub = sub;
        this.total = quantity*cost - sub;
    }
    
    @Override
    public int compareTo(CH050512 a){
        
        return Long.compare(a.total, this.total);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %d %d %d", id,name,brand,quantity,cost,sub,total);
        
    }
    
}

public class J05012 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<CH050512> v = new Vector<>();
        while(t-->0){

            v.add(new CH050512(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }
        Collections.sort(v);
        for(CH050512 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//ML01
//May lanh SANYO
//12
//4000000
//2400000
//ML02
//May lanh HITACHI
//4
//2550000000
//0
//ML03
//May lanh NATIONAL
//5
//3000000
//150000