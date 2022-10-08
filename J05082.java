package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH05082 implements Comparator<KH05082>{
    
    String id,name,gender,dob,address;
    static int idx = 1;
    int val;

    public KH05082() {
    }

    public KH05082(String name, String gender, String dob, String address) {
        this.id = String.format("KH%03d",idx++);
        this.name = fix(name);
        this.gender = gender;
        this.dob = format(dob);
        this.address = address;
    }
    private String fix(String s){
        
        String res = "";
        String[] a = s.toLowerCase().split(" ");
        for(String x:a){
            
            if(x.length() > 0) res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
            
        }
        return res.substring(0,res.length()-1);
        
    }
    private String format(String s){
        
        String[] a = s.split("/");
        while(a[0].length() < 2) a[0] = '0' + a[0];
        while(a[1].length() < 2) a[1] = '0' + a[1];
        while(a[2].length() < 4) a[2] = '0' + a[2];
        val = Integer.parseInt(a[2]) * 365 + Integer.parseInt(a[1]) * 31 + Integer.parseInt(a[0]);
        
        return String.format("%s/%s/%s",a[0],a[1],a[2]);
        
    }
    
    @Override
    public int compare(KH05082 a, KH05082 b){
        
        return a.val-b.val;
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %s", id, name, gender, address, dob);
        
    }
    
}

public class J05082 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<KH05082> v = new Vector<>();
        while(t-->0){

            v.add(new KH05082(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v, new KH05082());
        for(KH05082 x:v){
            
            System.out.println(x);
            
        }
        sc.close();
    }

}

//2
// nGuyen VAN     nAm
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
// TRan    vAn     biNh
//Nam
//14/11/1995
//Phung Khoang-Nam Tu Liem-Ha Noi