package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class KH implements Comparator<KH>{
    
    String id,name;
    int threshold,cost1,cost2,vat,total;
    static int i = 1;
    KH(){}
    KH(String line1, String line2){
        
        String k = String.valueOf(i++);
        if(k.length() < 2) k = '0' + k;
        id = "KH" + k;
        name = fix(line1);
        String a[] = line2.split(" ");
        if(a[0].equals("A")) threshold = 100;
        else if(a[0].equals("B")) threshold = 500;
        else threshold = 200;
        int diff = Integer.parseInt(a[2])-Integer.parseInt(a[1]);
        cost1 = Math.min(diff, threshold)*450;
        cost2 = Math.max(diff-threshold, 0)*1000;
        vat = cost2/20;
        
        total = cost1 + cost2 + vat;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + cost1 + " " + cost2 + " " + vat + " " + total);
        
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
    
    public int compare(KH a, KH b){
        
        return b.total - a.total;
        
    }
    
}

public class J07056 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<KH> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new KH(sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new KH());
            for(KH x:v){

                x.print();

            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in