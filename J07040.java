
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        ArrayList<String> b = new ArrayList<>();
        a.forEach(s->{
            String[] w = s.split("[' ']+");
            for(String x:w){
                x = x.toLowerCase();
                if(!b.contains(x)) b.add(x);
            }
        });
        ArrayList<String> doc = new ArrayList<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(!doc.contains(s)) doc.add(s);
        }
        doc.forEach(e -> {
            if(b.contains(e)) System.out.println(e);
        });
    }

}
