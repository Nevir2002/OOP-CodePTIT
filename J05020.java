package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5020 implements Comparator<SV5020>{
    
    String id,name,cls,email;

    public SV5020() {
    }

    public SV5020(String id, String name, String cls, String email) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.email = email;
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s", id, name, cls, email));
        
    }
    @Override
    public int compare(SV5020 a, SV5020 b){
        
        if(a.cls.compareTo(b.cls) == 0) return a.id.compareTo(b.id);
        return a.cls.compareTo(b.cls);
        
    }
    
}

public class J05020 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        Vector<SV5020> v = new Vector<>();
        while(t-- != 0){

            v.add(new SV5020(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new SV5020());
        for(SV5020 x:v) x.print();

        sc.close();
    }

}