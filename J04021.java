package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class IntSet{
    
    int[] arr;

    public IntSet() {
    }

    public IntSet(int[] arr) {
        this.arr = arr;
    }
    public IntSet union(IntSet x){
        
        Set<Integer> st = new TreeSet<>();
        for(int i : this.arr) st.add(i);
        for(int i : x.arr) st.add(i);
        Iterator it = st.iterator();
        int[] res = new int[st.size()];
        int i = 0;
        while(it.hasNext()) res[i++] = (int) it.next();
        return new IntSet(res);        
    }
    @Override
    public String toString(){
        
        String res = "";
        for(int i:this.arr){
            
            res += i + " ";
            
        }
        
        return res;
    }
    
}

public class J04021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }

}