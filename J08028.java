package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08028 {

    static long res = 0;
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for(int i = 0; i < n; i++){
            
            a[i] = sc.nextLong();
            b[i] = m-a[i];
            
        }
        
        getMaxRectArea(a,n);
        getMaxRectArea(b,n);
        
        System.out.println(res);

        sc.close();
    }
    
    private static void getMaxRectArea(long[] a, int n){
        
        Stack<Integer> st = new Stack<>();
        long area;
        int top;
        int i = 0;
        while(i < n){
            
            if(st.empty() || a[i] >= a[st.peek()]) st.push(i++);
            else{
                
                top = st.peek();
                st.pop();
                area = a[top] * (st.empty() ? i : i-st.peek() - 1);
                res = Math.max(res, area);
                
            }
            
        }
        
        while(!st.empty()){
            
            top = st.peek();
            st.pop();
            area = a[top] * (st.empty() ? i : i-st.peek() - 1);
            res = Math.max(res, area);
            
        }
        
    }

}

//5 9
//1 3 4 4 5 4 4 3 1