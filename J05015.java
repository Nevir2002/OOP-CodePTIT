package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class XD05015 implements Comparable<XD05015>{
    
    String id,name,city,time;
    int velocity;

    public XD05015(String name, String city, String time) {
        String[] s1 = name.split(" ");
        String[] s2 = city.split(" ");
        id = "";
        for(String x:s2) if(x.length()>0) id += x.substring(0,1);
        for(String x:s1) if(x.length()>0) id += x.substring(0,1);
        this.name = name;
        this.city = city;
        this.time = time;
        String[] t = time.split(":");
        velocity = Math.round(120/((Float.parseFloat(t[0])*60 + Float.parseFloat(t[1]) - 6*60)/60));
        
    }
    @Override
    public int compareTo(XD05015 a){
        
        return this.time.compareTo(a.time);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d Km/h",id,name,city,velocity);
        
    }
    
}

public class J05015 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<XD05015> v = new Vector<>();
        while(t-->0){

            v.add(new XD05015(sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v);
        for(XD05015 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}


//3
//Tran Vu Minh
//Ha Noi
//8:30
//Vu Ngoc Hoang
//Hoa Binh
//8:20
//Pham Dinh Tan
//An Giang
//8:45