package TestPackage;

import java.util.Scanner;

public class J01024 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            String s = sc.next();
            System.out.println(check(s));

        }

        sc.close();
    }

    public static String check(String s) {

        for(int i = 0; i < s.length(); i++) if(s.charAt(i) >= '3') return "NO";
        return "YES";
    }

}