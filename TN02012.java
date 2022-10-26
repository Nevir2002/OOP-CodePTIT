package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Emp02012{
    
    String id,name,empID,empName;
    long total;
    
    public Emp02012() {
    }

    public Emp02012(String a, String b) {
        
        id = a;
        name = b;
        
    }
    
    public void set(String a, String b, long c, long d){
        
        empID = a;
        empName = b;
        c *= 1000;
        long rate = 1;
        int days = Integer.parseInt(a.substring(1,3));
        String type = a.substring(0,1);
        
        if(type.equals("A")){
            
            if(days <= 3) rate = 10;
            else if(days <= 8) rate = 12;
            else if(days <= 15) rate = 14;
            else rate = 20;
            
        }
        if(type.equals("B")){
            
            if(days <= 3) rate = 10;
            else if(days <= 8) rate = 11;
            else if(days <= 15) rate = 13;
            else rate = 16;
            
        }
        if(type.equals("C")){
            
            if(days <= 3) rate = 9;
            else if(days <= 8) rate = 10;
            else if(days <= 15) rate = 12;
            else rate = 14;
            
        }
        if(type.equals("D")){
            
            if(days <= 3) rate = 8;
            else if(days <= 8) rate = 9;
            else if(days <= 15) rate = 11;
            else rate = 13;
            
        }
        
        total = c*d*rate;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d", empID, empName,name, total);
        
    }
    
}

public class TN02012 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<Emp02012> v = new Vector<>();
        Vector<Emp02012> res = new Vector<>();
        while(t-->0){

            v.add(new Emp02012(sc.next(),sc.nextLine().trim()));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String id = sc.nextLine();
            for(Emp02012 x:v){
                
                if(x.id.equals(id.substring(3))){
                    
                    Emp02012 tmp = new Emp02012(x.id,x.name);
                    tmp.set(id,sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
                    res.add(tmp);
                    break;
                    
                }
                
            }
            
        }
//        System.out.println(v.size());
//        String q = sc.nextLine();
        for(Emp02012 x:res){
            
            System.out.println(x);
            
        }
        sc.close();
    }

}

//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24