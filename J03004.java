package codeptit;

import java.util.*;

public class J03004 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- != 0){
            
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] a = s.split(" ");
            for(String str:a) if(str.length() > 0) System.out.print(title(str) + " ");
            System.out.println();
            
        }

        sc.close();
    }

    private static String title(String str) {
        
        String c = str.substring(0,1);
        c = c.toUpperCase();
        c += str.substring(1);
        
        return c;
    }

}
