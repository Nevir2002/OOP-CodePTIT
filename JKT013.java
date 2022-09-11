package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002

public class JKT013 implements Comparator<String>{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            int n = sc.nextInt();
            Vector<String> v = new Vector<>();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            while(true){
                
                String num = q.remove();
                if(num.length() <= n){
                    
                    v.add(num);
                    q.add(num+"6");
                    q.add(num+"8");
                    
                } else break;
                
            }
            Collections.sort(v, new JKT013());
            System.out.println(v.size());
            for(String x:v){
                
                System.out.print(x + " ");
                
            }
            System.out.println();
            
        }
        

        sc.close();
    }

    @Override
    public int compare(String a, String b){
        
        if(a.length() == b.length()) return b.compareTo(a);
        return b.length() - a.length();
        
    }
    
}