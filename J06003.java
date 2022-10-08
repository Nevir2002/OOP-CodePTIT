package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class PJ06003{
    
    String id,name,tel;
    int group;
    static ArrayList<String> topic = new ArrayList<>();

    public PJ06003() {
    }

    public PJ06003(String id, String name, String tel, String group) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.group = Integer.parseInt(group);
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s", id,name,tel);
        
    }
}

public class J06003 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int t = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Vector<PJ06003> v = new Vector<>();
        while(t-->0){

            v.add(new PJ06003(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        while(m-->0){
            
            PJ06003.topic.add(sc.nextLine());
            
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            int q = sc.nextInt();
            System.out.println(String.format("DANH SACH NHOM %d:", q));
            for(PJ06003 x:v){
                
                if(x.group == q){
                    
                    System.out.println(x);
                    
                }
                
            }
            System.out.println(String.format("Bai tap dang ky: %s", PJ06003.topic.get(q-1)));
            
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
//1
//1