package TestPackage;

import java.util.Scanner;

public class J01012 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            int res = 0;
            for(int i = 1; i*i <= n; i++){

                if(n%i == 0){

                    if(i%2 == 0) res++;
                    if(n/i != i && (n/i)%2 == 0) res++;

                }

            }
            System.out.println(res);

        }

        sc.close();
    }

}