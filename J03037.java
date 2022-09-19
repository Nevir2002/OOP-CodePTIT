package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J03037 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = clean(s);
        if(s.length() > 0){
            
            int cnt = 0;
            boolean[] vis = new boolean[s.length()];
            boolean[][] check = new boolean[26][26];
            Arrays.fill(vis, false);
            for(int i = 0; i < 26; i++) Arrays.fill(check[i], false);
            for(int i = 0; i < s.length(); i++){

                if(vis[i] == false){

                    vis[i] = true;
                    int j = i+1;
                    while(s.charAt(j) != s.charAt(i)){

    //                    System.out.println(i + " " + s.charAt(i) + " " + j + " " + s.charAt(j));
                        int a = val(s.charAt(i));
                        int b = val(s.charAt(j));
                        check[a][b] = !check[a][b];
                        j++;

                    }
                    vis[j] = true;

                }

            }
            for(int i = 0; i < 26; i++){

                for(int j = 0; j < 26; j++) if(check[i][j]){

//                    System.out.println((char)(i+'A') + " " + (char)(j+'A'));
                    cnt++;

                }

            }

            System.out.println(cnt/2);
            
        } else System.out.println(0);

        sc.close();
    }
    
    private static String clean(String s){
        
        for(int i = 0; i < s.length()-1; i++){
            
            if(s.charAt(i) == s.charAt(i+1)){
                
                s = s.substring(0,i) + s.substring(i+2);
                i--;
                
            }
            
        }
        while(s.length() > 0 && s.charAt(0) == s.charAt(s.length()-1)) s = s.substring(1,s.length()-1);
        return s;        
    }
    
    private static int val(char x){
        
        return x-'A';
        
    }
    
}