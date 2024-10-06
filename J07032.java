package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07032 {
    static boolean STN(Integer a){
        String s = a.toString();
        if(s.length()%2==0||s.length()==1) return false;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        if(s.length() % 2 == 1 && s.length() > 1){
            for(int i=0; i<s.length(); i++){
                int u = s.charAt(i) - '0';
                if(u%2==0) return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream x =new ObjectInputStream (new FileInputStream("DATA1.in"));
        ObjectInputStream y = new ObjectInputStream (new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) x.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) y.readObject();
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        a.forEach(e->{
            if(STN(e)&&b.contains(e)){
                if(hm.get(e)==null) hm.put(e,1);
                else hm.put(e, hm.get(e)+1);
            }
        });
        b.forEach(e->{
            if(STN(e)&&a.contains(e)){
                if(hm.get(e)==null) hm.put(e,1);
                else hm.put(e, hm.get(e)+1);
            }
        });
        int dem=0;
        for(int i=1;i<=1000000;i++){
            if(hm.get(i)!=null){
                System.out.println(i+" "+hm.get(i));
                dem++;
            }
            if(dem==10) break;
        }
    }
}