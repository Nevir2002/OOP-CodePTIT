package TestPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {

    public static void main(String arg[]){

        try{

            File f = new File("Hello.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){

                String str = sc.nextLine();
                System.out.println(str);

            }
            sc.close();

        } catch(FileNotFoundException e){

            

        }

    }

}