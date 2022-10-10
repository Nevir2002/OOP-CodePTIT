package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J07078 {

    public static void main(String arg[]) throws FileNotFoundException{

        Scanner sc = new Scanner(new File("STRING.in"));

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            String s = sc.next();
            String x = sc.next();
            for(int i = 0; i < s.length()-x.length()+1; i++){
                
                if(s.substring(i,i+x.length()).equals(x)) System.out.print((i+1) + " ");
                
            }
            System.out.println();

        }

        sc.close();
    }

}

//2
//aaaaa
//aa
//abcde
//bc