package codeptit;

import java.util.*;

class DN5028 implements Comparator<DN5028>{
    
    String id,name;
    int num;

    public DN5028() {
    }

    public DN5028(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }
    
    
    
    public void print(){
        
        System.out.println(String.format("%s %s %s",id, name, num));
        
    }
    
    @Override
    public int compare(DN5028 a, DN5028 b){
        
        if(a.num == b.num) return a.id.compareTo(b.id);
        return b.num-a.num;
        
    }
    
}

public class J05028 {

    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Vector<DN5028> v = new Vector<>();
        for(int i = 0; i < n; i++){

            v.add(new DN5028(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));

        }
        Collections.sort(v,new DN5028());

        for(DN5028 x:v){

            x.print();

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