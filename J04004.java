package codeptit;

import java.math.BigInteger;
import java.util.*;

class Fraction{
    
    private BigInteger numerator, denominator;
    
    Fraction(){}
    Fraction(String x, String y){
    
        BigInteger a = new BigInteger(x);
        BigInteger b = new BigInteger(y);
        BigInteger t = a.gcd(b);
        numerator = a.divide(t);
        denominator = b.divide(t);
        
    }
    
    public void plus(Fraction a){
        
        BigInteger x1 = numerator.multiply(a.denominator);
        BigInteger x2 = a.numerator.multiply(denominator);
        BigInteger x = x1.add(x2);
        BigInteger y = denominator.multiply(a.denominator);
        BigInteger t = x.gcd(y);
        x = x.divide(t);
        y = y.divide(t);
        System.out.println(x + "/" + y);
        
    }
    
    public void print(){
        
        System.out.println(numerator + "/" + denominator);
        
    }
    
}

public class J04004 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Fraction n1 = new Fraction(sc.next(), sc.next());
        Fraction n2 = new Fraction(sc.next(), sc.next());
//        n1.print();
//        n2.print();
        n1.plus(n2);

        sc.close();
    }

}