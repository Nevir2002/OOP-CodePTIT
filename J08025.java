package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P{
    
    ArrayList<Integer> arr;
    int step;

    public P(ArrayList<Integer> arr, int step) {
        this.arr = arr;
        this.step = step;
    }
    
    
}

public class J08025 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i < 6; i++) a.add(sc.nextInt());
            for(int i = 0; i < 6; i++) res.add(sc.nextInt());
            Queue<P> q = new LinkedList<>();
            q.add(new P(a,0));
            while(!q.isEmpty()){
                
                P p = q.poll();
                if(p.arr.equals(res)){
                    
                    System.out.println(p.step);
                    break;
                    
                }
                q.add(new P(rr(p.arr),p.step+1));
                q.add(new P(rl(p.arr),p.step+1));
                
            }
            
        }
        
        sc.close(); 
    }
    
    public static ArrayList<Integer> rr(ArrayList<Integer> a){
        
        ArrayList<Integer> b = new ArrayList<>();
        b.addAll(a);
        int tmp = b.get(1);
        b.set(1, b.get(4));
        b.set(4, b.get(5));
        b.set(5, b.get(2));
        b.set(2, tmp);
        
        return b;
        
    }
    public static ArrayList<Integer> rl(ArrayList<Integer> a){
        
        ArrayList<Integer> b = new ArrayList<>();
        b.addAll(a);
        int tmp = b.get(0);
        b.set(0, b.get(3));
        b.set(3, b.get(4));
        b.set(4, b.get(1));
        b.set(1, tmp);
        
        return b;
        
    }
    
}

//1
//1 2 3 4 5 6
//4 1 2 6 5 3