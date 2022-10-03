package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH05050{
    
    String id;
    long coefficient,cost,add,total;
    static int idx = 1;

    public KH05050() {
    }

    public KH05050(String type, long n1, long n2) {
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
    public String toString(){
        
        return String.format("%s %d %d %d %d",id,coefficient,cost,add,total);
        
    }
    
}

public class J05050 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            System.out.println(new KH05050(sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));

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