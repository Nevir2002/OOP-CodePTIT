package codeptit;

import java.util.*;

class SVien{
    
    String id,name,cat;
    double avg;
    int rank;
    
    SVien(String a, String b, double c){
        
        id = a;
        name = b;
        avg = c;
        
        if(avg < 5) cat = "Yeu";
        else if(avg < 7) cat = "Trung Binh";
        else if(avg < 9) cat = "Kha";
        else cat = "Gioi";
        
    }
    
    public void print(){
        
        System.out.println(id + " " + name + " " + String.format("%.1f",avg) + " " + cat + " " + rank);
        
    }
    
}


public class J05054 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        SVien[] list = new SVien[n];
        Vector<Double> v = new Vector<>();
        for(int t = 0; t < n; t++){
            
            String s = String.valueOf(t+1);
            if(s.length() < 2) s = '0' + s;
            s = "HS" + s;
            String a = sc.nextLine();
            double b = Double.parseDouble(sc.nextLine());
            list[t] = new SVien(s,a,b);
            v.add(list[t].avg);
            
        }
        Collections.sort(v, new cmpSVien());
//        System.out.println();
//        for(double x:v){
//            
//            System.out.println(x);
//            
//        }

        for(int i = 0; i < n; i++){

            list[i].rank = v.indexOf(list[i].avg)+1;

        }
        
        for(int i = 0; i < n; i++){
            
            list[i].print();
            
        }
        
        sc.close();
    }
   
}
class cmpSVien implements Comparator<Double>{
    
    public int compare(Double a, Double b){
        
        if(b-a < 0) return -1;
        else if(b-a > 0) return 1;
        return 0;
        
    }
    
}
//4
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
//NBT
//9.2