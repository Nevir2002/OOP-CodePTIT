package codeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//@author Nevir2002

public class JKT014{

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            int n = sc.nextInt();
            Vector<Integer> v1 = new Vector<>();
            Vector<Integer> v2 = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v1.add(sc.nextInt());
                v2.add(1);
                for(int j = i-1; j >= 0;){
                    
                    if(v1.get(j) <= v1.get(i)){
                        
                        v2.set(i, v2.get(i) + v2.get(j));
                        j -= v2.get(j);
                        
                    } else break;
                    
                }
                
            }
            for(int x:v2){
                
                System.out.print(x + " ");
                
            }
            System.out.println();
            
        }
        
        sc.close();
    }
    
}