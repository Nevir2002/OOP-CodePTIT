package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH07025 implements Comparator<KH07025>{
    
    String id,name,gender,dob,address;
    static int idx = 1;

    public KH07025() {
    }

    public KH07025(String name, String gender, String dob, String address) {
        this.id = String.format("KH%03d",idx++);
        this.name = fix(name);
        this.gender = gender;
        this.dob = full(dob);
        this.address = address;
    }
    private String fix(String s){
        
        String[] x = s.toLowerCase().split(" ");
        String res = "";
        for(String k:x) if(k.length() > 0) res += k.substring(0,1).toUpperCase() + k.substring(1) + " ";
        return res.substring(0,res.length()-1);
        
    }
    private String full(String s){
        
        String[] arr = s.split("/");
        while(arr[0].length() < 2) arr[0] = "0" + arr[0];
        while(arr[1].length() < 2) arr[1] = "0" + arr[1];
        while(arr[2].length() < 4) arr[2] = "0" + arr[2];
        return String.format("%s/%s/%s",arr[0],arr[1],arr[2]);
        
    }
    @Override
    public int compare(KH07025 a,KH07025 b){
        
        String[] s1 = a.dob.split("/");
        String[] s2 = b.dob.split("/");
        String n1 = s1[2] + s1[1] + s1[0];
        String n2 = s2[2] + s2[1] + s2[0];
        return n1.compareTo(n2);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %s",id,name,gender,address,dob);
        
    }
    
}

public class J07025 {

    public static void main(String arg[]) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("KHACHHANG.in"));

        int t = Integer.parseInt(sc.nextLine());
        Vector<KH07025> v = new Vector<>();
        while(t-->0){

            v.add(new KH07025(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new KH07025());
        for(KH07025 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}