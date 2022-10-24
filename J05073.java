package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class C05073{
    
    String id;
    double total;

    public C05073(String id, double cost, double irr) {
        this.id = id;
        double tax=0;
        double transport=0;
        if(id.charAt(0)=='T'){
            tax = 0.29;
            transport = 0.04;
        }
        if(id.charAt(0)=='C'){
            tax = 0.1;
            transport = 0.03;
        }
        if(id.charAt(0)=='D'){
            tax = 0.08;
            transport = 0.025;
        }
        if(id.charAt(0)=='M'){
            tax = 0.02;
            transport = 0.005;
        }
        if(id.charAt(id.length()-1) == 'C') tax *= 0.95;
        total = (cost*(1+tax+transport))*1.2;
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %.2f", id,total);
        
    }
}

public class J05073 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
//        Vector<> v = new Vector<>();
        while(t-->0){

            System.out.println(new C05073(sc.next(),sc.nextDouble(),sc.nextDouble()));

        }
//        Collections.sort(v);
//        for( x:v) System.out.println(x);
        sc.close();
    }

}

//2
//TTVC 400 300
//CCAK 200 200