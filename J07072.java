package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DS implements Comparator<DS>{
    
    String name;
    DS(){}
    DS(String s){
        
        name = fix(s);
        
    }
    
    private String fix(String s){
        
        String res = "";
        String a[] = s.toLowerCase().split(" ");
        for(String x:a){
            
            if(x.length() > 0){
                
                res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
                
            }
            
        }
        
        return res.substring(0,res.length()-1);
    }
    
    @Override
    public int compare(DS a, DS b){
        
        String[] s1 = a.name.split(" ");
        String[] s2 = b.name.split(" ");
        
        int l1 = s1.length-1;
        int l2 = s2.length-1;
        
        if(s1[l1].equals(s2[l2])){
            
            if(s1[0].equals(s2[0])){
                
                return s1[1].compareTo(s2[1]);
                
            }
            return s1[0].compareTo(s2[0]);
            
        }
        return s1[l1].compareTo(s2[l2]);
    }
    
}

public class J07072 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            Vector<DS> v = new Vector<>();
            while(sc.hasNext()){
                
                v.add(new DS(sc.nextLine()));
                
            }
            Collections.sort(v,new DS());
            for(DS x:v){

                System.out.println(x.name);

            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in