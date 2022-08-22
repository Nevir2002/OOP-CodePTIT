package codeptit;

import java.util.Scanner;

public class J03008 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){

            String s = sc.nextLine();
            if(check1(s) && check2(s)){
                
                System.out.println("YES");
                
            } else{
                
                System.out.println("NO");
                
            }

        }

        sc.close();
    }

    private static boolean check1(String s) {
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') return false;
            
        }
        
        return true;
        
    }
    
    private static boolean check2(String s) {
        
        int l = 0, r = s.length()-1;
        
        while(l < r){
            
            if(s.charAt(l++) != s.charAt(r--)) return false;
            
        }
        
        return true;
        
    }

}