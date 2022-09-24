package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class NV5007 implements Comparator<NV5007>{
    
    String id,name,gender,dob,address,tax,date;
    String comp;
    static int index = 1;

    public NV5007() {
    }

    public NV5007(String name, String gender, String dob, String address, String tax, String date) {
        String x = String.valueOf(index++);
        while(x.length() < 5) x = '0' + x;
        this.id = x;        
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.date = date;
        String[] tmp = dob.split("/");
        comp = tmp[2] + tmp[1] + tmp[0];
        
    }
    
      @Override
      public int compare(NV5007 a, NV5007 b){
          
          return a.comp.compareTo(b.comp);
          
      }
      
      public void print(){
          
          System.out.println(String.format("%s %s %s %s %s %s %s",id,name,gender,dob,address,tax,date));
          
      }    
    
}

public class J05007 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        Vector<NV5007> v = new Vector<>();
        while(t-- != 0){

            v.add(new NV5007(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new NV5007());
        for(NV5007 x:v) x.print();

        sc.close();
    }

}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011