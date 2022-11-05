package codeptit;

import java.io.File;
import java.io.IOException;
import java.util.*;

class Pair07017<T,S>{
    
    T n1;
    S n2;
    String s;
    Pair07017(T t1, S t2){
        
        n1 = t1;
        n2 = t2;
        s = String.valueOf(n1) + " " + String.valueOf(n2);
        
    }
    
    public String toString(){
        
        return s;
        
    }
    
    public boolean primeCheck(int n){
        
        if (n < 2) return false;
        if (n == 2) return true;
        if(n%2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {

            if (n % i == 0) {
                return false;
            }

        }
        return true;
        
    }
    
    public boolean isPrime() {

        return primeCheck(Integer.parseInt(String.valueOf(n1))) && primeCheck(Integer.parseInt(String.valueOf(n2)));

    }
    
}

public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\D20\\JunkyardJv\\CodePTIT\\src\\DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair07017<Integer, Integer> p = new Pair07017<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }

}