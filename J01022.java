package TestPackage;

import java.util.Scanner;

public class J01022 {
    
    public static void main(String arg[]){

        long[] fib = new long[93];
        fib[1] = fib[2] = 1;
        for(int i = 3; i < 93; i++) fib[i] = fib[i-2] + fib[i-1];

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- != 0){

            long n,k;
            n = sc.nextLong();
            k = sc.nextLong();
            
            while(true){

                // System.out.println(n + " " + k);
                if(n == 1){

                    System.out.println(0);
                    break;

                } else if(n == 2){

                    System.out.println(1);
                    break;

                } else{

                    if(k > fib[(int) (n-2)]){

                        k -= fib[(int) (n-2)];
                        n--;

                    } else n -= 2;

                }

            }

        }

        sc.close();
    }
    
}