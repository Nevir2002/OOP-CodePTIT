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
    public IntSet intersection(IntSet x){
        
        Set<Integer> st = new TreeSet<>();
        
        for(int i : this.arr){
            
            if(x.contains(i) && !st.contains(i)) st.add(i);
            
        }
        
        Iterator it = st.iterator();
        int[] res = new int[st.size()];
        int i = 0;
        while(it.hasNext()) res[i++] = (int) it.next();
        return new IntSet(res);        
    }
    
    public boolean contains(int x){
        
        for(int i:arr) if(i == x) return true;
        return false;
        
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

public class J07009 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }

}


//5 6
//1 2 3 4 5
//3 4 5 6 7 8