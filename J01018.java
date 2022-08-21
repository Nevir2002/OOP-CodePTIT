package TestPackage;

import java.util.Scanner;

public class J01018 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- != 0){

            String str = sc.next();
            if(check(str)) System.out.println("YES"); else System.out.println("NO");

        }

        sc.close();
    }

    public static boolean check(String s) {
        
        for(int i = 0; i < s.length()-1; i++){

            if(s.charAt(i)-s.charAt(i+1) != 2 && s.charAt(i)-s.charAt(i+1) != -2) return false;

        }
        int sum = 0;
        for(int i = 0; i < s.length(); i++){

            sum += s.charAt(i) - '0';

        }
        if(sum%10 != 0) return false;
        return true;

    }

}