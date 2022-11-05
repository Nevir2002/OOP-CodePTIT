package codeptit;

import java.util.*;

class Point04001{
    
    double x,y;
    
    Point04001(){
        
        x = y = 0;
        
    }
    
    Point04001(double a, double b){
        
        x = a;
        y = b;
        
    }
    
    Point04001(Point04001 a){
        
         x = a.x;
         y = a.y;
        
    }
    
    public double getX(){
        
        return x;
        
    }
    
    public double getY(){
        
        return y;
        
    }
    
    public double distance(Point04001 a){
        
        return Math.sqrt((x-a.x) * (x-a.x) + (y-a.y) * (y-a.y));
        
    }
    
    public double distance(Point04001 a, Point04001 b){
        
        return Math.sqrt((b.y-a.x) * (b.y-a.x) + (b.y-a.y) * (b.y-a.y));
        
    }
    
    public String toString(){
        
        return String.valueOf(this);
        
    }
    
}

public class J04001 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            Point04001 a = new Point04001(sc.nextDouble(), sc.nextDouble());
            Point04001 b = new Point04001(sc.nextDouble(), sc.nextDouble());
            
            System.out.println(String.format("%.4f",a.distance(b)));

        }

        sc.close();
    }

}