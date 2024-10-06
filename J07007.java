
package Vao_Ra_FILE;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
public class J07007 {
    public static void main(String[] args)
    {
        
        File x = new File("VANBAN.in");
        try{
            Scanner sc = new Scanner(x);
            HashSet<String> s = new HashSet<>();
            while(sc.hasNext())
            {
             String s1= sc.next();
             s.add(s1.toLowerCase());
            }
            for(String i : s)
            {
                System.out.println(i);
            }
                
        }catch(FileNotFoundException e)
        {
            
        }
        
    }
        
}
