package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J01020 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            int n = sc.nextInt();
            if(n == 0) System.out.println("Impossible");
            else{
                
                int i = 1;
                Set<Integer> st = new HashSet<>();
                while(true){
                    
                    getDigits(st,n*i);
                    if(st.size() >= 10){
                        
                        System.out.println(n*i);
                        break;
                        
                    }
                    i += 1;
                    
                }
                
            }

        }

        sc.close();
    }

    private static void getDigits(Set<Integer> st, int n){
        
        while(n>0){
            
            st.add(n%10);
            n /= 10;
            
        }
        
    }
    
}

//5
//0
//1
//2
//11
//1692