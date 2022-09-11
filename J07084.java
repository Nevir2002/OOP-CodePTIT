package codeptit;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//@author Nevir2002

class NameAndTime implements Comparator<NameAndTime>{
    
    String name,start,end;
    long diff;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    NameAndTime(){};
    NameAndTime(String a, String b, String c){
        
        name = a;
        start = b;
        end = c;
        diff = 0;
        try{
            
            Date d1 = sdf.parse(start);
            Date d2 = sdf.parse(end);
            diff = (d2.getTime() - d1.getTime()) / 1000 / 60; //millisecs to minutes
            
            
        }catch(ParseException e){
            
            System.out.println(e);
            
        }
        
    }
    
    public void print(){
        
        System.out.println(name + " " + diff);
        
    }
    
    @Override
    public int compare(NameAndTime a, NameAndTime b){
        
        if(a.diff == b.diff) return a.name.compareTo(b.name);
        return (int)(b.diff - a.diff);
        
    }
    
}

public class J07084 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("ONLINE.in"));
            
            int n = Integer.parseInt(sc.nextLine());
            Vector<NameAndTime> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new NameAndTime(sc.nextLine(),sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new NameAndTime());
            for(NameAndTime x:v){
                
                x.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
        
    }

}