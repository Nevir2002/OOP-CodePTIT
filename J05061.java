package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class PH05061 implements Comparator<PH05061>{
    
    String id,name,rating;
    int age;
    int total;
    static int idx = 1;

    public PH05061() {
    }

    public PH05061(String name, String dob, double p1, double p2) {
        id = String.format("PH%02d", idx++);
        this.name = name;
        age = 2020-Integer.parseInt(dob.substring(6))+1;
        double bonus = 0;
        if(p1 >= 8 && p2 >= 8) bonus = 1;
        else if(p1 >= 7.5 && p2 >= 7.5) bonus = 0.5;
        total = Math.min(10,(int) Math.round((p1+p2)/2+bonus));
        if(total >= 9) rating = "Xuat sac";
        else if(total >= 8) rating = "Gioi";
        else if(total >= 7) rating = "Kha";
        else if(total >= 5) rating = "Trung binh";
        else rating = "Truot";
        
    }
    
    @Override
    public int compare(PH05061 a, PH05061 b){
        
        return b.total - a.total;
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d %s", id, name, age, total, rating);
        
    }
    
}

public class J05061 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<PH05061> v = new Vector<>();
        while(t-->0){

            v.add(new PH05061(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));

        }
        
        Collections.sort(v,new PH05061());
        for(PH05061 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9