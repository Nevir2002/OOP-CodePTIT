package codeptit;

import java.util.*;

public class J04007 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("00001 ");
        for(int i = 0; i < 6; i++){
            
            String s = sc.nextLine();
            System.out.print(" " + s);
            
        }

        sc.close();
    }

}