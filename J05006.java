package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class NV5006{
    
    String id,name,gender,dob,address,taxNum,contractDate;
    static int index = 1;

    public NV5006() {
    }

    public NV5006(String name, String gender, String dob, String address, String taxNum, String contractDate) {
        String x = String.valueOf(index++);
        while(x.length() < 5) x = '0' + x;
        this.id = x;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxNum = taxNum;
        this.contractDate = contractDate;
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %s %s %s %s %s",id,name,gender,dob,address,taxNum,contractDate));
        
    }
    
}

public class J05006 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            new NV5006(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()).print();

        }

        sc.close();
    }

}