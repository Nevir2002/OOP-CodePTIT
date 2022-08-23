package codeptit;

import java.math.BigInteger;
import java.util.*;

public class J03038 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            
        String s = sc.next();
        int res = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            
            if(!mp.containsKey(s.charAt(i))){
                
                mp.put(s.charAt(i),0);
                res++;
                
            }
            
        }
        System.out.println(res);

        sc.close();
    }

}