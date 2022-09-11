package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08022 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            int n = sc.nextInt();
            Vector<Integer> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(sc.nextInt());
                
            }
            
            for(int i = 0; i < n; i++){
                
                int val = -1;
                
                for(int j = i+1; j < n; j++){
                    
                    if(v.get(j) > v.get(i)){
                        
                        val = v.get(j);
                        break;
                        
                    }
                    
                }
                System.out.print(val + " ");
                
            }
            System.out.println();

        }
        

        sc.close();
    }

}