package TestPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class J03010 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> mp = new HashMap<>();
        while(t-- != 0){

            String s = sc.nextLine();
            String res; // output string
            s = s.toLowerCase();
            String[] str = s.split(" ");
            Vector<String> v = new Vector<>();
            for(String x:str) if(x.length() > 0) v.add(x);
            res = v.get(v.size()-1);
            if(!mp.containsKey(res)){ // unprecedented input

                mp.put(res, 2);
                for(int i = 0; i < v.size()-1; i++) res += v.get(i).charAt(0);
                System.out.println(res + "@ptit.edu.vn");

            } else{ // input with repeated key
                
                int id = mp.get(res);
                mp.put(res, id+1);
                for(int i = 0; i < v.size()-1; i++) res += v.get(i).charAt(0);
                res += id;
                System.out.println(res + "@ptit.edu.vn");

            }

        }

        

    }

}