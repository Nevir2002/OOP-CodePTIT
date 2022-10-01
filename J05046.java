package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P05046{
    
    String id,name;
    int add,total;
    static Map<String,Integer> mp = new HashMap<>();

    public P05046() {
    }

    public P05046(String name, int quantity, int cost) {
        String[] x = name.split(" ");
        String prodID = "";
        int i = 0;
        while(prodID.length() < 2){
            
            if(x[i].length() > 0) prodID += x[i].substring(0,1).toUpperCase();
            i++;
            
        }
        int idx = 1;
        if(mp.containsKey(prodID)){
            
           idx = mp.get(prodID)+1;
           mp.put(prodID, idx);
            
        } else mp.put(prodID, 1);
        this.id = String.format("%s%02d", prodID,idx);
        this.name = name;
        if(quantity > 10) add = cost*quantity/20;
        else if(quantity >= 8) add = cost*quantity/50;
        else if(quantity >= 5) add = cost*quantity/100;
        else add = 0;
        total = cost*quantity - add;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d", id,name,add,total);
        
    }
    
}

public class J05046 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new P05046(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));

        }

        sc.close();
    }

}

//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000