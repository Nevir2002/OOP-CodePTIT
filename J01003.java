package TestPackage;

import java.util.Scanner;

public class J01003 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        float a,b;
        a = sc.nextFloat();
        b = sc.nextFloat();
        if(a == 0){

            if(b == 0) System.out.println("VSN");
            else System.out.println("VN");


        } else{

            System.out.println(String.format("%.2f", -b/a));

        } 

        sc.close();
    }

}