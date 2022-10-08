package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class PJ06004 implements Comparator<PJ06004>{
    
    String id,name,tel;
    int group;
    static ArrayList<String> topic = new ArrayList<>();

    public PJ06004() {
    }

    public PJ06004(String id, String name, String tel, String group) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.group = Integer.parseInt(group);
    }
    
    @Override
    public int compare(PJ06004 a, PJ06004 b){
        
        return a.id.compareTo(b.id);
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %s", id,name,tel, group, topic.get(group-1));
        
    }
}

public class J06004 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int t = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Vector<PJ06004> v = new Vector<>();
        while(t-->0){

            v.add(new PJ06004(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        Collections.sort(v,new PJ06004());
        while(m-->0){
            
            PJ06004.topic.add(sc.nextLine());
            
        }
        for(PJ06004 x:v){
            
            System.out.println(x);
            
        }

        sc.close();
    }

}

//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19