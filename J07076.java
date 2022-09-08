package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07076 {

    public static void main(String arg[]){

        try{
            
            Scanner sc = new Scanner(new File("MATRIX.in"));
            int t = sc.nextInt();
            for(int i = 0; i < t; i++){
                
                int m = sc.nextInt();
                int n = sc.nextInt();
                int k = sc.nextInt()-1;
                int[][] a = new int[m][n];
                Vector<Vector<Integer>> v = new Vector<Vector<Integer>>();
                for(int j = 0; j < n; j++) v.add(new Vector<Integer>());
                for(int j = 0; j < m; j++){
                    
                    for(int l = 0; l < n; l++) v.elementAt(l).add(sc.nextInt());
                    
                }
                Collections.sort(v.elementAt(k));
                
                for(int j = 0; j < m; j++){
                    
                    for(int l = 0; l < n; l++) System.out.print(v.elementAt(l).elementAt(j) + " ");
                    System.out.println("");
                    
                }
                
            }
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }
        
    }

}
//D:\D20\JunkyardJv\CodePTIT\src\DATA.in