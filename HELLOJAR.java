package codeptit;

import java.io.*;
import java.util.*;
import view.*;
import vn.edu.ptit.*;

//@author Nevir2002

class PaymentController{
    
    Scanner sc;

    public PaymentController() {
        sc = new Scanner(System.in);
    }
    public Invoice getInvoice(){
        
        Student st = new Student(sc.nextLine(), sc.nextLine());
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> v = new ArrayList<>();
        while(t-->0){
            
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            v.add(new Subject(s2,s1,Integer.parseInt(s3)));
            
        }
        Rule rule = new Rule(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        Invoice a = new Invoice(rule);
        a.setAlSubject(v);
        a.setSt(st);
        int totalCredits = 0;
        for(Subject x:a.getAlSubject()){
            
            totalCredits += x.getCredit();
            
        }
        a.setAmount(a.getRule().getCreditPrice()*totalCredits);
       
        return a;        
    }
    
    
}

public class HELLOJAR {

    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }   

}

//B20DCCN001
//Nguyễn Văn A
//2
//INT1155
//Tin học cơ sở 2
//2
//INT1332
//Lập trình hướng đối tượng
//3
//QD123
//QD123 HP
//550000