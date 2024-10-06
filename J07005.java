
package Vao_Ra_FILE;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
public class J07005 {
    public static void main(String[] args)
    {
        File x = new File("DATA.IN");
        try{
            Scanner sc = new Scanner(x);
            HashMap<Integer,Integer> a = new HashMap<>();
            while(sc.hasNext())
            {
                int n = sc.nextInt();
                if(a.get(n)==null) a.put(n,1);
                else a.put(n,a.get(n)+1);
            }
            a.forEach((key,value)->{
                System.out.printf("%d %d\n",key,value);
            });
        }catch(FileNotFoundException e)
        {
            
        }
            
    }
        
}
