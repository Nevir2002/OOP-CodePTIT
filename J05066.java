package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class NV05066 implements Comparable<NV05066>{
    
    String name,pos,x,id;

    public NV05066(String input) {
        
        String[] str = input.split(" ");
        ArrayList<String> a = new ArrayList<>();
        for(String z:str){
            
            if(z.length()>0) a.add(z);
            
        }
        x = a.get(0).substring(2,4);
        id = a.get(0).substring(4);
        pos = a.get(0).substring(0,2);
        if(pos.equals("GD")){
            if(id.compareTo("001") > 0) pos = "NV";
        }
        if(pos.equals("TP")){
            if(id.compareTo("003") > 0) pos = "NV";
        }
        if(pos.equals("PP")){
            if(id.compareTo("003") > 0) pos = "NV";
        }
        name = "";
        for(int i = 1; i < a.size(); i++){
            
            name += a.get(i);
            if(i < a.size()-1) name += " ";
            
        }
    }
    @Override
    public int compareTo(NV05066 a){
        
        if(a.x.equals(x)) return id.compareTo(a.id);
        return a.x.compareTo(x);
        
    }
    public boolean containsIgnoreCase(String s){
        
        String str = name.toLowerCase();
        return str.contains(s.toLowerCase());
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s",name,pos,id,x);
        
    }
    
}

public class J05066 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        Vector<NV05066> v = new Vector<>();
        while(t-->0){

            v.add(new NV05066(sc.nextLine()));

        }
        Collections.sort(v);
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            String q = sc.nextLine();
//            System.out.println(q + ":");
            for(NV05066 x:v) if(x.containsIgnoreCase(q)) System.out.println(x);
            System.out.println();
            
        }
        sc.close();
    }

}

//6
//GD08001 Nguyen Kim Loan
//TP05002 Hoang Thanh Tuan
//TP05001 Tran Binh Nguyen
//PP06002 Phan Trung Tuan
//PP06001 Tran Quoc Huy
//NV04003 Vo Van Lan
//2
//OA
//aN