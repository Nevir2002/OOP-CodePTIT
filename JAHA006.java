package codeptit;

import java.util.*;

class PointJAHA006{
    
    double x,y;
    
    PointJAHA006(){
        
        x = y = 0;
        
    }
    
    PointJAHA006(double a, double b){
        
        x = a;
        y = b;
        
    }
    
    PointJAHA006(PointJAHA006 a){
        
         x = a.x;
         y = a.y;
        
    }
    
    public double getX(){
        
        return x;
        
    }
    
    public double getY(){
        
        return y;
        
    }
    
    public double distance(PointJAHA006 a){
        
        return Math.sqrt((x-a.x) * (x-a.x) + (y-a.y) * (y-a.y));
        
    }
    
    public double distance(PointJAHA006 a, PointJAHA006 b){
        
        return Math.sqrt((b.y-a.x) * (b.y-a.x) + (b.y-a.y) * (b.y-a.y));
        
    }
    
    public String toString(){
        
        return String.valueOf(this);
        
    }
    
    public String area(PointJAHA006 p1, PointJAHA006 p2, PointJAHA006 p3){
        
        double a,b,c;
        a = p1.distance(p2);
        b = p2.distance(p3);
        c = p1.distance(p3);   
        if(a+b <= c || c+b <= a || a+c <= b) return "INVALID";
        return (String.format("%.4f",0.25*Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c))));
        
    }
    
}

public class JAHA006 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){
            
            PointJAHA006 p1 = new PointJAHA006(sc.nextDouble(), sc.nextDouble());
            PointJAHA006 p2 = new PointJAHA006(sc.nextDouble(), sc.nextDouble());
            PointJAHA006 p3 = new PointJAHA006(sc.nextDouble(), sc.nextDouble());
            System.out.println(new PointJAHA006().area(p1, p2, p3));
            
        }

        sc.close();
    }

}

//3
//0 0 0 5 0 199
//1 1 1 1 1 1
//0 0 0 5 5 0