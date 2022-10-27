package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J07077 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        sc = new Scanner(new File("BIEUTHUC.in"));
        t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            String s = sc.nextLine();
            System.out.println(solve(s));

        }
    }
    
    private static long solve(String s){
        
        Stack<Long> numSt = new Stack<>();
        Stack<Character> opSt = new Stack<>();
        s = insertSpace(s);
        String[] arr = s.split(" ");
        for(String x:arr){
            if(x.length() == 0) continue;
            else if(x.charAt(0) == '+' || x.charAt(0) == '-'){
            
                while(!opSt.isEmpty()&& (
                opSt.peek() == '+' ||
                opSt.peek() == '-' ||
                opSt.peek() == '*' ||
                opSt.peek() == '/')){
                    
                    calc(numSt,opSt);
                    
                }
                opSt.push(x.charAt(0));
            
            } else if(x.charAt(0) == '*' || x.charAt(0) == '/'){
                
                while(!opSt.isEmpty()&& (
                opSt.peek() == '*' ||
                opSt.peek() == '/')){
                    
                    calc(numSt,opSt);
                    
                }
                opSt.push(x.charAt(0));
                
            } else if(x.trim().charAt(0) == '('){
                opSt.push('(');
            } else if(x.trim().charAt(0) == ')'){
                
                while(opSt.peek() != '('){
                    
                    calc(numSt,opSt);
                    
                }
                opSt.pop();
                
            } else numSt.push(Long.parseLong(x.trim()));
            
        }
        while(!opSt.isEmpty()) calc(numSt,opSt);
        return numSt.pop();
    }
    
    private static void calc(Stack<Long> numSt, Stack<Character> opSt){
        
        char op = opSt.pop();
        long n2 = numSt.pop();
        long n1 = numSt.pop();
        if(op == '+') numSt.push(n1+n2);
        if(op == '-') numSt.push(n1-n2);
        if(op == '*') numSt.push(n1*n2);
        if(op == '/') numSt.push(n1/n2);
        
    }
    private static String insertSpace(String s){
        
        String res = "";
        for(int i = 0; i < s.length(); i++){
            
            if  (s.charAt(i) == '(' ||
                s.charAt(i) == ')' ||
                s.charAt(i) == '+' ||
                s.charAt(i) == '-' ||
                s.charAt(i) == '*' ||
                s.charAt(i) == '/') res += " " + s.charAt(i) + " ";
            else res += s.charAt(i);
            
        }
        
        return res;        
    }

}

//4
//6*3+2-(6-4/2)
//100+99*22
//6*((4*3)+5)
//1-2