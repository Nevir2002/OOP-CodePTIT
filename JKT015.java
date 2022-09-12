package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class JKT015 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            
            if(input.charAt(i) == '<'){
                
                if(!st1.empty()){
                    
                    st2.add(st1.pop());
                    
                }
                
            } else if(input.charAt(i) == '>'){
                
                if(!st2.empty()){
                    
                    st1.add(st2.pop());
                    
                }
                
            } else if(input.charAt(i) == '-'){
                
                if(!st1.empty()) st1.pop();
                
            } else st1.add(input.substring(i,i+1));
            
        }
        
        while(!st1.empty()) st2.add(st1.pop());
        
        while(!st2.empty()) System.out.print(st2.pop());

        sc.close();
    }

}