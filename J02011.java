package codeptit;

import java.util.Scanner;

public class J02011 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n-1; i++){ // Interchange sort
            
            int min = i;
            for(int j = i+1; j < n; j++) if(a[j] < a[min]) min = j;
            
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;

            System.out.print("Buoc " + (i+1) + ": ");
            for(int x:a) System.out.print(x + " ");
            System.out.println();

        }

        sc.close();
    }

}