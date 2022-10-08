package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class AA_Test {

    public static void main(String arg[]) throws FileNotFoundException{

        TreeSet<Integer> list = new TreeSet<>();
        Map<Integer,Integer> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        Scanner sc = new Scanner(new File("DATA1.in"));
        int tmp;
        while(sc.hasNext()){
            
            tmp = sc.nextInt();
            if(prime(tmp)){
                
                list.add(tmp);
                if(m1.containsKey(tmp)) m1.put(tmp,m1.get(tmp)+1);
                else m1.put(tmp,1);
                
            }
            
        }
        sc = new Scanner(new File("DATA2.in"));
        while(sc.hasNext()){
            
            tmp = sc.nextInt();
            if(prime(tmp)){
                
                list.add(tmp);
                if(m2.containsKey(tmp)) m2.put(tmp,m2.get(tmp)+1);
                else m2.put(tmp,1);
                
            }
            
        }
        
        for(int x:list){
            
            System.out.println(String.format("%d %d %d", x,m1.get(x),m2.get(x)));
            
        }
        
    }

    private static boolean prime(int n){
        
        if(n < 2) return false;
        if(n == 2) return true;
        if(n%2 == 0) return false;
        for(int i = 3; i*i <= n; i+=2) if(n%i == 0) return false;
        
        return true;
        
    }
    
}