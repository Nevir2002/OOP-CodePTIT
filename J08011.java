package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08011 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Map<Integer,Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            
            int x = sc.nextInt();
//            if(x == -1) break;
            if(nonDecreasing(x)){
                
                if(mp.containsKey(x)) mp.put(x,mp.get(x)+1);
                else mp.put(x,1);
                
            }

        }
//        for(Map.Entry<Integer,Intgeer> v: mp.entrySet()){
//            
//            System.out.println(v.getKey() + " " + v.getValue());
//            
//        }
//        System.out.println();
        
        LinkedList<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(mp.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
            
            public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b){
                
                return b.getValue() - a.getValue();
                
            }
            
        });

        for(Map.Entry<Integer,Integer> v: list){
            
            System.out.println(v.getKey() + " " + v.getValue());
            
        }
        
        sc.close();
    }
    
    private static boolean nonDecreasing(int x){
        
        String s = String.valueOf(x);
        for(int i = 0; i < s.length()-1; i++) if(s.charAt(i+1) < s.charAt(i)) return false;
        
        return true;
    }

}

//123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678 999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355 9087 9977 98534 3456 23134