package TestPackage;

import java.util.Scanner;

public class J01017 {

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

            if(s.charAt(i)-s.charAt(i+1) != 1 && s.charAt(i)-s.charAt(i+1) != -1) return false;

        }
        return true;

    }

}