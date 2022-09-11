package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//@author Nevir2002

class MH7074{
    
    String id,name,credits;
    MH7074(){};
    MH7074(String a, String b, String c){
        
        id = a;
        name = b;
        credits = c;
        
    }
    
}

class LGD extends MH7074 implements Comparator<LGD>{
    
    String groupID,date,time,teacherName,roomID;
    static int i = 1;
    LGD(){}
    LGD(String a, String b, String c, String d){
        
        String x = String.valueOf(i++);
        while(x.length() < 3) x = '0' + x;
        groupID = "HP" + x;
        date = a;
        time = b;
        teacherName = c;
        roomID = d;
        
    }
    
    public void print(){
        
        System.out.println(groupID + " " + date + " " + time + " " + teacherName + " " + roomID);
        
    }
    
    @Override
    public int compare(LGD a, LGD b){
        
        if(a.date.equals(b.date) && a.time.equals(b.time)) return a.teacherName.compareTo(b.teacherName);
        if(a.date.equals(b.date)) return a.time.compareTo(b.time);
        return a.date.compareTo(b.date);
        
    }
    
}

public class J07074 {

    public static void main(String arg[]){

        try{
            
            Scanner sc1 = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
            Scanner sc2 = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATABIN.in"));
            int n = Integer.parseInt(sc1.nextLine());
            Vector<MH7074> v1 = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v1.add(new MH7074(sc1.nextLine(), sc1.nextLine(),sc1.nextLine()));
                
            }
            n = Integer.parseInt(sc2.nextLine());
            Vector<LGD> v2 = new Vector<>();
            for(int i = 0; i < n; i++){
                
                String str = sc2.nextLine();
                LGD obj = new LGD(sc2.nextLine(),sc2.nextLine(),sc2.nextLine(),sc2.nextLine());
                for(MH7074 x:v1){
                    
                    if(x.id.equals(str)){
                        
                        obj.id = x.id;
                        
                    }                    
                    
                }
                v2.add(obj);
                
            }
            Collections.sort(v2,new LGD());
            String query = sc2.nextLine();
            for(MH7074 x:v1){
                
                if(x.id.equals(query)){
                    
                    System.out.println("LICH GIANG DAY MON " + x.name + ":");
                    break;
                    
                }
                
            }
            for(LGD x:v2){
                
                if(x.id.equals(query)){
                    
                    x.print();
                    
                }
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in