package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class BD5031 implements Comparator<BD5031>{
    
    String id,name,cls;
    double a,b,c;
    static int index = 1;

    public BD5031() {
    }

    public BD5031(String id, String name, String cls, double a, double b, double c) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int compare(BD5031 a, BD5031 b){
        
        return a.name.compareTo(b.name);
        
    }
    
    public void print(){
        
        System.out.println(String.format("%d %s %s %s %.1f %.1f %.1f", index++,id,name,cls,a,b,c));

    }
    
}

public class J05031 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<BD5031> v = new Vector<>();
        while(t-->0){

            v.add(new BD5031(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
            sc.nextLine();

        }
        Collections.sort(v, new BD5031());
        for(BD5031 x:v) x.print();

        sc.close();
    }

}
//3
//B20DCCN999
//Nguyen Van An
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van Nam
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Tran Hoa Binh
//D20CQCN04-B
//9.0
//5.0
//6.0