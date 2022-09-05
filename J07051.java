package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Customer{
    
    String customerID,name,from,to,roomID;
    int dateDiff,bonus,total;
    static int cnt = 1;
    int[] a = {0,25,34,50,80};
    
    Customer(String name, String roomID, String from, String to, int bonus){
        
        String s = String.valueOf(cnt++);
        if(s.length() < 2) s = '0' + s;
        customerID = "KH" + s;
        this.name = correct(name);
        this.roomID = roomID.trim();
        this.from = fix(from);
        this.to = fix(to);
        dateDiff = diff();
        this.bonus = bonus;
        total = a[Integer.parseInt(roomID.substring(0,1))]*diff() + bonus;
        
    }
    
    public void print(){
        
        System.out.println(customerID + " " + name + " " + roomID + " " + dateDiff + " " + total);
        
    }
    
    private String correct(String s){
        
        String[] a = s.toLowerCase().trim().split(" ");
        String res = "";
        for(String x:a){
            
            if(x.length() <= 0) continue;
            res += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
            
        }
        return res.substring(0,res.length()-1);
    }
    
    private String fix(String s){
        
        s = s.trim();
        String[] a = s.split("/");
        for(int i = 0; i < 3; i++){
            
            if(a[i].length() < 2) a[i] = '0' + a[i];
            
        }
        
        String res = a[0] + '/' + a[1] + '/' + a[2];
        return res;
        
    }
    
    private int diff(){
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            
            Date a = df.parse(from);
            Date b = df.parse(to);
            long timeDiff = b.getTime() - a.getTime();
            long dateDiff = timeDiff/(1000*60*60*24);
            //               millisec/sec/min/hr/day
            return (int)(dateDiff+1);
            
        }catch(ParseException e){
            
            System.out.println(e);
            
        }
        return -1;  
    }
    
}

class cmpCust implements Comparator<Customer>{
    
    public int compare(Customer a, Customer b){
        
        return b.total - a.total;
        
    }
    
}

public class J07051{

    public static void main(String arg[]){
        
        try{
            
            Scanner sc = new Scanner(new File("KHACHHANG.in"));
            int n = Integer.parseInt(sc.nextLine());
            Vector<Customer> v = new Vector<>();
            for(int i = 0; i < n; i++){
                
                v.add(new Customer(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
                
            }
            
            Collections.sort(v, new cmpCust());
            sc.close();
            for(Customer x:v){
                
                x.print();
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }catch(IOException ioe){
            
            System.out.println(ioe);
            
        }

    }

}