package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class MainClass {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            String s = sc.nextLine();
            if(s.length() < 2){
                
                System.out.println(Integer.parseInt(s)%5);
                
            } else{
                
                if(Integer.parseInt(s.substring(s.length()-2))%4 == 0) System.out.println(4);
                else System.out.println(0);
                
            }

        }

        sc.close();
    }

}

//2
//4
//123456789