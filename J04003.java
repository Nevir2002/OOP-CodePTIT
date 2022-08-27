package codeptit;

import java.math.BigInteger;
import java.util.*;

class Fraction{
    
    private long numerator, denominator;
    
    Fraction(long a, long b){
        
        numerator = a;
        denominator = b;
        
    }
    
    public void process(){
        
        BigInteger a = new BigInteger(String.valueOf(numerator));
        BigInteger b = new BigInteger(String.valueOf(denominator));
        BigInteger t = a.gcd(b);
        System.out.println(a.divide(t) + "/" + b.divide(t));
        
    }
    
}

public class J04003 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Fraction r = new Fraction(sc.nextLong(), sc.nextLong());
        r.process() ;

        sc.close();
    }

}