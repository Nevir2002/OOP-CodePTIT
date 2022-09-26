    package codeptit;

    import java.io.*;
    import java.util.*;

    //@author Nevir2002

    class TT5035 implements Comparator<TT5035>{

        int idx;
        String id,name,cls,email,corp;
        static int index = 1;

        public TT5035() {
        }

        public TT5035(String id, String name, String cls, String email, String corp) {
            this.idx = index++;
            this.id = id;
            this.name = name;
            this.cls = cls;
            this.email = email;
            this.corp = corp;
        }

        @Override
        public int compare(TT5035 a, TT5035 b){

            return a.id.compareTo(b.id);

        }

        public void print(){

            System.out.println(String.format("%d %s %s %s %s %s", idx,id,name,cls,email,corp));

        }

    }

    public class J05035 {

        public static void main(String arg[]){

            Scanner sc = new Scanner(System.in);

            int t = Integer.parseInt(sc.nextLine());
            Vector<TT5035> v = new Vector<>();

            while(t-->0){

                v.add(new TT5035(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

            }
            Collections.sort(v, new TT5035());
            t = Integer.parseInt(sc.nextLine());
            while(t-->0){

                String s = sc.nextLine();
                for(TT5035 x:v) if(x.corp.equals(s)) x.print();

            }

            sc.close();
        }

    }
    //6
    //B17DCCN016 
    //Le Khac Tuan Anh 
    //D17HTTT2   
    //test1@stu.ptit.edu.vn
    //VIETTEL
    //B17DCCN107 
    //Dao Thanh Dat    
    //D17CNPM5   
    //test2@stu.ptit.edu.vn
    //FPT
    //B17DCAT092 
    //Cao Danh Huy     
    //D17CQAT04-B
    //test3@stu.ptit.edu.vn
    //FPT
    //B17DCCN388 
    //Cao Sy Hai Long  
    //D17CNPM2   
    //test4@stu.ptit.edu.vn
    //VNPT
    //B17DCCN461 
    //Dinh Quang Nghia 
    //D17CNPM2   
    //test5@stu.ptit.edu.vn
    //FPT
    //B17DCCN554 
    //Bui Xuan Thai    
    //D17CNPM1   
    //test6@stu.ptit.edu.vn
    //GAMELOFT
    //1
    //FPT