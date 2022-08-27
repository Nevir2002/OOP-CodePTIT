package codeptit;

import java.util.*;

public class J04015 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = Integer.parseInt(sc.nextLine());
        int add,res;
        
        if(a.substring(0,2).equals("HT")) add = 2000000;
        else if(a.substring(0,2).equals("HP")) add = 900000;
        else add = 500000;
        
        res = add + Integer.parseInt(a.substring(2))*c;
        
        System.out.println(a + " " + b + " " + Integer.parseInt(a.substring(2)) + " " + add + " " + res);

        sc.close();
    }

}