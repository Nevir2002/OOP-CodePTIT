package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J03029 {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            
            String s = sc.nextLine().trim();
            String str = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
            ArrayList<String> arr = new ArrayList<>();
            char x = str.charAt(str.length()-1);
            if(x != '.' && x != '!' && x != '?') str += '.';
            String[] arrStr = str.split(" ");
            for(String zz:arrStr){
                
                if(zz.length() > 0) arr.add(zz);
                
            }
            String res = "";
            for(int i = 0; i < arr.size(); i++){
                
                res += arr.get(i);
                if(i < arr.size()-1 && !(arr.get(i+1).equals(".") || arr.get(i+1).equals("!") || arr.get(i+1).equals("?"))) res += " ";
                
            }
            System.out.println(res);
            
        }

        sc.close();
    }

}

//Chuong trinh Dao Tao CLC nganh CNTT duoc Thiet     Ke theo chuan quoc te.
//co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
//muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
//moi    CAC BAN danG ky     thaM giA !