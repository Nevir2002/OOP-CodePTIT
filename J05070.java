package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class FB05070{
    
    String id,name;
    long cost;

    public FB05070() {
    }

    public FB05070(String id, String name, long cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    
    
}

class GM5070 implements Comparator<GM5070>{
    
    String id,name;
    long total;

    public GM5070() {
    }

    public GM5070(String id, String name, long total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }
    
    @Override
    public int compare(GM5070 a, GM5070 b){
        
        return Double.compare(b.total, a.total);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %d", id,name,total);
        
    }
    
}

public class J05070 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<FB05070> v = new Vector<>();
        while(t-->0){

            v.add(new FB05070(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine())));

        }
        t = Integer.parseInt(sc.nextLine());
        Vector<GM5070> vx = new Vector<>();
        while(t-->0){
            
            String id = sc.next();
            long quantity = sc.nextLong();
            for(FB05070 x:v){
                
                if(x.id.equals(id.substring(1,3))){
                    
                    vx.add(new GM5070(id,x.name,x.cost*quantity));
                    break;
                    
                }
                
            }
            
        }
        Collections.sort(vx,new GM5070());
        for(GM5070 x:vx){

            System.out.println(x);

        }

        sc.close();
    }

}

//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 600000