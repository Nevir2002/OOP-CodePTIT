package codeptit;

import java.util.*;

public class J04005 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        System.out.println(s + " " + sc.next() + " " + sum(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));

        sc.close();
    }
    
    public static String sum(double a, double b, double c){
        
        return String.format("%.1f",a+b+c);
        
    }

}