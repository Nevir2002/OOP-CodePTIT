package codeptit;

import java.util.*;

public class J03025 {

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
    
    private static String check(String s){
        
        int n = s.length();
        int cnt = 0;
        for(int i = 0; i < n/2; i++){
            
            if(s.charAt(i) != s.charAt(n-i-1)) cnt++;
            
        }
        
        if(cnt == 1 || (cnt == 0 && n%2 != 0)) return "YES";
        return "NO";
        
    }

}
