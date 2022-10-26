package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class MT07060{
    
    String id,name,test;

    public MT07060(Scanner sc) {
        id = sc.nextLine();
        name = sc.nextLine();
        test = sc.nextLine();
    }
    
}
class CT07060{
    
    String date,time,room;

    public CT07060(Scanner sc) {
        date = sc.nextLine();
        time = sc.nextLine();
        room = sc.nextLine();
    }
    
}
class LT07060 implements Comparable<LT07060>{
    
    String id,idMT,gr,num;
    MT07060 mt;
    CT07060 ct;
    static Vector<MT07060> vMT = new Vector<>();
    static Vector<CT07060> vCT = new Vector<>();
    public LT07060(Scanner sc){
        
        id = sc.next();
        idMT = sc.next();
        gr = sc.next();
        num = sc.next();
        for(MT07060 x:vMT){
            
            if(x.id.equals(idMT)){
                
                mt = x;
                break;
                
            }
            
        }
        int idx = Integer.parseInt(id.substring(1));
        ct = vCT.get(idx-1);
        
    }
    public static void addMT(Scanner sc){
        
        vMT.add(new MT07060(sc));
        
    }
    public static void addCT(Scanner sc){
        
        vCT.add(new CT07060(sc));
        
    }
    @Override
    public int compareTo(LT07060 a){
        
        String[] str1 = ct.date.split("/");
        String[] str2 = a.ct.date.split("/");
        String d1 = str1[2]+str1[1]+str1[0];
        String d2 = str2[2]+str2[1]+str2[0];
        if(d1.equals(d2) && ct.time.equals(a.ct.time)) return id.compareTo(a.id);
        if(d1.equals(d2)) return ct.time.compareTo(a.ct.time);
        return d1.compareTo(d2);
        
                
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %s %s",ct.date,ct.time,ct.room,mt.name,gr,num);
        
    }
    
}

public class J07060 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        Vector<LT07060> v = new Vector<>();
        sc = new Scanner(new File("MONTHI.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) LT07060.addMT(sc);
        sc = new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) LT07060.addCT(sc);
        sc = new Scanner(new File("LICHTHI.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) v.add(new LT07060(sc));
        Collections.sort(v);
        for(LT07060 x:v) System.out.println(x);
    }

}