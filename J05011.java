package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SmthSmth implements Comparator<SmthSmth>{
    
    String id, name;
    int mins;

    public SmthSmth() {
    }

    public SmthSmth(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.mins = getTime(out) - getTime(in);
    }
    
    private int getTime(String s){
        
        String[] x = s.split(":");
        return Integer.parseInt(x[0])*60 + Integer.parseInt(x[1]);
        
    }
    
    public void print(){
        
        int m = mins%60;
        int h = (int)(mins/60);
        System.out.println(String.format("%s %s %d gio %d phut",id,name,h,m));
        
    }
    
    @Override
    public int compare(SmthSmth a, SmthSmth b){
        
        return b.mins - a.mins;
        
    }
    
}

public class J05011 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        Vector<SmthSmth> v = new Vector<>();
        while(t-- != 0){

            v.add(new SmthSmth(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v, new SmthSmth());
        for(SmthSmth x:v) x.print();

        sc.close();
    }

}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00