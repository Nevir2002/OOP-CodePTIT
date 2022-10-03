package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH05051 implements Comparator<KH05051>{
    
    String id;
    long coefficient,cost,add,total;
    static int idx = 1;

    public KH05051() {
    }

    public KH05051(String type, long n1, long n2) {
        id = String.format("KH%02d", idx++);
        if(type.equals("KD")) coefficient = 3;
        if(type.equals("NN")) coefficient = 5;
        if(type.equals("TT")) coefficient = 4;
        if(type.equals("CN")) coefficient = 2;
        cost = 550*coefficient*(n2-n1);
        if(n2-n1 > 100) add = cost;
        else if(n2-n1 >= 50) add = Math.round(cost/100.0*35);
        else add = 0;
        total = cost + add;
        
    }
    
    @Override
    public int compare(KH05051 a, KH05051 b){
        
        return Long.compare(b.total, a.total);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %d %d %d %d",id,coefficient,cost,add,total);
        
    }
    
}

public class J05051 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<KH05051> v = new Vector<>();
        while(t-->0){

            v.add(new KH05051(sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

        }
        Collections.sort(v,new KH05051());
        for(KH05051 x:v){
            
            System.out.println(x);
            
        }
        
        sc.close();
    }

}

//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700