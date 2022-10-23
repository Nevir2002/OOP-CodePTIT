package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

public class J05019 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Double> amount = new ArrayList<>();
        ArrayList<Double> time = new ArrayList<>();
        while(t-->0){

            String n = sc.nextLine();
            String t1 = sc.nextLine();
            String t2 = sc.nextLine();
            double q = Double.parseDouble(sc.nextLine());
            String[] s1 = t1.split(":");
            String[] s2 = t2.split(":");
            double timeDiff = Double.parseDouble(s2[0]) - Double.parseDouble(s1[0]) + (Double.parseDouble(s2[1]) - Double.parseDouble(s1[1]))/60;
            if(name.contains(n)){
                
                int idx = name.indexOf(n);
                amount.set(idx, amount.get(idx)+q);
                time.set(idx, time.get(idx)+timeDiff);
                
            } else{
                
                name.add(n);
                amount.add(q);
                time.add(timeDiff);
                
            }
            
        }
        t = name.size();
        for(int i = 0; i < t; i++){
            
            System.out.println(String.format("T%02d %s %.2f", i+1,name.get(i),amount.get(i)/time.get(i)));
            
        }

        sc.close();
    }

}

//10
//Dong Anh
//07:30
//08:00
//60
//Cau Giay
//07:45
//08:12
//50
//Soc Son
//08:00
//09:15
//78
//Dong Anh
//18:50
//20:00
//88
//Cau Giay
//19:01
//20:00
//77
//Soc Son
//19:06
//20:21
//66
//Dong Anh
//21:00
//21:40
//49
//Cau Giay
//21:50
//22:20
//68
//Dong Anh
//22:15
//23:45
//30
//Cau Giay
//22:50
//23:45
//35