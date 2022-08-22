package codeptit;

import java.util.Scanner;

public class J03007 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){

            String s = sc.nextLine();
            if(check1(s) && check2(s) && check3(s)){
                
                System.out.println("YES");
                
            } else{
                
                System.out.println("NO");
                
            }

        }

        sc.close();
    }

    private static boolean check1(String s) {
        
        return s.charAt(0) == '8';
        
    }
    
    private static boolean check2(String s) {
        
        int l = 0, r = s.length()-1;
        
        while(l < r){
            
            if(s.charAt(l++) != s.charAt(r--)) return false;
            
        }
        
        return true;
        
    }
    
    private static boolean check3(String s) {
        
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) sum += s.charAt(i)-'0';
        
        return sum%10 == 0;
        
    }

}