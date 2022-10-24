package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class MH06007{
    
    String id,name;

    public MH06007(String input) {
        String[] str = input.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for(String x:str) if(x.length()>0) a.add(x);
        id = a.get(0);
        String res = "";
        for(int i = 1; i < a.size(); i++){
            
            res += a.get(i);
            if(i != a.size()-1) res += ' ';
            
        }
        name = res;
    }
    
}
class GV06007{
    
    String id,name;
    double time;
    ArrayList<String> subjects = new ArrayList<>();

    public GV06007(String input) {
        String[] str = input.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for(String x:str) if(x.length()>0) a.add(x);
        id = a.get(0);
        String res = "";
        for(int i = 1; i < a.size(); i++){
            
            res += a.get(i);
            if(i != a.size()-1) res += ' ';
            
        }
        name = res;
    }
    public void addTime(String subject, double time){
        
        if(!subjects.contains(subject)){
            
            subjects.add(subject);
            this.time += time;
            
        }
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %.2f", name,time);
        
    }
    
}

public class J06007 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Vector<MH06007> v = new Vector<>();
        Vector<GV06007> res = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) v.add(new MH06007(sc.nextLine()));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) res.add(new GV06007(sc.nextLine()));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String teacherID = sc.next();
            String subjectID = sc.next();
            double time = sc.nextDouble();
            for(GV06007 x:res){
                
                if(x.id.equals(teacherID)){
                    
                    x.addTime(subjectID, time);
                    break;

                }
                
            }
            
        }
//        Collections.sort(v);
        for(GV06007 x:res) System.out.println(x);
        sc.close();
    }

}

//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72