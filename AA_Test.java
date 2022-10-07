package codeptit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
class MonHoc{
    String maMon,TenMon;
    int soTin;

    public MonHoc(String maMon, String TenMon, int soTin) {
        this.maMon = maMon;
        this.TenMon = TenMon;
        this.soTin = soTin;
    }
    
}
class SinhVien{
    String msv,hoTen,lop,email;

    public SinhVien(String msv, String hoTen, String lop, String email) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }
    
}
class BangDiem{
    String msv,maMon,tenSV,lop;
    double d;

    public BangDiem(String msv, String maMon, String tenSV, String lop, double d) {
        this.msv = msv;
        this.maMon = maMon;
        String[] w = tenSV.split("\\s+");
        this.tenSV = "";
        for(String x : w){
            if(x.length() == 0)
                continue;
            this.tenSV+= x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        this.tenSV = this.tenSV.substring(0, this.tenSV.length()-1);
        this.lop = lop;
        this.d = d;
    }
    public void print(){
        System.out.println(msv+" "+tenSV+" "+lop);
        if(Math.round(d) == d ){
            System.out.printf("%.0f",d);
            
        }else{
            System.out.printf("%.1f",d);
        }
        System.out.println("");
    }
}
class cmpm implements Comparator<BangDiem>{

    @Override
    public int compare(BangDiem o1, BangDiem o2) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(o2.d != o1.d)
            return Double.compare(o2.d, o1.d);
        return o1.msv.compareTo(o2.msv);
    }
    
}
public class AA_Test {
    
    public static void main(String[] args) throws IOException {
        try{
            Vector<SinhVien> vSV = new Vector<>();
            Vector<MonHoc> vMH = new Vector<>();
            Vector<BangDiem> vBD = new Vector<>();
            FileReader fr1 = new FileReader("SINHVIEN.in");
            BufferedReader bf1 = new BufferedReader(fr1);
            int n1 = Integer.parseInt(bf1.readLine());
            while(n1-->0){
                String msv = bf1.readLine();
                String tenSV = bf1.readLine();
                String lop = bf1.readLine();
                String email = bf1.readLine();
                SinhVien sv = new SinhVien(msv, tenSV, lop, email);
                vSV.add(sv);
            }
            FileReader fr2 = new FileReader("MONHOC.in");
            BufferedReader bf2 = new BufferedReader(fr2);
            int n2 = Integer.parseInt(bf2.readLine());
            while(n2-->0){
                String maMon = bf2.readLine();
                String tenMon = bf2.readLine();
                int soTin = Integer.parseInt(bf2.readLine());
                MonHoc m = new MonHoc(maMon, tenMon, soTin);
                vMH.add(m);
                
            }
            FileReader fr3 = new FileReader("BANGDIEM.in");
            BufferedReader bf3 = new BufferedReader(fr3);
            int n3 = Integer.parseInt(bf3.readLine());
            while(n3-->0){
                String s = bf3.readLine();
                String[] w = s.split("\\s+");
                String msv = "";
                String maMon = "";
                double d = 0;
                Vector<String> vS = new Vector<>();
                for(String x:w){
                    if(x.length() == 0)
                        continue;
                    vS.add(x);
                }
                msv = vS.get(0);
                maMon = vS.get(1);
                d = Double.parseDouble(vS.get(2));
                String tenSV = "";
                String lop = "";
                for(SinhVien x:vSV){
                    if(x.msv.equals(msv)){
                        tenSV = x.hoTen;
                        lop = x.lop;
                        break;
                    }
                }
                BangDiem bd = new BangDiem(msv, maMon, tenSV, lop, d);
                vBD.add(bd);
            }
            int dem = Integer.parseInt(bf3.readLine());
            Collections.sort(vBD,new cmpm());
            while(dem-->0){
                String mm = bf3.readLine();
                System.out.print("BANG DIEM MON ");
                for(MonHoc mh : vMH){
                    if(mh.maMon.equals(mm)){
                        System.out.println(mh.TenMon+":");
                        break;
                    }
                }
                for(BangDiem x: vBD){
                    if(x.maMon.equals(mm)){
                        x.print();
                    }
                }
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}