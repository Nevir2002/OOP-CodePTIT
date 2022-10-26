package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SP07019{
    
    String id,name;
    long cost1,cost2;

    public SP07019(String id, String name, long cost1, long cost2) {
        this.id = id;
        this.name = name;
        this.cost1 = cost1;
        this.cost2 = cost2;
    }
    
}

class HD07019{
    
    String id,name;
    long sale,total;
    static int idx = 1;
    static Vector<SP07019> v = new Vector<>();

    public HD07019(String input) {
        String[] str = input.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(String x:str) if(x.length()>0) arr.add(x);
        id = String.format("%s-%03d",arr.get(0),idx++);
        int quantity = Integer.parseInt(arr.get(1));
        total = 0;
        sale = 0;
        for(SP07019 x:v){
            
            if(x.id.equals(id.substring(0,2))){
                
                name = x.name;
                if(id.charAt(2) == '1') total = quantity*x.cost1;
                else total = quantity*x.cost2;
                break;
                
            }
            
        }
        if(quantity >= 150) sale = total*50/100;
        else if(quantity >= 100) sale = total*30/100;
        else if(quantity >= 50) sale = total*15/100;
        total -= sale;
        
    }
    public static void addSP(Scanner sc){
        
        v.add(new SP07019(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d",id,name,sale,total);
        
    }
    
}

public class J07019 {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(new File("DATA1.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) HD07019.addSP(sc);
        sc = new Scanner(new File("DATA2.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) System.out.println(new HD07019(sc.nextLine()));
        
    }

}