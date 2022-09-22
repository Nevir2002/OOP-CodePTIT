package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class ComplexNum{
    
    long real,imaginary;

    public ComplexNum() {
    }

    public ComplexNum(long real, long imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public long getReal() {
        return real;
    }

    public void setReal(long real) {
        this.real = real;
    }

    public long getImaginary() {
        return imaginary;
    }

    public void setImaginary(long imaginary) {
        this.imaginary = imaginary;
    }
    
    public static ComplexNum plus(ComplexNum a, ComplexNum b){
        
        return new ComplexNum(a.getReal()+b.getReal(),a.getImaginary()+b.getImaginary());
        
    }
    
    public static ComplexNum multiply(ComplexNum a, ComplexNum b){
        
        return new ComplexNum(a.getReal()*b.getReal()-a.getImaginary()*b.getImaginary(),a.getReal()*b.getImaginary()+a.getImaginary()*b.getReal());
        
    }
    
    @Override
    public String toString(){
        
//        if(real != 0){
//            
//            if(imaginary > 0) return String.format("%d + %di",real,imaginary);
//            else if (imaginary < 0) return String.format("%d - %di",real,0-imaginary);
//            else return String.valueOf(real);
//            
//        } else if(imaginary != 0) return String.format("%di",imaginary);
//        return "0";
        if(imaginary < 0) return String.format("%d - %di",real,0-imaginary);
        return String.format("%d + %di",real,imaginary);

    }
    
}

public class J04018 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = Integer.valueOf(sc.nextLine());

        while(t-- != 0){

            ComplexNum a = new ComplexNum(sc.nextLong(),sc.nextLong());
            ComplexNum b = new ComplexNum(sc.nextLong(),sc.nextLong());
            ComplexNum x = ComplexNum.plus(a,b);
            ComplexNum c = ComplexNum.multiply(x, a);
            ComplexNum d = ComplexNum.multiply(x, x);
            System.out.println(c + ", " + d);

        }

        sc.close();
    }

}