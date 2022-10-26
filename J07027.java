package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV07027{
    
    String id,name,tel;

    public SV07027(Scanner sc) {
        this.id = sc.nextLine();
        this.name = sc.nextLine();
        this.tel = sc.nextLine();
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s",id,name,tel);
        
    }
    
}
class BT07027{
    
    int id;
    String name;
    static int idx = 1;

    public BT07027(Scanner sc) {
        id = idx++;
        this.name = sc.nextLine();
    }
    @Override
    public String toString(){
        
        return String.format("%s %s",id,name);
        
    }
    
}
class GR07027 implements Comparable<GR07027>{
    
    SV07027 sv;
    BT07027 bt;
    static Vector<SV07027> vSV = new Vector<>();
    static Vector<BT07027> vBT = new Vector<>();
    public GR07027(Scanner sc){
        
        String idSV = sc.next();
        int idBT = sc.nextInt();
        for(SV07027 x:vSV){
            
            if(idSV.equals(x.id)){
                
                sv = x;
                break;
                
            }
            
        }
        bt = vBT.get(idBT-1);
        
    }
    public static void addSV(Scanner sc){
        
        vSV.add(new SV07027(sc));
        
    }
    public static void addBT(Scanner sc){
        
        vBT.add(new BT07027(sc));
        
    }
    @Override
    public int compareTo(GR07027 a){
        
        return sv.id.compareTo(a.sv.id);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s",sv,bt);
        
    }
    
}

public class J07027 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        sc = new Scanner(new File("SINHVIEN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) GR07027.addSV(sc);
        sc = new Scanner(new File("BAITAP.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) GR07027.addBT(sc);
        sc = new Scanner(new File("NHOM.in"));
        Vector<GR07027> v = new Vector<>();
        while(sc.hasNext()) v.add(new GR07027(sc));
        Collections.sort(v);
        for(GR07027 x:v){
            
            System.out.println(x);
            
        }
        
    }

}