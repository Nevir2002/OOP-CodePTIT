package TestPackage;

import java.util.Scanner;

public class J01005 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            int h = sc.nextInt();

            for(int i = 1; i < n; i++){

                System.out.print(String.format("%.6f",h*Math.sqrt((double)i/n)) + " ");

            }
            System.out.println();

        }

        sc.close();
    }

}