package codeptit;

import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class J02012 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vector<Integer> v = new Vector<Integer>();
  
        for(int i = 0; i < n; i++){
            
            v.add(sc.nextInt());
            Collections.sort(v);
            System.out.print("Buoc " + i + ": ");
            for(int x:v) System.out.print(x + " ");
            System.out.println("");
            
        }

        sc.close();
    }

}