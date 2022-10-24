package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class KH06005{
    
    String id,name,gender,dob,address;
    static int idx = 1;

    public KH06005(String name, String gender, String dob, String address) {
        id = String.format("KH%03d",idx++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    
    
}
class MH06005{
    
    String id,name,unit;
    long buy,sell;
    static int idx = 1;

    public MH06005(String name, String unit, long buy, long sell) {
        id = String.format("MH%03d",idx++);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

}

class HD06005{
    
    String id;
    KH06005 customer;
    MH06005 product;
    int quantity;
    long total;
    static int idx = 1;
    static Vector<KH06005> customerList = new Vector<>();
    static Vector<MH06005> productList = new Vector<>();

    public HD06005(String customerID, String productID, int quantity) {
        id = String.format("HD%03d",idx++);
        for(KH06005 x:customerList){
            
            if(x.id.equals(customerID)){
                
                customer = x;
                break;
                
            }
            
        }
        for(MH06005 x:productList){
            
            if(x.id.equals(productID)){
                
                product = x;
                break;
                
            }
            
        }
        this.quantity = quantity;
        total = this.quantity*product.sell;
    }
    public static void addCustomer(KH06005 a){
        
        customerList.add(a);
        
    }
    public static void addProduct(MH06005 a){
        
        productList.add(a);
        
    }
    @Override
    public String toString(){
        
        return String.format("%s %s %s %s %s %d %d %d %d", id,customer.name,customer.address,product.name,product.unit,product.buy,product.sell,quantity,total);
        
    }
    
}

public class J06005 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Vector<HD06005> v = new Vector<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){

            HD06005.addCustomer(new KH06005(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){

            HD06005.addProduct(new MH06005(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));

        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            v.add(new HD06005(sc.next(),sc.next(),sc.nextInt()));
            
        }
//        Collections.sort(v);
        for(HD06005 x:v) System.out.println(x);
        sc.close();
    }

}

//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4