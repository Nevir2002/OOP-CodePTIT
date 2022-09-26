package codeptit;

import java.util.*;

class DN5029 implements Comparator<DN5029>{
    
    String id,name;
    int num;

    public DN5029() {
    }

    public DN5029(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }
    
    
    
    public void print(){
        
        System.out.println(String.format("%s %s %s",id, name, num));
        
    }
    
    @Override
    public int compare(DN5029 a, DN5029 b){
        
        if(a.num == b.num) return a.id.compareTo(b.id);
        return b.num-a.num;
        
    }
    
}

public class J05029 {

    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<DN5029> v = new Vector<>();
        for(int i = 0; i < t; i++){

            v.add(new DN5029(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));

        }
        Collections.sort(v,new DN5029());

        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:", a,b));
            sc.nextLine();
            for(DN5029 x:v){

                if(x.num >= a && x.num <= b) x.print();

            }
            
        }

        sc.close();
        
    }
    
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50