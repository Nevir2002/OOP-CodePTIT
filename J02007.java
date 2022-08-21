package TestPackage;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class J02007 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int k = 1; k <= t; k++){

            System.out.println("Test " + k + ":");
            HashMap<Integer,Integer> m = new HashMap<>();
            Vector<Integer> v = new Vector<>();
            int n = sc.nextInt();
            int tmp;
            for(int i = 0; i < n; i++){

                tmp = sc.nextInt();
                if(!m.containsKey(tmp)){

                    v.add(tmp);
                    m.put(tmp, 1);

                } else{

                    int x = m.get(tmp);
                    m.replace(tmp, x+1);

                }

            }

            for (Integer x : v) {
                
                System.out.println(x + " xuat hien " + m.get(x) + " lan");

            }

        }

        sc.close();
    }

}