package codeptit;

import java.util.*;

class Rec{
    
    int length,width;
    String color;
    
    Rec(int a, int b, String c){
        
        length = a;
        width = b;
        color = c;
        
    }
    
    public void process(){
        
        if(length <= 0 || width <= 0) System.out.println("INVALID");
        else{
            
            color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
            System.out.println(perimeter() + " " + area() + " " + color);
            
        }
        
    }
    
    public int perimeter(){
        
        return (length+width)*2;
        
    }
    
    public int area(){
        
        return length*width;
        
    }
    
}

public class J04002 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        Rec r = new Rec(sc.nextInt(), sc.nextInt(), sc.next());
        r.process() ;

        sc.close();
    }

}