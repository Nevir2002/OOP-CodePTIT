package TestPackage;

import java.util.Scanner;

public class J01016 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == '4' || str.charAt(i) == '7') cnt++;

        }
        if(cnt == 4 || cnt == 7) System.out.println("YES"); else System.out.println("NO");

        sc.close();
    }

}