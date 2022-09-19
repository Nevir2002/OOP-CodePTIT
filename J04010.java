package codeptit;

import java.util.*;

class Point{
    
    double x,y;
    
    Point(){
        
        x = y = 0;
        
    }
    
    Point(double a, double b){
        
        x = a;
        y = b;
        
    }
    
    Point(Point a){
        
         x = a.x;
         y = a.y;
        
    }
    
    public double getX(){
        
        return x;
        
    }
    
    public double getY(){
        
        return y;
        
    }
    
    public double distance(Point a){
        
        return Math.sqrt((x-a.x) * (x-a.x) + (y-a.y) * (y-a.y));
        
    }
    
    public double distance(Point a, Point b){
        
        return Math.sqrt((b.y-a.x) * (b.y-a.x) + (b.y-a.y) * (b.y-a.y));
        
    }
    
    public String toString(){
        
        return String.valueOf(this);
        
    }
    
    public String area(Point p1, Point p2, Point p3){
        
        double a,b,c;
        a = p1.distance(p2);
        b = p2.distance(p3);
        c = p1.distance(p3);   
        if(a+b <= c || c+b <= a || a+c <= b) return "INVALID";
        return String.valueOf(0.25*Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)));
        
    }
    
    public String outerRadius(Point p1, Point p2, Point p3){
        
        double a,b,c;
        a = p1.distance(p2);
        b = p2.distance(p3);
        c = p1.distance(p3);
        if(area(p1,p2,p3).equals("INVALID")) return "INVALID";
        double diameter = a*b*c/4/Double.parseDouble(area(p1,p2,p3));
        return String.format("%.3f",diameter*diameter*Math.PI);
        
    }
    
}

public class J04010 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){
            
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(new Point().outerRadius(p1, p2, p3));
            
        }

        sc.close();
    }

}