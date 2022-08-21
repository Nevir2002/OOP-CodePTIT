package codeptit;

import java.util.HashMap;
import java.util.Scanner;

public class J02034 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        boolean check = false;

        for(int i = 0; i < n; i++){
            
            int tmp = sc.nextInt();
            mp.put(tmp, 1);
            if(tmp > max) max = tmp;
            
        }
        for(int i = 1; i <= max; i++) if(!mp.containsKey(i)){
            
            System.out.println(i);
            check = true;
            
        }
        
        if(!check){
            
            System.out.println("Excellent!");
            
        }
        
        sc.close();
    }

}