package codeptit;

import java.util.*;

public class J03032 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- != 0){
            
            String[] a = sc.nextLine().split(" ");
            for(String s:a){
                
                System.out.print(new StringBuilder(s).reverse() + " ");
                
            }
            System.out.println();
            
        }

        sc.close();
    }

}