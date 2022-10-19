package danhsachsinhvien1;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class J07013 {

    public static void main(String[] args) throws Exception{

//        FileOutputStream fo = new FileOutputStream(new File("SV.in"));
//        ObjectOutputStream os = new ObjectOutputStream(fo);
//        ArrayList<SinhVien> arr = new ArrayList<>();
//        arr.add(new SinhVien(1,"Nguyen Van An", "D20CQCN01-B", "2/12/2002", (float) 3.19));
//        os.writeObject(arr);
        
        FileInputStream fi = new FileInputStream("SV.in");
        ObjectInputStream is = new ObjectInputStream(fi);
        ArrayList<SinhVien> v = (ArrayList<SinhVien>) is.readObject();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        for(SinhVien x:v){
            System.out.println(x);
//            System.out.println(String.format("%s %s %s %s %.2f", x.getMa(),x.getTen(),x.getLop(),df.format(x.getNgaysinh()),x.getGpa()));
        }
        
//        os.close();
    }

}