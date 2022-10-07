package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class SV05075{
    
    String id,name,cls,status = "";
    int attendance = 10;

    public SV05075() {
    }

    public SV05075(String id, String name, String cls) {
        this.id = id;
        this.name = name;
        this.cls = cls;
    }
    
    public void input(String s){
        
        for(int i = 0; i < 10; i ++){
            
            if(s.charAt(i) == 'm') attendance -= 1;
            if(s.charAt(i) == 'v') attendance -= 2;
            
        }
        if(attendance <= 0){
            
            attendance = 0;
            status = "KDDK";
            
        }
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s %s %d %s",id,name,cls,attendance,status);
        
    }
    
}

public class J05075 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<SV05075> v = new Vector<>();
        for(int i = 0; i < t; i++){

            v.add(new SV05075(sc.nextLine(),sc.nextLine(),sc.nextLine()));

        }
        for(int i = 0; i < t; i++){
            
            String[] s = sc.nextLine().split(" ");
            String id = s[0];
            for(SV05075 x:v){
                
                if(x.id.equals(id)){
                    
                    x.input(s[1]);
                    break;
                    
                }
                
            }
            
        }
        
        String q = sc.nextLine();
        
        for(SV05075 x:v){
            
            if(x.cls.equals(q)) System.out.println(x);
            
        }

        sc.close();
    }

}

//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm
//D19CQAT02-B