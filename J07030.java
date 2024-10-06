
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07030 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        boolean[] f = new boolean[1000005];
        for(int i=2;i<f.length;i++) f[i]=true;
        for(int i=2;i<=Math.sqrt(f.length);i++){
            if(f[i]){
            for(int j=2;j<=1000000/i;j++){
                f[j*i]=false;
            }
            }
        }
        int n=1000000;
        FileInputStream d1 = new FileInputStream("DATA1.in");
        FileInputStream d2 = new FileInputStream("DATA2.in");
        ObjectInputStream ois = new ObjectInputStream(d1);
        ObjectInputStream oiss = new ObjectInputStream(d2);
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) oiss.readObject();
        TreeSet<Integer> t = new TreeSet<>(a);
        t.forEach(e->{
            if(f[e] && n-e>e && f[n-e]){
                if(!b.contains(n-e)&&!b.contains(e)&&a.contains(n-e)) System.out.println(e+" "+(n-e));
            }
        });
    }
}
    