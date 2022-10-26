package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J08023 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());

//        Vector<> v = new Vector<>();
        while(t-->0){

            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();
            Stack<Integer> st = new Stack<>();
            int i = 0;
            long res = 0;
            while(i < n){
                
                if(st.isEmpty() || a[i] >= a[st.peek()]) st.add(i++);
                else{
                    
                    int top = st.pop();
                    res = Math.max(res,a[top]*(st.isEmpty()?i:i-st.peek()-1));
                    
                }
                
            }
            while(!st.isEmpty()){
                
                int top = st.pop();
                res = Math.max(res,a[top]*(st.isEmpty()?i:i-st.peek()-1));
                
            }
            System.out.println(res);
            
        }
//        Collections.sort(v);
//        for( x:v) System.out.println(x);
    }

}


//2
//7
//6 2 5 4 5 1 6
//3
//2 2 2