package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV05042 implements Comparator<SV05042>{
    
    String name;
    int ac,sub;

    public SV05042() {
    }

    public SV05042(String name, String[] a) {
        this.name = name;
        this.ac = Integer.parseInt(a[0]);
        this.sub = Integer.parseInt(a[1]);
    }
    
    @Override
    public int compare(SV05042 a, SV05042 b){
        
        if(a.ac == b.ac && a.sub == b.sub) return a.name.compareTo(b.name);
        if(a.ac == b.ac) return a.sub-b.sub;
        return b.ac-a.ac;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %d %d", name,ac,sub);
        
    }
    
}

public class J05042 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<SV05042> v = new Vector<>();
        while(t-->0){

            v.add(new SV05042(sc.nextLine(),sc.nextLine().split(" ")));

        }
        Collections.sort(v, new SV05042());
        for(SV05042 x:v){
            
            System.out.println(x);
            
        }
        
        sc.close();
    }

}

//4
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 500
//nbt
//169 1000000
//xxx
//167 1

