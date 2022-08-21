package TestPackage;

import java.util.Scanner;

public class J01008 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int j = 1; j <= t; j++){

            System.out.print("Test " + j + ": ");
            int n = sc.nextInt();
            int cnt = 0;
            while(n%2 == 0){

                n /= 2;
                cnt++;

            }
            if(cnt > 0) System.out.print("2(" + cnt + ") ");
            int i = 1;
            while(n != 1){

                i += 2;
                cnt = 0;
                while(n%i == 0){

                    n /= i;
                    cnt++;

                }
                if(cnt > 0) System.out.print(i + "(" + cnt + ") ");

            }
            System.out.println();

        }

        sc.close();
    }

}