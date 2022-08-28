package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

public class J07003 {

    public static void main(String arg[]){

        try{
            
            File f = new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in");
            Scanner sc = new Scanner(f);
            String s = sc.next();
            while(s.length() > 1){
                
                int n = s.length();
                BigInteger n1 = new BigInteger(s.substring(0,Math.round(n/2)));
                BigInteger n2 = new BigInteger(s.substring(Math.round(n/2)));
//                System.out.println(n1);
//                System.out.println(n2);
                s = n1.add(n2).toString();
                System.out.println(s);
                
            }
            
            sc.close();
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }    

    }

}