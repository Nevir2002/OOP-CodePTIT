package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Goods06001{
    
    String id1,id2,name;
    long cost1,cost2;

    public Goods06001(String id, String name, long cost1, long cost2) {
        this.id1 = id+"1";
        this.id2 = id+"2";
        this.name = name;
        this.cost1 = cost1;
        this.cost2 = cost2;
    }
    
}
class Bill06001{
    
    String id,name;
    static int idx = 1;
    long cost,total,fix;

    public Bill06001(String input, Vector<Goods06001> v) {
        String[] str = input.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for(String x:str) if(x.length()>0) a.add(x);
        id = String.format("%s-%03d",a.get(0),idx++);
        String q = a.get(0);
        for(Goods06001 x:v){
            
            if(q.equals(x.id1)){
                
                cost = x.cost1;
                name = x.name;
                break;
                
            }
            if(q.equals(x.id2)){
                cost = x.cost2;
                name = x.name;
                break;
                
            }
            
        }
        int quantity = Integer.parseInt(a.get(1));
        total = cost*quantity;
        fix = 0;
        if(quantity >= 150) fix = total*50/100;
        else if(quantity >= 100) fix = total*30/100;
        else if(quantity >= 50) fix = total*15/100;
        total -= fix;
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d",id,name,fix,total);
        
    }
    
}

public class J06001 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<Goods06001> v = new Vector<>();
        Vector<Bill06001> res = new Vector<>();
        while(t-->0){

            v.add(new Goods06001(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            res.add(new Bill06001(sc.nextLine(),v));
            
        }
//        Collections.sort(v);
        for(Bill06001 x:res) System.out.println(x);
        sc.close();
    }

}

//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105