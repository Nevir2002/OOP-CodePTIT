package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class WordSet{
    
    ArrayList<String> s;

    public WordSet() {
    }

    public WordSet(String s) {

        this.s = new ArrayList<>();
        String[] str = s.toLowerCase().split(" ");
        for(String x:str){
            
            if(x.length() > 0) this.s.add(x);
            
        }
        
    }
    public WordSet union(WordSet x){
        
        Set<String> st = new TreeSet<>();
        for(String i : this.s) st.add(i);
        for(String i : x.s) st.add(i);
        Iterator it = st.iterator();
        String res = "";
        while(it.hasNext()) res += it.next() + " ";
        return new WordSet(res);        
        
    }
    public WordSet intersection(WordSet x){
        
        WordSet union = this.union(x);
        String res = "";
        for(String str:union.s){
            
            if(this.s.contains(str) && x.s.contains(str)) res += str + " ";
            
        }
        return new WordSet(res);        
        
    }
    @Override
    public String toString(){
        
        String res = "";
        for(String i:this.s){
            
            res += i + " ";
            
        }
        
        return res;
    }
    
}

public class J04022 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}