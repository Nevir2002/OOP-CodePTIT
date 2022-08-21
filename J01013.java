package TestPackage;

import java.util.Scanner;

public class J01013 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long sum = 0;
        while(t-- != 0){

            int n = sc.nextInt();
            while(n%2 == 0){

                n /= 2;
                sum += 2;

            }
            for(int i = 3; i*i <= n; i+=2){
                
                while(n%i == 0){

                    n /= i;
                    sum += i;

                }

            }
            if(n > 2) sum += n;
            // System.out.println(sum);
        }
        System.out.println(sum);
        sc.close();
    }

}