
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07050 {
    static class MatHang{
        String mmh,ten,nhom;
        float ban,mua;
        public MatHang(int t,String a,String b,float c,float d){
            mmh = "MH" + String.format("%02d",t);
            ten = a;
            nhom = b;
            mua = c;
            ban = d;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt(); 
        MatHang[] a = new MatHang[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new MatHang(i+1,sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].ban-a[i].mua<a[j].ban-a[j].mua)
                {
                    MatHang c = a[i];
                    a[i] =a[j];
                    a[j] =c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %s %.2f\n",a[i].mmh,a[i].ten,a[i].nhom,a[i].ban-a[i].mua);
        }
    }
}
