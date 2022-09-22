package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Fraction04014{
    
    long numerator,denominator;
    Fraction04014(){}
    Fraction04014(long a, long b){
        
        numerator = a;
        denominator = b;
        
    }
    
    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }
    
    private long gcd(long a, long b){
        
        if(b == 0) return a;
        return gcd(b,a%b);
        
    }
    
    private Fraction04014 clean(){
        
        long x = gcd(numerator,denominator);
        numerator /= x;
        denominator /= x;
        
        return this;
    }
    
    public static Fraction04014 plus(Fraction04014 a, Fraction04014 b){
        
        Fraction04014 res = new Fraction04014();
        res.setNumerator(a.getNumerator()*b.getDenominator() + b.getNumerator()*a.getDenominator());
        res.setDenominator(a.getDenominator()*b.getDenominator());
        
        return res.clean();
    }
    
    public static Fraction04014 multiply(Fraction04014 a, Fraction04014 b){
        
        return new Fraction04014(a.numerator*b.numerator,a.denominator*b.denominator).clean();
        
    }
    
    public static Fraction04014 multiply(Fraction04014 a, Fraction04014 b, Fraction04014 c){
        
        return new Fraction04014(a.numerator*b.numerator*c.numerator,a.denominator*b.denominator*c.denominator).clean();
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%d/%d", numerator, denominator);
        
    }
    
}

public class J04014 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            Fraction04014 a = new Fraction04014(sc.nextLong(),sc.nextLong());
            Fraction04014 b = new Fraction04014(sc.nextLong(),sc.nextLong());
            Fraction04014 x = Fraction04014.plus(a,b);
            Fraction04014 c = Fraction04014.multiply(x,x);
            Fraction04014 d = Fraction04014.multiply(a,b,c);
            System.out.println(String.format("%s %s",c,d));

        }

        sc.close();
    }

}