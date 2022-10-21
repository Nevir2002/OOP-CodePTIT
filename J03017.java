package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class Pair{
    
    char ft;
    int sc;

    public Pair(char ft, int sc) {
        this.ft = ft;
        this.sc = sc;
    }
    
}

public class J03017 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            String s = sc.next();
            int res = 0;
            ArrayList<Pair> arr = new ArrayList<>();
            arr.add(new Pair('#',-1));
            for(int i = 0; i < s.length(); i++){
                
                arr.add(new Pair(s.charAt(i), i));
                    
                while(arr.size() >= 3 && arr.get(arr.size()-3).ft == '1' && arr.get(arr.size()-2).ft == '0' && arr.get(arr.size()-1).ft == '0'){

                    arr.remove(arr.size()-1);
                    arr.remove(arr.size()-1);
                    arr.remove(arr.size()-1);

                }
                res = Math.max(res, i-arr.get(arr.size()-1).sc);
                    
            }
            System.out.println(res);

        }

        sc.close();
    }

}

//2
//010010
//1011110000