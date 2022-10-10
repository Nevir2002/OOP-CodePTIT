package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class WordSet{
    
    Set<String> st;

    public WordSet() {
    }

    public WordSet(String fi) throws FileNotFoundException {
        st = new TreeSet<>();
        Scanner sc = new Scanner(new File(fi));
        while(sc.hasNext()) st.add(sc.next().toLowerCase());
    }

    public String difference(WordSet s){
        
        String res = "";
        for(String x:st) if(!s.st.contains(x)) res += x + " ";
       
        return res;
    }    
    
}

public class J07024 {

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
    
}