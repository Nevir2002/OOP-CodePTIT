package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Subject{
    
    String id,name;
    int creds;
    
    Subject(String a, String b, int c){
        
        id = a;
        name = b;
        creds = c;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + creds);
        
    }
    
}

class cmp implements Comparator<Subject>{
    
    public int compare(Subject a, Subject b){
        
        return a.name.compareTo(b.name);
        
    }
    
}

public class J07034 {

    public static void main(String arg[]){

        try{
            
            File f = new File("MONHOC.in");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                
                int n = Integer.parseInt(sc.nextLine());
                Vector<Subject> v = new Vector<>();
                for(int i = 0; i < n; i++){
                    
                    String x = sc.nextLine();
                    String y = sc.nextLine();
                    int z = Integer.parseInt(sc.nextLine());
                    v.add(new Subject(x,y,z));
                    
                }
                Collections.sort(v, new cmp());
                for(Subject x:v){
                    
                    x.print();
                    
                }
                
            }
            
        } catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}