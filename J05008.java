package codeptit;

import java.util.*;

class Point05008{
    
    double x,y;
    
    Point05008(){
        
        x = y = 0;
        
    }
    
    Point05008(double a, double b){
        
        x = a;
        y = b;
        
    }
    
    Point05008(Point05008 a){
        
         x = a.x;
         y = a.y;
        
    }
    
    public double getX(){
        
        return x;
        
    }
    
    public double getY(){
        
        return y;
        
    }
    
    public double distance(Point05008 a){
        
        return Math.sqrt((x-a.x) * (x-a.x) + (y-a.y) * (y-a.y));
        
    }
    
    public double distance(Point05008 a, Point05008 b){
        
        return Math.sqrt((b.y-a.x) * (b.y-a.x) + (b.y-a.y) * (b.y-a.y));
        
    }
    
    public String toString(){
        
        return String.valueOf(this);
        
    }
    
    public static double getArea(Point05008[] arr, int n){
        
        double res = 0;
        for(int i = 0; i < n; i++){
            
            res += arr[i].x*arr[(i+1)%n].y;
            
        }
        for(int i = 0; i < n; i++){
            
            res -= arr[i].y*arr[(i+1)%n].x;
            
        }
        
        return res/2;
    }
    
}

public class J05008 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n = sc.nextInt();
            Point05008[] arr = new Point05008[n];
            for(int i = 0; i < n; i++) arr[i] = new Point05008(sc.nextInt(),sc.nextInt());
            System.out.println(String.format("%.3f",Point05008.getArea(arr, n)));
            
        }

        sc.close();
    }

}

//2
//3
//0 0
//1 0
//0 1
//4
//0 0
//2 0
//2 2
//0 2