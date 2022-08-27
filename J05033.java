package codeptit;

import java.util.*;

class Time{
    
    int hour, minute, second, value;
    
    Time(int a, int b, int c){
        
        hour = a;
        minute = b;
        second = c;
        value = a*3600 + b*60 + c;
        
    }
    
    public void print(){
        
        System.out.println(hour + " " + minute + " " + second);
        
    }
    
}

class cmp implements Comparator<Time>{
    
    public int compare(Time a, Time b){
        
        return a.value-b.value;
        
    }
    
}

public class J05033 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        Vector<Time> v = new Vector<>();

        while(t-- != 0){
            
            v.add(new Time(sc.nextInt(),sc.nextInt(),sc.nextInt()));
            
        }
        
        Collections.sort(v, new cmp());
        
        for(Time x:v){
            
            x.print();
            
        }

        sc.close();
    }

}