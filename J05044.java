package codeptit;

import java.util.*;

class NV05044{
    
    String id, name, pos;
    int wage,bonus,remain,tmp;
    static int idx = 1;

    public NV05044() {
    }

    public NV05044(String name, String pos, int wage, int days) {
        this.id = String.format("NV%02d", idx++);
        this.name = name;
        this.pos = pos;
        this.wage = wage*days;
        if(pos.equals("GD")) bonus = 500;
        else if(pos.equals("PGD")) bonus = 400;
        else if(pos.equals("TP")) bonus = 300;
        else if(pos.equals("KT")) bonus = 250;
        else bonus = 100;
        this.tmp = Math.min(25000,Math.round((float)(wage*days+bonus)*2/3/1000)*1000);
        this.remain = wage*days+bonus-tmp;
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %d %d %d %d", id, name, bonus, wage, tmp, remain);
        
    }
    
}

public class J05044 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        Vector<NV05044> v = new Vector<>();
        for(int i = 0; i < t; i++){

            v.add(new NV05044(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
            
        }
        String q = sc.nextLine();
        for(NV05044 x:v){
            
            if(x.pos.equals(q)) System.out.println(x);
            
        }

        sc.close();
    }

}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
//TP