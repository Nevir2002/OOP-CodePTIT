package codeptit;

import java.util.*;

public class J03024 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){

            String s = sc.nextLine();
            System.out.println(check(s));
            
        }

        sc.close();
    }

    private static String check(String s) {
        
        int odd = 0, even = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) < '0' || s.charAt(i) > '9') return "INVALID";
            if(Integer.parseInt(s.substring(i,i+1))%2 == 0) even++; else odd++;
            
        }
        
        if((s.length()%2 == 0 && even > odd) || (s.length()%2 != 0 && even < odd)) return "YES";
        
        return "NO";
    }

}