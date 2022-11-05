package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class HS5018 implements Comparator<HS5018>{
    
    String id, name, status;
    double avg;
    static int index = 1;

    public HS5018() {
    }

    public HS5018(String name, double[] s) {
        String tmp = String.valueOf(index++);
        if(tmp.length() < 2) tmp = '0' + tmp;
        this.id = "HS" + tmp;
        this.name = name;
        double sum = 0;
        int i = 0;
//        double[] grades = new double[10];
//        for(String x:s) if(x.length() > 0) grades[i++] = Double.parseDouble(x);
        sum += s[0] + s[1];
        for(double k:s) sum += k;
        this.avg = Math.round(sum/12*10.0)/10.0;
        if(this.avg >= 9) status = "XUAT SAC";
        else if(this.avg >= 8) status = "GIOI";
        else if(this.avg >= 7) status = "KHA";
        else if(this.avg >= 5) status = "TB";
        else status = "YEU";
    }
    
    public void print(){
        
        System.out.println(String.format("%s %s %.1f %s",id,name,avg,status));
        
    }
    
    @Override
    public int compare(HS5018 a, HS5018 b){
        
        double x = b.avg - a.avg;
        if(x > 0) return 1;
        if(x < 0) return -1;
        return 0;
        
    }
    
}

public class J05018 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());
        Vector<HS5018> v = new Vector<>();
        while(t-- != 0){

            String name = sc.nextLine();
            double[] x = new double[10];
            for(int i = 0; i < 10; i++) x[i] = sc.nextDouble();
            sc.nextLine();
            v.add(new HS5018(name,x));

        }
        Collections.sort(v, new HS5018());
        for(HS5018 x:v) x.print();

        sc.close();
    }

}
//4
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
//nbt
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5