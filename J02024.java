package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J02024 implements Comparator<Vector<Integer>>{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while(t-- != 0){

            int n = sc.nextInt();
            Vector<Integer> a = new Vector<>();
            for(int i = 0; i < n; i++) a.add(sc.nextInt());
            Collections.sort(a,Collections.reverseOrder());
            Vector<Vector<Integer>> result = new Vector<Vector<Integer>>();
            for(int i = 1; i <= n; i++) run(i,0,0,new Vector<Integer>(),a,n,result);
            Collections.sort(result, new J02024());
            for(Vector<Integer> x:result){
                
                for(int k:x){
                    
                    System.out.print(k + " ");
                    
                }
                System.out.println();
                
            }
            
        }

        sc.close();
    }
    
    @Override
    public int compare(Vector<Integer> a, Vector<Integer> b){
        
        int n = Math.min(a.size(),b.size());
        for(int i = 0; i < n; i++){
            
            if(a.get(i) != b.get(i)) return a.get(i)-b.get(i);
            
        }
        
        return a.size() - b.size();
        
    }
    
    private static void run(int n, int i, long sum, Vector<Integer> str, Vector<Integer> a, int size, Vector<Vector<Integer>> result){
        
        if(n == 0){
            
            if(sum%2 == 1){
                
                result.add(str);
                
            }
            return;
            
        }
        for(int j = i; j < size; j++){

            Vector<Integer> x = new Vector<>();
            x.addAll(str);
            x.add(a.get(j));
            run(n-1,j+1,sum+a.get(j),x,a,size,result);

        }
        
    }

}