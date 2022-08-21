package TestPackage;

import java.util.Scanner;

public class J01010 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            String str = sc.next();
            System.out.println(transform(str));

        }

        sc.close();
    }

    private static String transform(String str) {

        String res = "";
        boolean check = false;
        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '0' || str.charAt(i) == '8' || str.charAt(i) == '9'){
                
                if(res.length() > 0) res += '0';
                
            } 
            else if(str.charAt(i) == '1') res += '1';
            else check = true;
    
        }
        if(check || res.length() == 0) res = "INVALID";

        return res;
    }

}