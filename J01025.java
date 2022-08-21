package TestPackage;

import java.util.Scanner;

public class J01025 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int a,b,c,d,e,f,g,h,x,y,u,v;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();

        x = Math.min(a,e);
        y = Math.min(b,f);
        u = Math.max(c,g);
        v = Math.max(d,h);
        // System.out.println(x + " " + y + " " + u + " " + v);

        int res = Math.max(Math.abs(u-x),Math.abs(v-y));
        System.out.println(res*res);

        sc.close();
    }

}