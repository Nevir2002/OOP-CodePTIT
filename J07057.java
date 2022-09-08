package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class TS implements Comparator<TS>{
    
    String id,name,status;
    double bonus,total;
    static int i = 1;
    TS(){}
    TS(String line1, double result, String race, int region){
        
        String k = String.valueOf(i++);
        if(k.length() < 2) k = '0' + k;
        id = "TS" + k;
        name = fix(line1);
        bonus = 0;
        if(region == 1) bonus += 1.5;
        if(region == 2) bonus += 1;
        if(!race.equals("Kinh")) bonus += 1.5;
        total = result + bonus;
        status = total >= 20.5 ? "Do" : "Truot";
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + total + " " + status);
        
    }
    
    private String fix(String s){
        
        String res = "";
        String a[] = s.toLowerCase().split(" ");
        for(String x:a){
            
            if(x.length() > 0){
                
                res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
                
            }
            
        }
        
        return res.substring(0,res.length()-1);
    }
    
    @Override
    public int compare(TS a, TS b){
        
        double x = b.total - a.total;
        if(x > 0) return 1;
        if(x < 0) return -1;
        return 0;
        
    }
    
}

public class J07057 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<TS> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new TS(sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine())));
                
            }
            Collections.sort(v,new TS());
            for(TS x:v){

                x.print();

            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in