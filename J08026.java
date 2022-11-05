package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P08026{
    
    int num,step;

    public P08026(int num, int step) {
        this.num = num;
        this.step = step;
    }
    
}

public class J08026 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int z = Integer.parseInt(sc.nextLine());

        while(z-->0){

            int s = sc.nextInt();
            int t = sc.nextInt();
            Queue<P08026> q = new LinkedList<>();
            Set<Integer> st = new HashSet<>();
            q.add(new P08026(s,0));
            st.add(s);
            while(!q.isEmpty()){
                
                P08026 x = q.poll();
                if(x.num == t){
                    
                    System.out.println(x.step);
                    break;
                    
                }
                if(!st.contains(x.num-1) && x.num-1 > 0){
                    
                    st.add(x.num-1);
                    q.add(new P08026(x.num-1,x.step+1));
                    
                }
                if(!st.contains(x.num*2) && x.num < t){
                    
                    st.add(x.num*2);
                    q.add(new P08026(x.num*2,x.step+1));
                    
                }
                
            }
            
        }

        sc.close();
    }

}

//3
//2 5
//3 7
//7 4