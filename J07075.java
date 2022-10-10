package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class MH07075{
    
    String zz,id,name,credits;

    public MH07075() {
    }

    public MH07075(String id, String name, String credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }
    
    
}

class HP07075 implements Comparator<HP07075>{
    
    String zz,id, name, date, period, teacherName, room;
    static int idx = 1;
    static ArrayList<MH07075> subjects = new ArrayList<>();

    public HP07075() {
    }

    public HP07075(String id, String date, String period, String teacherName, String room) {
        this.zz = String.format("HP%03d",idx++);
        this.id = id;
        this.date = date;
        this.period = period;
        this.teacherName = teacherName;
        this.room = room;
    }
    
    public String getZz(){
        
        for(MH07075 x:subjects){
            
            if(x.id.equals(this.id)) return x.zz;
            
        }
            
        return "Not found";
    }
    public String getSubjectName(){
        
        for(MH07075 x:subjects){
            
            if(x.id.equals(this.id)) return x.name;
            
        }
            
        return "Not found";
    }
    public String getSubjectCredits(){
        
        for(MH07075 x:subjects){
            
            if(x.id.equals(this.id)) return x.credits;
            
        }
            
        return "Not found";
    }
    
    @Override
    public int compare(HP07075 a,HP07075 b){
        
        if(a.date.equals(b.date) && a.period.equals(b.period)) return a.teacherName.compareTo(b.teacherName);
        if(a.date.equals(b.date)) return a.period.compareTo(b.period);
        return a.date.compareTo(b.date);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %s",zz,getSubjectName(),date,period,room);
        
    }
    
}

public class J07075 {

    public static void main(String arg[]) throws Exception{

        Scanner sc = new Scanner(new File("MONHOC.in"));

        int t = Integer.parseInt(sc.nextLine());
        Vector<HP07075> v = new Vector<>();
        while(t-->0){
            
            HP07075.subjects.add(new MH07075(sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim()));

        }
        sc = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            v.add(new HP07075(sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim(),sc.nextLine().trim()));
            
        }
        Collections.sort(v,new HP07075());
        String q = sc.nextLine().trim();
        System.out.println("LICH GIANG DAY GIANG VIEN " + q + ":");
        for(HP07075 x:v){
            
            if(x.teacherName.equals(q)) System.out.println(x);
            
        }

        sc.close();
    }

}