package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//@author Nevir2002

public class SinhVien implements Serializable{
    
    private String ma,ten,lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop,String ngaysinh,float gpa) throws ParseException {
        
        ma = String.format("B20DCCN%03d",id);
        this.ten = ten;
        this.lop = lop;

        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        String[] str = ngaysinh.split("/");
        while(str[0].length() < 2) str[0] = "0" + str[0];
        while(str[1].length() < 2) str[1] = "0" + str[1];
        while(str[2].length() < 4) str[2] = "0" + str[2];
        ngaysinh = String.format("%s/%s/%s",str[0],str[1],str[2]);
        this.ngaysinh = df.parse(ngaysinh);

        this.gpa = gpa;
        
    }
    public String toString(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %s %.2f",ma,ten,lop,df.format(ngaysinh),gpa);
        
    }
}

