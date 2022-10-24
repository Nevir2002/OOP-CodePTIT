package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P05072{
    
    String name,id;
    long cost;

    public P05072(String id, String name, long cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }
    
    public boolean is(String input){
        
        if(input.charAt(0) == '0'){
            
            return input.substring(0,3).contains(id);
            
        }
        return true;
        
    }
    
}

class Bill05072 implements Comparable<Bill05072>{
    
    String num,name;
    int diff;
    long total;
    public Bill05072(String input,Vector<P05072> v){
        String[] str = input.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for(String x:str) if(x.length()>0) a.add(x);
        num = a.get(0);
        for(P05072 x:v){
            
            if(x.is(num)){
                
                name = x.name;
                diff = diff(a.get(1),a.get(2));
                if(num.charAt(0) != '0'){
                    
                    name = "Noi mang";
                    diff = Math.round(diff/3)+1;
                    total = diff*800;
                    
                } else{
                    
                    total = diff*x.cost;
                    
                }
                break;
                
            }
            
        }
        
    }
    @Override
    public int compareTo(Bill05072 a){
        
        return Long.compare(a.total, total);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d",num,name,diff,total);
        
    }
    
    private int diff(String a, String b){
        
        String[] t1 = a.split(":");
        String[] t2 = b.split(":");
        return (Integer.parseInt(t2[0])-Integer.parseInt(t1[0]))*60+ Integer.parseInt(t2[1])-Integer.parseInt(t1[1]);
        
    }
    
}

public class J05072 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<P05072> v = new Vector<>();
        Vector<Bill05072> res = new Vector<>();
        while(t-->0){

            v.add(new P05072(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine())));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String q = sc.nextLine();
            res.add(new Bill05072(q,v));
            
        }
        Collections.sort(res);
        for(Bill05072 x:res) System.out.println(x);
        sc.close();
    }

}


//2
//53
//Da Nang
//3000
//64
//Vung Tau
//1000
//3
//064-824531 11:20 11:22
//8293567 09:07 09:15
//053-823532 12:00 12:05