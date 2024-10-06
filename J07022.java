
package Vao_Ra_FILE;
import java.util.*;
import java.io.*;
public class J07022 {
    public static void main(String[] args) throws IOException
    {
        File x = new File("D:/DATA.in");
        Scanner sc = new Scanner(x);
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext())
        {
            String s = sc.next();
            try{
                int t = Integer.parseInt(s);
            } catch(NumberFormatException e){
                a.add(s);
            }
        }
        a.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });
        a.forEach(s -> System.out.print(s+" "));
    }
}
