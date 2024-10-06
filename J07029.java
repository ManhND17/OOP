
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07029 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean[] f = new boolean[1000005];
        for(int i=2;i<f.length;i++) f[i]=true;
        for(int i=2;i<=Math.sqrt(f.length);i++){
            if(f[i]){
            for(int j=2;j<=1000000/i;j++){
                f[j*i]=false;
            }
            }
        }
        FileInputStream y = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(y);
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        a.forEach(x->{
            if(f[x]){
                if(hm.get(x)==null) hm.put(x, 1);
                else hm.put(x,hm.get(x)+1);
            }
        });
        int dem=0;
        for(int i=1000000;i>=1;i--){
            if(hm.get(i)!=null){
                dem++;
                System.out.println(i+" "+hm.get(i));
            }
            if(dem==10) break;
        }
    }
}
