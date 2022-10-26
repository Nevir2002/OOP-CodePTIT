package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH07020{
    
    String id,name,gender,dob,address;
    static int idx = 1;

    public KH07020(String name, String gender, String dob, String address) {
        this.id = String.format("KH%03d",idx++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }
    
}
class MH07020{
    
    String id,name,unit;
    long buy,sell;
    static int idx = 1;

    public MH07020(String name, String unit, long buy, long sell) {
        this.id = String.format("MH%03d",idx++);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }
    
}

class HD07020{
    
    String id,idKH,idMH;
    int quantity;
    static int idx = 1;
    static Vector<KH07020> vKH = new Vector<>();
    static Vector<MH07020> vMH = new Vector<>();

    public HD07020(Scanner sc) {
        
        String input = sc.nextLine();
        this.id = String.format("HD%03d",idx++);
        String[] str = input.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for(String x:str) if(x.length()>0)arr.add(x);
        idKH = arr.get(0);
        idMH = arr.get(1);
        quantity = Integer.parseInt(arr.get(2));
        
    }
    public static void addKH(Scanner sc){
        
        vKH.add(new KH07020(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        
    }
    public static void addMH(Scanner sc){
        
        vMH.add(new MH07020(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        
    }
    @Override 
    public String toString(){
        
        String res = id + " ";
        for(KH07020 x:vKH){
            
            if(x.id.equals(idKH)){
                
                res += x.name + " " + x.address + " ";
                break;
                
            }
            
        }
        for(MH07020 x:vMH){
            
            if(x.id.equals(idMH)){
                
                res += x.name + " " + x.unit + " " + x.buy + " " + x.sell + " " + quantity + " " + x.sell*quantity;
                break;
                
            }
            
        }
        
        return res;
        
    }
    
}

public class J07020 {

    public static void main(String[] args) throws Exception{

        Scanner sc;
        int t;
        sc = new Scanner(new File("KH.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) HD07020.addKH(sc);
        sc = new Scanner(new File("MH.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) HD07020.addMH(sc);
        sc = new Scanner(new File("HD.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) System.out.println(new HD07020(sc));

    }

}