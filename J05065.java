package codeptit;

import java.util.*;

class Employee implements Comparator<Employee>{
    
    String id,name,num,pos,rate;
    static int countGD = 0, countTP = 0, countPP = 0;
    
    Employee(){}
    Employee(String s){
        
        String[] a = s.split(" ");
        id = a[0];
        name = "";
        for(int i = 1; i < a.length; i++) name += a[i] + " ";
        name = name.substring(0,name.length()-1);
        pos = id.substring(0,2);
        rate = id.substring(2,4);
        num = id.substring(4);
        if(pos.equals("GD")){
            
            countGD++;
            if(countGD > 1) pos = "NV";
        }   
        if(pos.equals("TP")){
            
            countTP++;
            if(countTP > 3) pos = "NV";
        }   
        if(pos.equals("PP")){
            
            countPP++;
            if(countPP > 3) pos = "NV";
            
        }
        
    }
    
    public void print(){
        
        System.out.println(name + " " + pos + " " + num + " " + rate);
        
    }
    
    @Override
    public int compare(Employee a, Employee b){
        
        if(a.rate.equals(b.rate)) return a.num.compareTo(b.num);
        return b.rate.compareTo(a.rate);
        
    }
    
}

public class J05065 {

    public static void main(String arg[]){
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Employee> v = new Vector<>();
        for(int i = 0; i < n; i++){

            v.add(new Employee(sc.nextLine()));

        }
        Collections.sort(v,new Employee());

        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){

            String query = sc.nextLine();
            for(Employee x:v){

                if(x.pos.equals(query)) x.print();

            }
            System.out.println();

        }
        
    }

}