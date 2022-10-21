package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Matrix{
    
    int x,y;
    int[][] arr;

    public Matrix() {
    }

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Matrix(int x, int y, int[][] arr) {
        this.x = x;
        this.y = y;
        this.arr = arr;
    }
    
    public void nextMatrix(Scanner sc){
        
        arr = new int[x][y];
        for(int i = 0; i < x; i++){
            
            for(int j = 0; j < y; j++) arr[i][j] = sc.nextInt();
            
        }
        
    }
    
    public Matrix trans(){
        
        int resX = y, resY = x;
        int[][] res = new int[resX][resY];
        for(int i = 0; i < resX; i++){
            
            for(int j = 0; j < resY; j++) res[i][j] = arr[j][i];
            
        }
        
        return new Matrix(resX,resY,res);
    }
    
    public Matrix mul(Matrix a){
        
        int resX = x, resY = a.y;
        int[][] res = new int[resX][resY];
        for(int i = 0; i < resX; i++){
            
            for(int j = 0; j < resY; j++){
                
                int tmp = 0;
                for(int k = 0; k < this.y; k++) tmp += this.arr[i][k]*a.arr[k][j];
                res[i][j] = tmp;
                
            }
            
        }
        
        return new Matrix(resX,resY,res);
    }
    
    @Override
    public String toString(){
        
        String res = "";
        for(int i = 0; i < x; i++){
            
            for(int j = 0; j < y; j++) res += arr[i][j] + " ";
            if(i < x-1) res += System.lineSeparator();
                
        }
        
        return res;
    }
    
}

public class J04017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }

}

//1
//2  2
//1  2
//3  4