package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class WordSet{
    
    String s = "";
    
    public String toString(){
        
        return s;
        
    }
    
    WordSet(String str){
        
        File f = new File(str);
        try{
            
            Scanner sc = new Scanner(f);
            HashMap<String,Integer> mp = new HashMap<>();
            Vector<String> v = new Vector<>();    
            while(sc.hasNext()){
                
                String[] words = sc.nextLine().toLowerCase().split(" ");
                for(int i = 0; i < words.length; i++){
                    
                    if(words[i].length() == 0) continue;
                    if(!mp.containsKey(words[i])){
                        
                        mp.put(words[i],1);
                        v.add(words[i]);
                        
                    }
                    
                }
                
            }
            Collections.sort(v);
            for(String x:v){
                
//                StringBuilder sb = new StringBuilder(s);
//                s.
                s += x + System.lineSeparator();
                
            }
            
        } catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }
    
}

public class J07007 {

    public static void main(String[] args) throws IOException{
        WordSet ws = new WordSet("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in");
        System.out.println(ws);
    }

}