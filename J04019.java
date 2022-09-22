package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Point{
    
    double x,y;
    Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        
        return new Point(sc.nextFloat(),sc.nextFloat());
        
    }
    
    public double dist(Point a, Point b){
        
        return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
        
    }
    
}

class Triangle extends Point{
    
    Point a,b,c;
    Triangle(){}

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        
        return !(dist(a,b)+dist(b,c)<=dist(a,c) || dist(a,c)+dist(b,c)<=dist(a,b) || dist(a,b)+dist(a,c)<=dist(b,c));
        
    }
    
    public String getPerimeter(){
        
        return String.format("%.3f", dist(a,b)+dist(b,c)+dist(a,c));
        
    }
    
}

public class J04019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }

}