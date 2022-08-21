package codeptit;

import java.util.Scanner;

public class J03013 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- != 0){

            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(sub(s1,s2));
            
        }

        sc.close();
    }

    private static String sub(String s1, String s2) {
        
        if(cmp(s1,s2) < 0){
            
            String t = s1;
            s1 = s2;
            s2 = t;
            
        }
        
        int m = 0;
        int n1 = s1.length();
        int n2 = s2.length();
        String res = "";
        s1 = new StringBuilder(s1).reverse().toString();
        s2 = new StringBuilder(s2).reverse().toString();
        
        for(int i = 0; i < n2; i++){
            
            int tmp = s1.charAt(i)-s2.charAt(i)-m;
            if(tmp < 0){
                
                tmp += 10;
                m = 1;
                
            } else m = 0;
            res += (char)(tmp + '0');
            
        }
        for(int i = n2; i < n1; i++){
            
            int tmp = s1.charAt(i)-'0'-m;
            if(tmp < 0){
                
                tmp += 10;
                m = 1;
                
            } else m = 0;
            res += (char)(tmp + '0');
            
        }
        
        res = new StringBuilder(res).reverse().toString();
        
        return res;
    }

    private static int cmp(String s1, String s2) {
        
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 < n2) return -1;
        if(n1 > n2) return 1;
        for(int i = 0; i < n1; i++){
               
            if(s1.charAt(i) < s2.charAt(i)) return -1;
            if(s1.charAt(i) > s2.charAt(i)) return 1;
            
        }
        return 0;
        
    }

}