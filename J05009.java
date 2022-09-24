package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5009 {
    
    int id;
    String name,dob;
    double total;
    static int index = 1;

    public SV5009() {
    }

    public SV5009(String name, String dob, double a, double b, double c) {
        this.id = index++;        
        this.name = name;
        this.dob = dob;
        this.total = a+b+c;
        
    }

    public void print(){

        System.out.println(String.format("%s %s %s %.1f",id,name,dob,total));

    }    
    
}

public class J05009 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        double res = 0;
        Vector<SV5009> v = new Vector<>();
        while(t-- != 0){

            SV5009 x = new SV5009(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            v.add(x);
            res = Math.max(res,x.total);
            
        }
        for(SV5009 x:v) if(x.total == res) x.print();

        sc.close();
    }

}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5