package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P05055{
    
    String id,name,time,bonus,total;
    static int idx = 1;

    public P05055() {
    }

    public P05055(String name, String dob, String t1, String t2) {
        id = String.format("VDV%02d",idx++);
        this.name = name;
        time = toTime(calc(t2)-calc(t1));
        int age = age(dob);
        if(age < 18) bonus = toTime(0);
        else if(age < 25) bonus = toTime(1);
        else if(age < 32) bonus = toTime(2);
        else bonus = toTime(3);
        total = toTime(calc(time)-calc(bonus));
                
    }
    
    public long calc(String s){
        
        String[] x = s.split(":");
        return Long.parseLong(x[0])*3600 + Long.parseLong(x[1])*60 + Long.parseLong(x[2]);
        
    }
    
    private String toTime(long t){
        
        return String.format("%02d:%02d:%02d",t/3600,(t%3600)/60,t%60);
        
    }
    
    private int age(String s){
        
        String[] x = s.split("/");
        return 2020-Integer.parseInt(x[2])+1;
        
    }
    
    public void print(){
        
        System.out.print(String.format("%s %s %s %s %s ",id,name,time,bonus,total));
        
    }
    
}

public class J05055 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<P05055> v = new Vector<>();
        Vector<String> vidx = new Vector<>();
        while(t-->0){

            P05055 p = new P05055(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            v.add(p);
            vidx.add(p.total);
        }
        Collections.sort(vidx);
        for(P05055 x:v){
            
            x.print();
            System.out.println(vidx.indexOf(x.total)+1);
            
        }
        sc.close();
    }

}

//5
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:12:01
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30


//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30