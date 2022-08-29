package codeptit;

import java.io.File;
import java.io.IOException;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    
    String id,name,n1,n2;
    LoaiPhong(String a){
        
        String[] s = a.split(" ");
        id = s[0];
        name = s[1];
        n1 = s[2];
        n2 = s[3];
        
    }
    
    public int compareTo(LoaiPhong a){
        
        return name.compareTo(a.name);
        
    }
    
    public String toString(){
        
        return (id + " " + name + " " + n1 + " " + n2);
        
    }
    
}

public class J07045 {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}