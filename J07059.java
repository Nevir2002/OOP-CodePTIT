package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;

class CT implements Comparator<CT>{
    
    String date,time,roomID,id;
    static int i = 1;
    CT(){}
    CT(String date, String time, String roomID){
        
        String id = String.valueOf(i++);
        while(id.length()< 3) id = '0' + id;
        this.id = "C" + id;
        this.date = date;
        this.time = time;
        this.roomID = roomID;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + date + " " + time + " " + roomID);
        
    }
    
    @Override
    public int compare(CT a, CT b){
        
        String[] a1 = a.date.split("/");
        String[] a2 = a.time.split(":");
        String[] b1 = b.date.split("/");
        String[] b2 = b.time.split(":");
        String t1 = a1[2]+a1[1]+a1[0]+a2[0]+a2[1]; 
        String t2 = b1[2]+b1[1]+b1[0]+b2[0]+b2[1];
        return t1.compareTo(t2);
        
    }
    
}

public class J07059 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<CT> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new CT(sc.nextLine(),sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new CT());
            for(CT x:v){

                x.print();

            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in