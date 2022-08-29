    package codeptit;

    import java.util.*;

    class NV{

        String id, name, pos;
        int wage,bonus,cnt,tmp;

        NV(String a, String b, String c, int d, int e){

            id = a;
            name = b;
            pos = c;
            wage = d*e;
            cnt = e;
            if(pos.equals("GD")) bonus = 500;
            else if(pos.equals("PGD")) bonus = 400;
            else if(pos.equals("TP")) bonus = 300;
            else if(pos.equals("KT")) bonus = 250;
            else bonus = 100;
            float x = ((float)wage+bonus)*2/3;
            tmp = Math.min(Math.round(x/1000)*1000,25000);

        }

        public void print(){

            int remain = bonus + wage - tmp;
            System.out.println(id + " " + name + " " + bonus + " " + wage + " " + tmp + " " + remain);

        }

    }

    public class J05043 {

        public static void main(String arg[]){

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < t; i++){

                String s = String.valueOf(i+1);
                if(s.length() < 2) s = '0' + s;
                s = "NV" + s;
                NV x = new NV(s,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
                x.print();

            }

            sc.close();
        }

    }
    //4
    //Tran Thi Yen
    //NV
    //1000
    //24
    //Nguyen Van Thanh
    //BV
    //1000
    //30
    //Doan Truong An
    //TP
    //3000
    //25
    //Le Thanh
    //GD
    //5000
    //28