package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class CreditClass05079 implements Comparator<CreditClass05079>{
    
    String id,name,group,instructor;

    public CreditClass05079() {
    }

    public CreditClass05079(String id, String name, String group, String instructor) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.instructor = instructor;
    }
    
    @Override
    public int compare(CreditClass05079 a, CreditClass05079 b){
        
        return a.group.compareTo(b.group);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s", group,instructor);
        
    }
}

public class J05079 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<CreditClass05079> v = new Vector<>();
        while(t-->0){

            v.add(new CreditClass05079(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new CreditClass05079());
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String id = sc.nextLine();
            for(CreditClass05079 x:v){
                
                if(x.id.equals(id)){
                    
                    System.out.println(String.format("Danh sach nhom lop mon %s:", x.name));
                    break;
                    
                }
                
            }
            
            for(CreditClass05079 x:v){
                
                if(x.id.equals(id)) System.out.println(x);
                
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
//THCS2D20