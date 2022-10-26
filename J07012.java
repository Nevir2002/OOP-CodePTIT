package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J07012 {

    public static void main(String[] args) throws Exception{

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) is.readObject();

        int t = arr.size();
        Map<String,Integer> mp = new TreeMap<>();
        while(t-->0){

            String s = arr.get(t).toLowerCase();
            String[] str = s.split("\\W");
            for(String x:str){
                if(x.length()>0){
//                    System.out.println(x);
                    if(mp.containsKey(x)) mp.put(x,mp.get(x)+1);
                    else mp.put(x,1);
                    
                }
            }

        }
        Map<String,Integer> res = sort(mp);
//        for(Map.Entry<String,Integer> x: mp.entrySet()){
//
//            System.out.println(String.format("%s %d",x.getKey(),x.getValue()));
//
//        }
        for(Map.Entry<String,Integer> x: res.entrySet()){

            System.out.println(String.format("%s %d",x.getKey(),x.getValue()));

        }
    }
    private static Map<String,Integer> sort(Map<String,Integer> mp){
        
        List<Map.Entry<String,Integer>> arr = new LinkedList<>(mp.entrySet());
        Collections.sort(arr,new Comparator<Map.Entry<String,Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b){
                
                return b.getValue()-a.getValue();
                
            }
            
        });
        Map<String,Integer> res = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> x:arr) res.put(x.getKey(),x.getValue());
        return res;
        
    }
}