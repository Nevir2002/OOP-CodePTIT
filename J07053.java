package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class xt{
    
    String id,name,rate;
    double a,b,bonus;
    int age,total;
    static int cnt = 1;
    
    xt(String name,String dob,double a, double b){
        
        String k = String.valueOf(cnt++);
        if(k.length() < 2) k = '0' + k;
        id = "PH" + k;
        
        this.name = fix(name);
        this.a = a;
        this.b = b;
        if(a >= 8 && b >= 8) bonus = 1;
        else if(a >= 7.5 && b >= 7.5) bonus = 0.5;
        else bonus = 0;
        total = Math.min((int)Math.round((float)(a + b)/2 + bonus),10);
        
        switch(total){
            case 10:
                rate = "Xuat sac";
                break;
            case 9:
                rate = "Xuat sac";
                break;
            case 8:
                rate = "Gioi";
                break;
            case 7:
                rate = "Kha";
                break;
            case 6:
                rate = "Trung binh";
                break;
            case 5:
                rate = "Trung binh";
                break;
            default:
                rate = "Truot";
                break;
        }
        String[] s = dob.split("/");
        age = 2022 - Integer.parseInt(s[2]) - 1;
        
    }

    private String fix(String name) {
        String[] a = name.trim().toLowerCase().split(" ");
        String res = "";
        for(String x:a){
            
            if(x.length() <= 0) continue;
            res += x.substring(0,1).toUpperCase() + x.substring(1,x.length()) + " ";
            
        }
        return res.substring(0,res.length()-1);
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + age + " " + total + " " + rate);
        
    }
    
}

public class J07053 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("XETTUYEN.in"));
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++){
                
                xt tmp = new xt(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
                tmp.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in