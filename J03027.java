package codeptit;

import java.util.*;

public class J03027 {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
            
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){

            if(st.empty() || st.peek() != s.charAt(i)) st.add(s.charAt(i));
            else st.pop();
                
        }
        
        if(st.empty()){
            
            System.out.println("Empty String");
            
        }else{
            
            Iterator it = st.iterator();
            while(it.hasNext()) System.out.print(it.next());
            System.out.println();
            
        }

        sc.close();
    }

}