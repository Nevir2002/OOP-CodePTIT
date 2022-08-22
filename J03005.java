package codeptit;

import java.util.Scanner;

public class J03005 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- != 0){
            
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] a = s.split(" ");
            int n = a.length;
            String[] res = new String[n];
            int cnt = 0;
            for(int i = 0; i < n; i++) if(a[i].length() > 0) res[cnt++] = a[i];
            for(int i = 1; i < cnt; i++){
                
                System.out.print(title(res[i]));
                if(i != cnt-1) System.out.print(" ");
                
            }
            System.out.println(", " + res[0].toUpperCase());
            
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
//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH