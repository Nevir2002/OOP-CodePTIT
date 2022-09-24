package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV5021 implements Comparator<SV5021>{
    
    String id,name,cls,email;

    public SV5021() {
    }

    public SV5021(String id, String name, String cls, String email) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.email = email;
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s", id, name, cls, email));
        
    }
    @Override
    public int compare(SV5021 a, SV5021 b){
        
        return a.id.compareTo(b.id);
        
    }
    
}

public class J05021 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Vector<SV5021> v = new Vector<>();
        while(sc.hasNext()){

            v.add(new SV5021(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(v,new SV5021());
        for(SV5021 x:v) x.print();

        sc.close();
    }

}
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT03-B
//sv4@stu.ptit.edu.vn