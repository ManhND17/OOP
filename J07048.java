
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07048 {
    static class SanPham{
        String msp,ten;
        long gia,bh;
        public SanPham(String a,String b,long c, long d){
            msp = a;
            ten = b;
            gia = c;
            bh = d;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        
        SanPham[] a = new SanPham[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new SanPham(sc.nextLine(),sc.nextLine(),sc.nextLong(),sc.nextLong());
            
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].gia < a[j].gia){
                    SanPham c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                if(a[i].gia == a[j].gia&&a[i].msp.compareTo(a[j].msp)>0){
                    SanPham c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %d %d\n",a[i].msp,a[i].ten,a[i].gia,a[i].bh);
        }
    }
}
