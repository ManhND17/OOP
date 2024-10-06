
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07021 {
    static String ChuanHoa(String s)
    {
        String[] w = s.split("[' ']+");
        String r="";
        for(int i=0;i<w.length;i++)
        {
            if(w[i].length()==0) continue;
            String s1 = w[i].substring(0,1).toUpperCase()+w[i].substring(1);
            r+=s1+" ";
        }
        return r;
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        File x = new File("DATA.in");
        Scanner sc = new Scanner(x);
        while(sc.hasNext())
        {
            String s = sc.nextLine();
            if(s.equals("")) continue;
            if(s.compareTo("END")==0) break;
            System.out.println(ChuanHoa(s.toLowerCase()));
        }
            
    }
        
}
