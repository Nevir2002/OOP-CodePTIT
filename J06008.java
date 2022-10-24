package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class MH06008{
    
    String id,name;

    public MH06008(String input) {
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
class GV06008{
    
    String id,name;
    double totalTime = 0;
    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<String> time = new ArrayList<>();

    public GV06008(String input) {
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
    public void addTime(String subject,Vector<MH06008> v, String time){
        
        String subjectName = "";
        for(MH06008 x:v){
            
            if(subject.equals(x.id)){
                
                subjectName = x.name;
                break;
                
            }
            
        }
        
        if(!subjects.contains(subjectName)){
            
            subjects.add(subjectName);
            this.time.add(time);
            totalTime += Double.parseDouble(time);
            
        }
        
    }
    @Override
    public String toString(){
        
        String res = String.format("Giang vien: %s",name) + System.lineSeparator();
        for(int i = 0; i < subjects.size(); i++){
            
            res += String.format("%s %s", subjects.get(i),time.get(i)) + System.lineSeparator();
            
        }
        res += String.format("Tong: %.2f", totalTime);
        
        return res;
    }
    
}

public class J06008 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Vector<MH06008> v = new Vector<>();
        Vector<GV06008> res = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) v.add(new MH06008(sc.nextLine()));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) res.add(new GV06008(sc.nextLine()));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String teacherID = sc.next();
            String subjectID = sc.next();
            String time = sc.next();
            for(GV06008 x:res){
                
                if(x.id.equals(teacherID)){
                    
                    x.addTime(subjectID,v,time);
                    break;

                }
                
            }
            
        }
        String q = sc.next();
//        Collections.sort(v);
        for(GV06008 x:res){
            
            if(x.id.equals(q)){
                
                System.out.println(x);
                break;
                
            }
            
        }
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
//GV01


//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//3
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01 INT1306 200
//GV01