
package Vao_Ra_FILE;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class HELLOFILE {
    public static void main(String[] args)
    {
        File x = new File("Hello.txt");
        try{
            Scanner sc = new Scanner(x);
            while(sc.hasNext())
            {
                String t = sc.nextLine();
                System.out.println(t);
            }
                
        }catch(FileNotFoundException e)
        {
            
        }
            
    }
        
}
