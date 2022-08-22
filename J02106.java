package codeptit;

import java.util.Scanner;

public class J02106 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int res = 0;

        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            
            int cnt = 0;
            for(int j = 0; j < 3; j++){
                
                int tmp = sc.nextInt();
                if(tmp != 0) cnt++;
                
            }
            if(cnt > 3-cnt) res++;
            
        }
        
        System.out.println(res);

        sc.close();
    }

}