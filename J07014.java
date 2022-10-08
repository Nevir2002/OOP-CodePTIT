package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class WordSet{
    
    TreeSet<String> mp;

    public WordSet() {
    }

    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        mp = new TreeSet<>();
        while(sc.hasNext()){
            
            mp.add(sc.next().toLowerCase());
            
        }
    }
    
    public String union(WordSet a){
        
        TreeSet<String> tmp = (TreeSet<String>) mp.clone();
        tmp.addAll(a.mp);
        
        return asString(tmp);
        
    }
    public String intersection(WordSet a){
        
        TreeSet<String> res = new TreeSet<>();
        for(String x:a.mp){
            
            if(mp.contains(x)) res.add(x);
            
        }
        
        return asString(res);
        
    }
    
    private String asString(TreeSet<String> a){
        
        String res = "";
        for(String x:a) res += x + " ";
        
        return res;        
    }
    
}

public class J07014 {

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}