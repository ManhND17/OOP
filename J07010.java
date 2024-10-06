
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07010 {
    static String msv(int n)
    {
        String s = Integer.toString(n);
        while(s.length()<3) s="0"+s;
        return "B20DCCN"+s;
    }
    static String day(String s)
    {
        String[] d = s.split("/");
        for(int i=0;i<=1;i++)
        {
            if(d[i].length()<2) d[i]="0"+d[i];
        }
        return d[0]+"/"+d[1]+"/"+d[2];
    }
        
    public static void main(String[] args) throws IOException
    {
        File x = new File("SV.in");
        Scanner sc = new Scanner(x);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
         sc.nextLine();
         System.out.printf("%s %s %s %s %.2f\n",msv(i),sc.nextLine(),sc.nextLine(),day(sc.next()),sc.nextFloat());   
        }
    }
}
