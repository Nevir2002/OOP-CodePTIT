package codeptit;

import java.util.Scanner;

public class J03021 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- != 0){

            String s = sc.nextLine();
            String res = "";
            for(int i = 0; i < s.length(); i++) res += convert(s.charAt(i));
            if(check(res)){
                
                System.out.println("YES");
                
            } else{
                
                System.out.println("NO");
                
            }

        }

        sc.close();
    }
    
    private static String convert(char c) {
        
        if(c == 'A' || c == 'B' || c == 'C' || c == 'a' || c == 'b' || c == 'c') return "2";
        if(c == 'D' || c == 'E' || c == 'F' || c == 'd' || c == 'e' || c == 'f') return "3";
        if(c == 'G' || c == 'H' || c == 'I' || c == 'g' || c == 'h' || c == 'i') return "4";
        if(c == 'J' || c == 'K' || c == 'L' || c == 'j' || c == 'k' || c == 'l') return "5";
        if(c == 'M' || c == 'N' || c == 'O' || c == 'm' || c == 'n' || c == 'o') return "6";
        if(c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'p' || c == 'q' || c == 'r' || c == 's') return "7";
        if(c == 'T' || c == 'U' || c == 'V' || c == 't' || c == 'u' || c == 'v') return "8";
        
        return "9";
    }

    private static boolean check(String s) {
        
        int l = 0, r = s.length()-1;
        while(l < r){
            
            if(s.charAt(l++) != s.charAt(r--)) return false;
            
        }
        
        return true;
    }

}