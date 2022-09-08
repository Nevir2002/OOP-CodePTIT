package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MH implements Comparator<MH>{
    
    String id,name,credits,studyMethod,practiceMethod;
    
    MH(){}
    MH(String a,String b,String c,String d,String e){
        
        id = a;
        name = b;
        credits = c;
        studyMethod = d;
        practiceMethod = e;
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + credits + " " + studyMethod + " " + practiceMethod);
        
    }
    
    @Override
    public int compare(MH a, MH b){
        
        return a.id.compareTo(b.id);
        
    }
    
}

public class J07073 {

    public static void main(String arg[]){
        
        try{
            
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<MH> v = new Vector<>();
            for(int i = 0; i < n; i++){

                MH x = new MH(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
                if(!x.practiceMethod.equals("Truc tiep")) v.add(x);

            }
            Collections.sort(v,new MH());

            for(MH x:v) x.print();
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in