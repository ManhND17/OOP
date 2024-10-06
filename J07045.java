
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07045 {
    static class LoaiPhong implements Comparable<LoaiPhong>{
        String loai,ten;
        public LoaiPhong(String s){
            loai = s;
            String[] w = s.split("[' ']+");
            ten="";
            for(int i=0;i<=1;i++){
                ten = w[i]+ " "+ ten;
            }
        }
        public String toString(){
            return loai;
        }
        public int compareTo(LoaiPhong o) {
            return ten.compareTo(o.ten);
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}