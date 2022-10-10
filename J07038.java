package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV07038{

    int idx;
    String id,name,cls,email;

    public SV07038() {
    }

    public SV07038(String id, String name, String cls, String email) {
        this.id = id;
        this.name = fix(name);
        this.cls = cls;
        this.email = email;
    }
    private String fix(String s){
        
        String[] x = s.toLowerCase().split(" ");
        String res = "";
        for(String k:x) if(k.length() > 0) res += k.substring(0,1).toUpperCase() + k.substring(1) + " ";
        return res.substring(0,res.length()-1);
        
    }
    
}

class DN07038{
    
    String id,name,cap;

    public DN07038() {
    }

    public DN07038(String id, String name, String cap) {
        this.id = id;
        this.name = name;
        this.cap = cap;
    }
    
}

class TT07038 implements Comparator<TT07038>{
    
    String idSV,idDN;
    static Vector<SV07038> vSV;
    static Vector<DN07038> vDN;

    public TT07038() {
    }

    public TT07038(String input) {
        String[] s = input.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(String x:s){
            if(x.length() > 0) arr.add(x);
            
        }
        this.idSV = arr.get(0);
        this.idDN = arr.get(1);
    }
    
    public String getSVName(){
        
        for(SV07038 x:vSV) if(x.id.equals(idSV)) return x.name;
        
        return "Not found";
        
    }
    public String getSVClass(){
        
        for(SV07038 x:vSV) if(x.id.equals(idSV)) return x.cls;
        
        return "Not found";
        
    }
    public String getDNName(){
        
        for(DN07038 x:vDN) if(x.id.equals(idDN)) return x.name;
        
        return "Not found";
        
    }
    public int getDNCap(){
        
        for(DN07038 x:vDN) if(x.id.equals(idDN)) return Integer.parseInt(x.cap);
        
        return -1;
        
    }
    
    @Override
    public int compare(TT07038 a,TT07038 b){
        
        return a.idSV.compareTo(b.idSV);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s",idSV,getSVName(),getSVClass());
        
    }
    
}

public class J07038 {

    public static void main(String arg[]) throws Exception{

        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int t = Integer.parseInt(sc.nextLine());
        Vector<SV07038> vsv = new Vector<>();

        while(t-->0){

            vsv.add(new SV07038(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        sc = new Scanner(new File("DN.in"));
        Vector<DN07038> vdn = new Vector<>();
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){

            vdn.add(new DN07038(sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        TT07038.vSV = vsv;
        TT07038.vDN = vdn;
        sc = new Scanner(new File("THUCTAP.in"));
        t = Integer.parseInt(sc.nextLine());
        Vector<TT07038> v = new Vector<>();
        while(t-->0) v.add(new TT07038(sc.nextLine()));
        Collections.sort(v,new TT07038());
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            
            int cap = 0;
            int cnt = 0;
            String id = sc.nextLine();
            for(TT07038 x:v){
                
                if(x.idDN.equals(id)){
                    
                    System.out.println("DANH SACH THUC TAP TAI " + x.getDNName() + ":");
                    cap = x.getDNCap();
                    break;
                    
                }
                
            }
            for(TT07038 x:v){
                
                if(x.idDN.equals(id) && cnt++ < cap) System.out.println(x);
                
            }
            
        }

        sc.close();
    }

}