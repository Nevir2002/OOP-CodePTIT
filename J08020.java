package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08020 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            String s =  sc.next();
            
            Stack<Character> st = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                
                if(st.empty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.push(s.charAt(i));
                else{
                    
                    if(s.charAt(i) == ')' && st.peek() == '(') st.pop();
                    if(s.charAt(i) == ']' && st.peek() == '[') st.pop();
                    if(s.charAt(i) == '}' && st.peek() == '{') st.pop();
                    
                }
                
            }
            
            if(st.empty()) System.out.println("YES"); else System.out.println("NO");

        }

        sc.close();
    }

}