package TestPackage;

import java.util.Arrays;
import java.util.Scanner;

public class J02005 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[] a = new int[m];
        int[] c = new int[m];
        int[] b = new int[n];
        int[] d = new int[n];

        for(int i = 0; i < m; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        c[i++] = a[0];
        d[j++] = b[0];
        for(int x = 1; x < m; x++) if(a[x] != a[x-1]) c[i++] = a[x];
        for(int x = 1; x < n; x++) if(b[x] != b[x-1]) d[j++] = b[x];
        
        int it1 = 0, it2 = 0;
        while(it1 < i && it2 < j){
            
            if(c[it1] < d[it2]) it1++;
            else if(c[it1] > d[it2]) it2++;
            else{

                System.out.print(c[it1] + " ");
                it1++;
                it2++;

            }

        }

        sc.close();
    }

}