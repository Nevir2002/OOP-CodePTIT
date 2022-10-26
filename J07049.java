package codeptit;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

//@author Nevir2002

class SP07049{
    
    String id,name;
    int cost,exp;
    public SP07049(Scanner sc){
        
        id = sc.nextLine();
        name = sc.nextLine();
        cost = sc.nextInt();
        exp = sc.nextInt();
        sc.nextLine();
        
    }
    
}

class KH07049 implements Comparable<KH07049>{
    
    String id,name,address,productID,date,expDate;
    int quantity,cost;
    static int idx = 1;
    static Vector<SP07049> v = new Vector<>();

    public KH07049(Scanner sc) throws Exception{
        
        id = String.format("KH%02d",idx++);
        name = sc.nextLine();
        address = sc.nextLine();
        productID = sc.nextLine();
        quantity = sc.nextInt();
        sc.nextLine();
        date = sc.nextLine();
        calcExpDate();
        
    }
    public static void addSP(Scanner sc){
        
        v.add(new SP07049(sc));
        
    }
    private void calcExpDate() throws Exception{
        
        for(SP07049 x:v){
            
            if(x.id.equals(productID)){
                
                cost = quantity*x.cost;
                expDate = add(date,x.exp);
                break;
                
            }
            
        }
        
    }
    private String add(String date, int months) throws Exception{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse(date);
        Calendar currDate = Calendar.getInstance();
        currDate.setTime(d);
        currDate.add(Calendar.MONTH, months);
        
        return sdf.format(currDate.getTime());
    }
    @Override
    public int compareTo(KH07049 a){
        
        String[] s1 = expDate.split("/");
        String[] s2 = a.expDate.split("/");
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for(String x:s1) if(x.length()>0) arr1.add(x);
        for(String x:s2) if(x.length()>0) arr2.add(x);
        String d1 = arr1.get(2)+arr1.get(1)+arr1.get(0);
        String d2 = arr2.get(2)+arr2.get(1)+arr2.get(0);
        return d1.compareTo(d2);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %d %s",id,name,address,productID,cost,expDate);
        
    }
    
}

public class J07049 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        Vector<KH07049> v = new Vector<>();
        sc = new Scanner(new File("MUAHANG.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) KH07049.addSP(sc);
        t = Integer.parseInt(sc.nextLine());
        while(t-->0) v.add(new KH07049(sc));
        Collections.sort(v);
        for(KH07049 x:v) System.out.println(x);
    }

}