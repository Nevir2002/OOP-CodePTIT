package codeptit;

import java.util.*;

public class J03040 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){
            
            String s = sc.nextLine();
            s = s.substring(5);
            s = s.substring(0,3) + s.substring(4);
//            System.out.println(s);
            if(check(s)){
                
                System.out.println("YES");
                
            } else{
                
                System.out.println("NO");
                
            }
            
        }

        sc.close();
    }
    
    public static boolean check(String s){
        
        return check1(s) || check2(s) || check3(s);
        
    }
    
    public static boolean check1(String s){
        
        int n = s.length();
        for(int i = 1; i < n; i++){
            
            if(s.charAt(i) <= s.charAt(i-1)) return false;
            
        }
        
        return true;
        
    }
    
    public static boolean check2(String s){
        
        int n = s.length();
        for(int i = 1; i < 3; i++){
            
            if(s.charAt(i) != s.charAt(i-1)) return false;
            
        }
            
        if(s.charAt(n-1) != s.charAt(n-2)) return false;
        
        return true;
        
    }
    
    public static boolean check3(String s){
        
        int n = s.length();
        for(int i = 0; i < n; i++){
            
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
            
        }
        
        return true;
        
    }

}