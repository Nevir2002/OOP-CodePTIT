package codeptit;

import java.io.*;
import java.util.*;

//@author Nevir2002

class P{
    
    int x,y,step;

    public P(String input) {
        
        step = 0;
        x = input.charAt(0) - 'a' + 1;
        y = input.charAt(1) - '0';
        
    }
    public P(int x, int y, int step) {
        
        this.x = x;
        this.y = y;
        this.step = step;
        
    }

    public boolean equals(P a){
        
        return x == a.x && y == a.y;
        
    }
    
}

public class J08029 {
    
    static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    static int[] dy = {-1,1,-2,2,2,-2,1,-1};
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            
            boolean[][] vis  = new boolean[9][9];
            for(boolean[] x:vis) Arrays.fill(x, false);
            String[] s = sc.nextLine().split(" ");
            ArrayList<String> arr = new ArrayList<>();
            for(String x:s) if(x.length() > 0) arr.add(x);
            P a = new P(arr.get(0));
            P res = new P(arr.get(1));
            Queue<P> q = new LinkedList<>();
            q.add(a);
            while(!q.isEmpty()){
                
                P p = q.poll();
//                System.out.println(p.x + " " + p.y + " " + p.step);
                if(p.equals(res)){
                    
                    System.out.println(p.step);
                    break;
                    
                }
                int x = p.x;
                int y = p.y;
                int step = p.step;
                vis[x][y] = true;
                for(int i = 0; i < 8; i++){
                    
                    int px = x + dx[i];
                    int py = y + dy[i];
                    if(px >= 1 && px <= 8 && py >= 1 && py <= 8 && !vis[px][py]) q.add(new P(px,py,step+1));
                    
                }
                
            }
            
        }
        
        sc.close(); 
    }
    
}

//8
//e2 e4
//a1 b2
//b2 c3
//a1 h8
//a1 h7
//h8 a1
//b1 c3
//f6 f6