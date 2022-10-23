package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class DaThuc{
    
    Map<Integer,Integer> mp;

    public DaThuc(String input) {
        mp = new TreeMap<>(Collections.reverseOrder());
        String[] str = input.split("[+]");
        for(String x:str){
            
            x = x.trim();
            if(x.length()>0){
                
                String[] zz = x.split("[*x^]");
                int[] arr = new int[2];
                int idx = 0;
                for(String z:zz){
                    
                    if(z.length()>0){
                        
                        arr[idx++] = Integer.parseInt(z);
                        
                    }
                    
                }
                
                mp.put(arr[1], arr[0]);
                
            }
            
        }
        
    }
    public DaThuc(DaThuc a){
        
        mp = new TreeMap<>(Collections.reverseOrder());
        mp.putAll(a.mp);
        
    }
    
    public DaThuc cong(DaThuc a){
        
        DaThuc res = new DaThuc(this); //clone object
        for(Map.Entry<Integer, Integer> x:a.mp.entrySet()){
            int key = x.getKey();
            int value = x.getValue();
            if(res.mp.containsKey(key)) res.mp.put(key, res.mp.get(key)+value);
            else res.mp.put(key,value);
        
        }
        
        return res;
    }
    @Override
    public String toString(){
        
        String res = "";
        
        for(Map.Entry<Integer,Integer> x:mp.entrySet()){
            
            res += String.format("%d*x^%d + ",x.getValue(),x.getKey());
            
        }

        return res.substring(0,res.length()-3);
        
    }
    
}

public class J05063 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            System.out.println(p);
            System.out.println(q);
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }

}

//1
//3*x^8 + 7*x^2 + 4*x^0
//11*x^6 + 9*x^2 + 2*x^1 + 3*x^0