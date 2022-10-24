package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P05071{
    
    String name,id;
    long cost;

    public P05071(String id, String name, long cost) {
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
    
    public void calc(String input){
        
        String[] str = input.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for(String x:str) if(x.length()>0) a.add(x);
        System.out.print(a.get(0) + " ");
        if(a.get(0).charAt(0) == '0'){
            
            int d = diff(a.get(1),a.get(2));
            System.out.println(String.format("%s %d %d", name,d,cost*d));
            
            
        }else{
            
            int d = Math.round(diff(a.get(1),a.get(2))/3)+1;
            System.out.println(String.format("Noi mang %d %d", d,800*d));
            
        }
        
    }
    
    private int diff(String a, String b){
        
        String[] t1 = a.split(":");
        String[] t2 = b.split(":");
        return (Integer.parseInt(t2[0])-Integer.parseInt(t1[0]))*60+ Integer.parseInt(t2[1])-Integer.parseInt(t1[1]);
        
    }
    
}

public class J05071 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<P05071> v = new Vector<>();
        while(t-->0){

            v.add(new P05071(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine())));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String q = sc.nextLine();
            for(P05071 x:v){
                
                if(x.is(q)){
                    
                    x.calc(q);
                    break;
                    
                }
                
            }
            
        }
//        Collections.sort(v);
//        for( x:v) System.out.println(x);
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