package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J08015 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            HashMap<Integer,Integer> mp = new HashMap<>();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
            
                int tmp = sc.nextInt();
                a[i] = tmp;
                if(mp.containsKey(tmp)){
                    
                    int c = mp.get(tmp);
                    mp.put(tmp, c+1);
                    
                } else mp.put(tmp,1);
            
            }
            long res = 0;
            
            for(int i = 0; i < n; i++){
                
                if(mp.containsKey(k-a[i]) && a[i] < k-a[i]){
                    
                    res += mp.get(k-a[i]);
                    
                }
                
            }
            
            if(k%2 == 0){
                
                for(int i = 0; i < n; i++){
                    
                    if(a[i] == k/2){

                        int c = mp.get(a[i]);
                        res += c-1;
                        mp.put(a[i],c-1);

                    }

                }
                
            }
            
            System.out.println(res);
        }

        sc.close();
    }

}