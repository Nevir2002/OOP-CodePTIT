package codeptit;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

//@author Nevir2002

class PH07047{
    
    String id,name;
    double cost,fee;

    public PH07047(Scanner sc) {
        this.id = sc.next();
        this.name = sc.next();
        this.cost = sc.nextDouble();
        this.fee = sc.nextDouble();
        sc.nextLine();
    }
    
}
class KH07047 implements Comparable<KH07047>{
    
    String id,name,room;
    long diff;
    double total;
    static Vector<PH07047> v = new Vector<>();
    static int idx = 1;

    public KH07047(Scanner sc) throws Exception{
        this.id = String.format("KH%02d",idx++);
        this.name = sc.nextLine();
        this.room = sc.next();
        this.diff = diff(sc.next(),sc.next());
        if(sc.hasNext()) sc.nextLine();
        this.total = calc();
    }
    
    private long diff(String a, String b) throws Exception{
        
//        System.out.println(a + " " + b);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse(a);
        Date d2 = sdf.parse(b);
        return (d2.getTime()-d1.getTime())/1000/60/60/24;
        
    }
    
    private double calc(){
        
        double res = 0;
        String q = room.substring(2,3);
        for(PH07047 x:v){
            
            if(x.id.equals(q)){
                
                res = diff*x.cost;
                if(diff == 0) res = x.cost;
                res += res*x.fee;
                if(diff >= 30) res *= 0.94;
                else if(diff >= 20) res *= 0.96;
                else if(diff >= 10) res *= 0.98;
                break;
                
            }
            
        }
        return res;
    }
    public static void addPH(Scanner sc){
        
        v.add(new PH07047(sc));
        
    }
    @Override
    public int compareTo(KH07047 a){
        
        return Long.compare(a.diff, diff);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %.2f",id,name,room,diff,total);
        
    }
    
}

public class J07047 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        Vector<KH07047> v = new Vector<>();
        sc = new Scanner(new File("DATA.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) KH07047.addPH(sc);
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) v.add(new KH07047(sc));
        Collections.sort(v);
        for(KH07047 x:v) System.out.println(x);
    }

}