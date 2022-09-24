package codeptit;

import java.util.*;

class MH5010 implements Comparable<MH5010>{
    
    int id;
    String name,group;
    double buy,sell,rev;
    static int index = 1;
    
    MH5010(String a, String b, double d, double e){
        
        id = index++;
        name = a;
        group = b;
        buy = d;
        sell = e;
        rev = sell - buy;
        
    }
    
    public int compareTo(MH5010 a){
        
        if(a.rev - rev < 0) return -1;
        else if(a.rev - rev > 0) return 1;
        return 0;
        
    }
    
    public void print(){
        
        String s = String.format("%.2f", rev);
        System.out.println(id + " " + name + " " + group + " " + s);
        
    }
    
}

public class J05010 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<MH5010> v = new Vector<>();
        for(int i = 0; i < n; i++){

            v.add(new MH5010(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));

        }

        Collections.sort(v);

        for(MH5010 x:v){

            x.print();

        }
            
    }
    
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37