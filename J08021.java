package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08021 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            String s =  sc.next();
            
            System.out.println(maxCorrectLength(s));

        }

        sc.close();
    }
    
    private static int maxCorrectLength(String s){
        
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '(') st.push(i);
            else{
                
                if(!st.empty()) st.pop();
                
                if(!st.empty()) res = Math.max(res, i-st.peek());
                else st.push(i);
                
            }
            
        }
        return res;
    }

}