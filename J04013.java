package codeptit;

import java.util.*;

class TS{
    
    String id,name,status;
    double a,b,c,bonus,total;
    
    TS(String s1, String s2, double n1, double n2, double n3){
        
        id = s1;
        name = s2;
        a = n1;
        b = n2;
        c = n3;
        if(id.substring(0,3).equals("KV1")) bonus = 0.5;
        else if(id.substring(0,3).equals("KV2")) bonus = 1;
        else if(id.substring(0,3).equals("KV3")) bonus = 2.5;
        else bonus = 0;
        total = a*2+b+c;
        if(total+bonus >= 24) status = "TRUNG TUYEN";
        else status = "TRUOT";
        
    }
    
    public void print(){
        
        String totall,bonuss;
        if(total == (int)total){
            
            totall = String.valueOf((int)(total));
            
        } else {
            
            totall = String.format("%.1f",total);
            
        }
        if(bonus == (int)bonus){
            
            bonuss = String.valueOf((int)(bonus));
            
        } else {
            
            bonuss = String.format("%.1f",bonus);
            
        }
        System.out.println(id + " " + name + " " + bonuss + " " + totall + " " + status);
        
    }
    
}

class cmpTS implements Comparator<TS>{
    
    @Override
    public int compare(TS a, TS b){
        
        if(a.total == b.total) return a.id.compareTo(b.id);
        else{
            
            if(b.total - a.total < 0) return -1;
            if(b.total - a.total > 0) return 1;
            
        }
        return 0;
        
    }
    
}

public class J04013 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        TS x = new TS(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        x.print();
        sc.close();
    }

}