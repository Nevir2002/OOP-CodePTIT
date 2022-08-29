package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Hotel implements Comparable<Hotel>{
    
    String id,name,room,d1,d2;
    long dd;
    Hotel(String a, String b, String c, String d, String e){
        
        id = e;
        name = a;
        room = b;
        d1 = c;
        d2 = d;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(d2);
            long diffTime = date2.getTime() - date1.getTime();
            long dateDiff = (int)(diffTime / (1000*60*60*24));
            dd = dateDiff;
            
        }catch(ParseException er){
            
            System.out.println(er);
            
        }
        
    }
    
    public int compareTo(Hotel a){
        
        return (int)(a.dd - dd);
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + room + " " + dd);
        
    }
    
}

public class J07046 {

    public static void main(String[] args){
        
        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<Hotel> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                String t = String.valueOf(i+1);
                if(t.length() < 2) t = '0' + t;
                t = "KH" + t;
                v.add(new Hotel(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),t));
                
            }

            Collections.sort(v);
            
            for(Hotel x:v){
                
                x.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
}