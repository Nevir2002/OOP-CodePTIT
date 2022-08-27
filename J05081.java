package codeptit;

import java.util.*;

class Goods{
    
    String ID,name,unit;
    int buy,sell,revenue;
    public Goods(String a, String b, String c, int d, int e){
        
        ID = a;
        name = b;
        unit = c;
        buy = d;
        sell = e;
        revenue = e-d;
        
    }
    public void printGoods(){
        
        System.out.println(ID + " " + name + " " + unit + " " + buy + " " + sell + " " + revenue);
        
    }
    
}

class cmp implements Comparator<Goods>{
    
    public int compare(Goods a, Goods b){
        
        return b.revenue - a.revenue;
        
    }
    
}

public class J05081 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            
        int t = sc.nextInt();
        sc.nextLine();
        
        Vector<Goods> v = new Vector<>();
        for(int i = 1; i <= t; i++){
            
            String tmp = String.valueOf(i);
            while(tmp.length() < 2) tmp = '0' + tmp;
            String a = "MH0" + tmp;
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();
            v.add(new Goods(a,b,c,d,e));
            
        }
        Collections.sort(v,new cmp());
        for(Goods x:v){
            
            x.printGoods();
            
        }

        sc.close();
    }

}
