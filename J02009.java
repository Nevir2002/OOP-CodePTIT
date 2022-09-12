package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Passenger implements Comparator<Passenger>{
    
    int arr,t;
    
    Passenger(){}
    Passenger(int a, int b){
        
        arr = a;
        t = b;
        
    }
    
    @Override
    public int compare(Passenger a, Passenger b){
        
        if(a.arr == b.arr) return a.t-b.t;
        return a.arr - b.arr;
        
    }
    
}

public class J02009 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());

        Vector<Passenger> v = new Vector<>();
        for(int i = 0; i < n; i++) v.add(new Passenger(sc.nextInt(), sc.nextInt()));
        Collections.sort(v,new Passenger());
        
        int t = v.get(0).arr + v.get(0).t;
        for(int i = 1; i < v.size(); i++){
            
            t = Math.max(t + v.get(i).t, v.get(i).arr + v.get(i).t);
            
        }

        System.out.println(t);
        sc.close();
    }

}