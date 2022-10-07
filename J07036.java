package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV07036{
    
    String id, name, cls, email;

    public SV07036() {
    }
    public SV07036(String id, String name, String cls, String email) {
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

class MH07036{
    
    String id,name;
    int creds;

    public MH07036() {
    }
    public MH07036(String id, String name, int creds) {
        this.id = id;
        this.name = name;
        this.creds = creds;
    }
    
}

class BD07036 implements Comparator<BD07036>{
    
    SV07036 student;
    MH07036 subject;
    double point;

    public BD07036() {
    }

    public BD07036(SV07036[] studentList, MH07036[] subjectList, String input) {
        String[] a = input.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(String x:a) if(x.length() > 0) arr.add(x);
        for(SV07036 x:studentList){
            if(x.id.equals(arr.get(0))){
                student = x;
                break;
            }
        }
        
        for(MH07036 x:subjectList){
            if(x.id.equals(arr.get(1))){
                subject = x;
                break;
            }
        }
        point = Double.parseDouble(arr.get(2));
                
    }
    
    @Override
    public int compare(BD07036 a, BD07036 b){
        
        if(a.subject.id.equals(b.subject.id)) return a.student.id.compareTo(b.student.id);
        return a.subject.id.compareTo(b.subject.id);
        
    }
    
    @Override
    public String toString(){
        String sPoint;
        if(Math.round(point) == point) sPoint = String.format("%.0f", point);
        else sPoint = String.format("%.1f", point);
        return String.format("%s %s %s %s %s",student.id,student.name,subject.id,subject.name,sPoint);
        
    }

}

public class J07036 {

    public static void main(String arg[]) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        SV07036[] studentList = new SV07036[n];
        for(int i = 0; i < n; i++) studentList[i] = new SV07036(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());        
        sc.close();
        sc = new Scanner(new File("MONHOC.in"));
        n = Integer.parseInt(sc.nextLine());
        MH07036[] subjectList = new MH07036[n];
        for(int i = 0; i < n; i++) subjectList[i] = new MH07036(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
        sc.close();
        sc = new Scanner(new File("BANGDIEM.in"));
        n = Integer.parseInt(sc.nextLine());
        Vector<BD07036> v = new Vector<>();
        for(int i = 0; i < n; i++) v.add(new BD07036(studentList,subjectList,sc.nextLine()));
        Collections.sort(v,new BD07036());
        n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            
            String q = sc.nextLine();
            String s = "";
            for(SV07036 x:studentList){
                
                if(x.cls.equals(q)){
                    
                    s = x.cls;
                    break;
                    
                }
                
            }
            System.out.println(String.format("BANG DIEM lop %s:", s));
            for(BD07036 x:v){
                
                if(x.student.cls.equals(q)){
                    
                    System.out.println(x);
                    
                }
                
            }
            
        }
        sc.close();
        
    }

}