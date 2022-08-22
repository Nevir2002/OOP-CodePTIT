package codeptit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class J03009 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- != 0){

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] r1 = s1.split(" ");
            String[] r2 = s2.split(" ");
            Arrays.sort(r1);
            Arrays.sort(r2);
            
            HashMap<String,Integer> mp = new HashMap<>();
            for(String x:r1) mp.put(x, 1);
            for(String x:r2) if(mp.containsKey(x)) mp.put(x, 0);
            for(String x:r1) if(mp.get(x) > 0) {
                
                System.out.print(x + " ");
                mp.put(x, 0);
                
            }
            
            System.out.println();

        }

        sc.close();
    }

}