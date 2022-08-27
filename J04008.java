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
    
}

public class J04008 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = a.distance(c);
            if(ab+bc <= ac || ab+ac <= bc || bc+ac <= ab) System.out.println("INVALID");
            else System.out.println(String.format("%.3f", ab+bc+ac));

        }

        sc.close();
    }

}