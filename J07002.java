
package Vao_Ra_FILE;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J07002 {
    public static void main(String[] args)
    {
         File x = new File("DATA.in");
        try{
            long s = 0;
            Scanner sc = new Scanner(x);
            while(sc.hasNext()){
                try{
                    String t = sc.next();
                    s += Integer.parseInt(t);
                }catch(NumberFormatException e){

                }System.out.println(s);
            }
            System.out.println(s);
        }catch(FileNotFoundException e){

        }
    }       
}
