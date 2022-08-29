package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
    import java.util.*;

    public class J07021 {

        public static void main(String arg[]){

            try{
                
                Scanner sc = new Scanner(new File("DATA.in"));
                while(true){
                    
                    String[] s = sc.nextLine().toLowerCase().split(" ");
                    if(s.length == 1 && s[0].equals("end")) break;
                    for(String x:s) if(x.length() > 0) System.out.print(title(x) + " ");
                    System.out.println();
                    
                }
                sc.close();
                
            }catch(FileNotFoundException e){
                
                System.out.println(e);
                
            }
            
        }
        
        public static String title(String x){
            
            return x.substring(0,1).toUpperCase() + x.substring(1);
            
        }

    }