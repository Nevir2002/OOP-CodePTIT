package codeptit;

import java.util.Scanner;

public class J02104 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            
            for(int j = 0; j < n; j++){
                
                int tmp = sc.nextInt();
                if(tmp != 0 && j > i){
                    
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                    
                }
                
            }
            
        }
        
        

        sc.close();
    }

}