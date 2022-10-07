package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class FB05069{
    
    String id,name;
    long cost;

    public FB05069() {
    }

    public FB05069(String id, String name, long cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    
    
}

public class J05069 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<FB05069> v = new Vector<>();
        while(t-->0){

            v.add(new FB05069(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine())));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String id = sc.next();
            long quantity = sc.nextLong();
            for(FB05069 x:v){
                
                if(x.id.equals(id.substring(1,3))){
                    
                    System.out.println(String.format("%s %s %d",id,x.name,x.cost*quantity));
                    break;
                    
                }
                
            }
            
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
//EMU2 60000