package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Short{
    
    ArrayList<String> s;
    Short(){}
    Short(String str){
        
        s = new ArrayList<>();
        String[] a = str.split(" ");
        if(a.length > 1){
            
            for(String x:a){
                    
                s.add(x.substring(0,1));

            }
            
        } else{
            
            String[] b = str.split("\\.");
            for(String x:b){

                s.add(x.substring(0,1));

            }
        }
        
    }
    
    public boolean check(Short str){
        
        if(s.size() != str.s.size()) return false;
        for(int i = 0; i < str.s.size(); i++){
            
            if(!str.s.get(i).equals(s.get(i)) && !str.s.get(i).equals("*")) return false;
            
        }
        return true;
    }
    
    public void print(){
        
        System.out.println(s);
        
    }
    
}

class Name implements Comparator<Name>{

    String name;
    Short abbreviation;
    
    Name(){}
    Name(String s){
        
        name = s;
        abbreviation = new Short(s);
        
    }
    
    @Override
    public int compare(Name a, Name b){
        
        String[] s1 = a.name.split(" ");
        String[] s2 = b.name.split(" ");
        
        int l1 = s1.length-1;
        int l2 = s2.length-1;
        
        if(s1[l1].equals(s2[l2])){
            
            return s1[0].compareTo(s2[0]);
            
        }
        return s1[l1].compareTo(s2[l2]);
    }

}

public class J07071 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<Name> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new Name(sc.nextLine()));
                
            }
            Collections.sort(v,new Name());
            int t = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < t; i++){
                
                Short str = new Short(sc.nextLine());
                Vector<Name> res = new Vector<>();
                for(Name x:v){
                    
                    if(x.abbreviation.check(str)) res.add(x);
                    
                }
                
                for(Name x:res) System.out.println(x.name);
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in