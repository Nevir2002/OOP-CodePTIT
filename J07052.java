package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class st{
    
    String id,name;
    double a,b,c,bonus,total;
    
    st(String id,String name,double a, double b, double c){
        
        this.id = id;
        this.name = fix(name);
        this.a = a;
        this.b = b;
        this.c = c;
        if(id.substring(2,3).equals("1")) bonus = 0.5;
        else if(id.substring(2,3).equals("2")) bonus = 1;
        else if(id.substring(2,3).equals("3")) bonus = 2.5;
        else bonus = 0;
        total = a*2 + b + c + bonus;
        
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
    
    public String  print(String s){
        
        String fixedBonus = String.valueOf(bonus);
        String fixedTotal = String.valueOf(total);
        if((int)bonus == bonus) fixedBonus = String.valueOf((int)bonus);
        if((int)total == total) fixedTotal = String.valueOf((int)total);
        
        String res = id + " " + name + " " + fixedBonus + " " + fixedTotal + " " + s + System.lineSeparator();
        return res;
        
    }
    
}

class cmpSt implements Comparator<st>{
    
    public int compare(st a, st b){
        
        double x = b.total - a.total;
        if(x < 0) return -1;
        if(x > 0) return 1;
        return 0;
        
    }
    
}

public class J07052 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("THISINH.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<st> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new st(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
                
            }
            int cap = sc.nextInt();
            int cnt = 0;
            double bot = 100;
            String res = "";
            Collections.sort(v,new cmpSt());
            double prev = -1;
            for(st x:v){
                
                if(cnt < cap || x.total == prev){
                    
                    res += x.print("TRUNG TUYEN");
                    cnt++;
                    bot = Math.min(bot, x.total);
                    
                } else{
                    
                    res += x.print("TRUOT");
                    
                }
                
                prev = x.total;
                
            }
            
            res = bot + System.lineSeparator() + res;
            
            System.out.println(res);
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in