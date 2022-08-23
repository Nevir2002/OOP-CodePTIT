package codeptit;

import java.util.*;

public class J03026 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){
            
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.compareTo(s2) == 0) System.out.println(-1); else System.out.println(Math.max(s1.length(), s2.length()));
            
        }

        sc.close();
    }

}