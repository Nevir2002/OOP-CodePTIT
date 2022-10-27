package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J03035 {

    public static void main(String[] args) throws Exception{

        int t;
        Scanner sc;
        sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();
            int n = a.length;
            int[] cnt = new int[n];
            Arrays.fill(cnt, 0);
            long res = 0;
            for(int i = n-2; i >= 0; i--) cnt[i] = cnt[i+1] + (a[i+1]=='?'?1:0);
//            for(int i = 0; i < n; i++) System.out.print(cnt[i] + " ");
//            System.out.println();
            for(int i = 0; i < n; i++){
                
                if(a[i] == '?') res += ('9' - b[i])*(Math.pow(10, cnt[i]));
                else if(a[i] > b[i]){
                    
                    res += Math.pow(10, cnt[i]);
                    break;
                    
                } else if(a[i] < b[i]) break;
//                System.out.println(i + " " + res);
                
            }
            System.out.println(res);

        }

    }

}

//3
//36?1?8
//236428
//8?3
//910
//?
//5