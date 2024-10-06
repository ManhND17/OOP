
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07056 {
    static String chuanhoa(String s){
        s = s.toLowerCase();
        String[] w = s.split("[' ']");
        String ss ="";
        for(String i : w){
            if(i.length()==0) continue;
            ss+= " "+ i.substring(0,1).toUpperCase()+ i.substring(1);
        }
        return ss;
    }
    static class KhachHang{
        String mkh,name;
        long tr,tv,tong;
        long vat;
        long dm;
        public KhachHang(int t,String a,String b,long c,long d){
            mkh = "KH"+String.format("%02d",t);
            name = chuanhoa(a);
            if(b.compareTo("A")==0) dm=100;
            if(b.compareTo("B")==0) dm=500;
            if(b.compareTo("C")==0) dm=200;
            if(d-c>dm) tr=dm*450;
            else tr=(d-c)*450;
            if(d-c>dm) tv=(d-c-dm)*1000;
            else tv=0;
            vat= (int)0.05*tv;
            tong = vat+tr+tv;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        KhachHang[]  a = new KhachHang[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new KhachHang(i+1,sc.nextLine(),sc.next(),sc.nextLong(),sc.nextLong());
        }
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].tong<a[j].tong){
                    KhachHang c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                    
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %d %d %d %d\n",a[i].mkh,a[i].name,a[i].tr,a[i].tv,a[i].vat,a[i].tong);
        }
    }
}
