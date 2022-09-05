package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

class bd implements Comparator<bd>{
    
    String id,name,avg;
    static int cnt = 1;
    
    bd(){}
    
    bd(String name, double a, double b, double c){
        String k = String.valueOf(cnt++);
        if(k.length() < 2) k = '0' + k;
        id = "SV" + k;
        
        this.name = fix(name);
        
        avg = String.format("%.2f",(a*3+b*3+c*2)/(3+3+2));
        
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
    
    public int compare(bd a, bd b){
        
        double x = Double.parseDouble(b.avg) - Double.parseDouble(a.avg);
        if(x < 0) return -1;
        if(x > 0) return 1;
        return a.id.compareTo(b.id);
        
    }
    
    public void print(int n){
        
        System.out.println(id + " " + name + " " + avg + " " + n);
        
    }
    
}

public class J07054 {

    public static void main(String arg[]){
 
       try{
            
            Scanner sc = new Scanner(new File("BANGDIEM.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<bd> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new bd(sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
                
            }
            
            Collections.sort(v, new bd());
            
            int curr = 1, prevRank = 1;
            double prevAvg = -1;
            
            for(bd x:v){
                
                if(Double.parseDouble(x.avg) == prevAvg){
                    
                    x.print(prevRank);
                    
                } 
                else{
                    
                    x.print(curr);
                    prevRank = curr;
                    
                }
                prevAvg = Double.parseDouble(x.avg);
                curr++;
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in