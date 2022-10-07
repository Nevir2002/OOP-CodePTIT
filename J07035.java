package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV07035{
    
    String id, name, cls, email;

    public SV07035() {
    }
    public SV07035(String id, String name, String cls, String email) {
        this.id = id;
        this.name = fix(name);
        this.cls = cls;
        this.email = email;
    }
    private String fix(String s){
        
        String res = "";
        String[] a = s.split(" ");
        for(String x:a){
            
            if(x.length() > 0) res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            
        }
        
        return res.substring(0,res.length()-1);
    }
            
}

class MH07035{
    
    String id,name;
    int creds;

    public MH07035() {
    }
    public MH07035(String id, String name, int creds) {
        this.id = id;
        this.name = name;
        this.creds = creds;
    }
    
}

class BD07035 implements Comparator<BD07035>{
    
    SV07035 student;
    MH07035 subject;
    double point;

    public BD07035() {
    }

    public BD07035(SV07035[] studentList, MH07035[] subjectList, String input) {
        String[] a = input.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(String x:a) if(x.length() > 0) arr.add(x);
        for(SV07035 x:studentList){
            if(x.id.equals(arr.get(0))){
                student = x;
                break;
            }
        }
        
        for(MH07035 x:subjectList){
            if(x.id.equals(arr.get(1))){
                subject = x;
                break;
            }
        }
        point = Double.parseDouble(arr.get(2));
                
    }
    
    @Override
    public int compare(BD07035 a, BD07035 b){
        
        if(a.point == b.point) return a.student.id.compareTo(b.student.id);
        return Double.compare(b.point, a.point);
        
    }
    
    @Override
    public String toString(){
        String sPoint;
        if(Math.round(point) == point) sPoint = String.format("%.0f", point);
        else sPoint = String.format("%.1f", point);
        return String.format("%s %s %s %s",student.id,student.name,student.cls,sPoint);
        
    }

}

public class J07035 {

    public static void main(String arg[]) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SV07035[] studentList = new SV07035[n];
        for(int i = 0; i < n; i++) studentList[i] = new SV07035(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());        
        sc.close();
        sc = new Scanner(new File("MONHOC.in"));
        n = Integer.parseInt(sc.nextLine());
        MH07035[] subjectList = new MH07035[n];
        for(int i = 0; i < n; i++) subjectList[i] = new MH07035(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        sc.close();
        sc = new Scanner(new File("BANGDIEM.in"));
        n = Integer.parseInt(sc.nextLine());
        Vector<BD07035> v = new Vector<>();
        for(int i = 0; i < n; i++) v.add(new BD07035(studentList,subjectList,sc.nextLine()));
        Collections.sort(v,new BD07035());
        n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            
            String q = sc.nextLine();
            String s = "";
            for(MH07035 x:subjectList){
                
                if(x.id.equals(q)){
                    
                    s = x.name;
                    break;
                    
                }
                
            }
            System.out.println(String.format("BANG DIEM MON %s:", s));
            for(BD07035 x:v){
                
                if(x.subject.id.equals(q)){
                    
                    System.out.println(x);
                    
                }
                
            }
            
        }
        sc.close();
        
    }

}