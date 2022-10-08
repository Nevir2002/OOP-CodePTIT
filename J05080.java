package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class CreditClass05080 implements Comparator<CreditClass05080>{
    
    String id,name,group,instructor;

    public CreditClass05080() {
    }

    public CreditClass05080(String id, String name, String group, String instructor) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.instructor = instructor;
    }
    
    @Override
    public int compare(CreditClass05080 a, CreditClass05080 b){
        
        if(a.id.equals(b.id)) return a.group.compareTo(b.group);
        return a.id.compareTo(b.id);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s", id,name,group);
        
    }
}

public class J05080 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<CreditClass05080> v = new Vector<>();
        while(t-->0){

            v.add(new CreditClass05080(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new CreditClass05080());
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String name = sc.nextLine();
            System.out.println(String.format("Danh sach cho giang vien %s:", name));
            
            for(CreditClass05080 x:v){
                
                if(x.instructor.equals(name)) System.out.println(x);
                
            }
            
        }

        sc.close();
    }

}

//4
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//Nguyen Binh An