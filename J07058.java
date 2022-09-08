package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MH implements Comparator<MH>{
    
    String id,name,method;
    MH(){}
    MH(String id, String name, String method){
        
        this.id = id;
        this.name = name;
        this.method = method;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + method);
        
    }
    
    @Override
    public int compare(MH a, MH b){
        
        return a.id.compareTo(b.id);
        
    }
    
}

public class J07058 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<MH> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new MH(sc.nextLine(),sc.nextLine(),sc.nextLine()));
                
            }
            Collections.sort(v,new MH());
            for(MH x:v){

                x.print();

            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in