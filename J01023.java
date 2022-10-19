package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002



public class J01023 {
    
    static boolean check = false;
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            check = false;
            String s = sc.nextLine();
            int cnt = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < s.length(); i++){
                
                if(s.charAt(i) == '?' && i!=3) cnt++;
                
            }
            attempt(0, arr, cnt, s);
            if(!check) System.out.println("WRONG PROBLEM!");

        }

        sc.close();
    }

    private static void attempt(int x, ArrayList<Integer> arr, int cnt, String s){
        
        if(check) return;
        for(int j = 0; j < 10; j++){
            
            arr.add(j);
            if(x == cnt){
                
                int idx = 0;
                char[] str = s.toCharArray();
                for(int i = 0; i < s.length(); i++){
                    
                    if(i != 3 && str[i] == '?') str[i] = (char)(arr.get(idx++)+'0');
                    
                }
                if(str[0] != '0' && str[5] != '0' && str[10] != '0'){
                    
                    int a = (str[0]-'0')*10 + str[1]-'0';
                    int b = (str[5]-'0')*10 + str[6]-'0';
                    int c = (str[10]-'0')*10 + str[11]-'0';
                    if(str[3] == '+'){
                        
                        if(a+b==c){
                            
                            for(int k = 0; k < 12; k++){
                                
                                System.out.print(str[k]);
                                
                            }
                            System.out.println();
                            check = true;
                            return;
                            
                        }
                        
                    }
                    if(str[3] == '-'){
                        
                        if(a-b==c){
                            
                            for(int k = 0; k < 12; k++){
                                
                                System.out.print(str[k]);
                                
                            }
                            System.out.println();
                            check = true;
                            return;
                            
                        }
                        
                    }
                    if(str[3] == '?'){
                        
                        if(a+b==c){
                            
                            str[3] = '+';
                            for(int k = 0; k < 12; k++){
                                
                                System.out.print(str[k]);
                                
                            }
                            System.out.println();
                            check = true;
                            return;
                            
                        }
                        if(a-b==c){
                            
                            str[3] = '-';
                            for(int k = 0; k < 12; k++){
                                
                                System.out.print(str[k]);
                                
                            }
                            System.out.println();
                            check = true;
                            return;
                            
                        }
                        
                    }
                    
                }
                
            }
            if(x < cnt) attempt(x+1,arr, cnt, s);
            arr.remove(arr.size()-1);
            
        }
        
    }
    
}

//2
//?0 ? 12 = 28
//40 / ?3 = ??
//012345678901