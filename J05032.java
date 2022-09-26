package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class HOOMAN5032 implements Comparator<HOOMAN5032>{
    
    String name,dob;

    public HOOMAN5032() {
    }

    public HOOMAN5032(String[] s) {
        this.name = s[0];
        String[] x = s[1].split("/");
        this.dob = x[2] + x[1] + x[0];
    }
    
    
    @Override
    public int compare(HOOMAN5032 a, HOOMAN5032 b){
        
        return a.dob.compareTo(b.dob);
        
    }
    
    public void print(){
        
        System.out.println(name);

    }
    
}

public class J05032 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<HOOMAN5032> v = new Vector<>();
        for(int i = 0; i < t; i++){

            v.add(new HOOMAN5032(sc.nextLine().split(" ")));

        }
        Collections.sort(v, new HOOMAN5032());
        v.get(t-1).print();
        v.get(0).print();

        sc.close();
    }

}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990