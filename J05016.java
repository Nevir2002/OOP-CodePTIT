package codeptit;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//@author Nevir2002

class KS05016 implements Comparable<KS05016>{
    
    String id,name,room;
    int dates, total;
    static int idx = 1;

    public KS05016(String name, String room, String d1, String d2, int add) throws ParseException {
        id = String.format("KH%02d",idx++);
        this.name = name.trim();
        this.room = room.trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date n1 = sdf.parse(d1);
        Date n2 = sdf.parse(d2);
        dates = (int)((n2.getTime()-n1.getTime())/1000/60/60/24)+1;
        int cost = 0;
        char x = room.charAt(0);
        if(x == '1') cost = 25;
        if(x == '2') cost = 34;
        if(x == '3') cost = 50;
        if(x == '4') cost = 80;
        total = cost*dates + add;
        
    }
    @Override
    public int compareTo(KS05016 a){
        
        return a.total - this.total;
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %d", id,name,room,dates,total);
        
    }
    
}

public class J05016 {

    public static void main(String[] args) throws ParseException{

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<KS05016> v = new Vector<>();
        while(t-->0){

            v.add(new KS05016(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));

        }
        Collections.sort(v);
        for(KS05016 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//Huynh Van Thanh   
//103 
//05/06/2010   
//05/06/2010   
//15
//Le Duc Cong  
//106 
//08/03/2010   
//01/05/2010   
//220
//Tran Thi Bich Tuyen   
//207 
//10/04/2010   
//21/04/2010   
//96