
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.*;
public class J04014 {
    static class PhanSo{
        long tu,mau;
        public void get(Scanner sc)
        {
            tu = sc.nextInt();
            mau = sc.nextInt();
        }       
    }
    static long ucln(long a,long b)
    {
        if(b==0) return a;
        return ucln(b,a%b);
    }
        
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        PhanSo a = new PhanSo(); a.get(sc);
        PhanSo b = new PhanSo(); b.get(sc);
        PhanSo c = new PhanSo();
        PhanSo d = new PhanSo();
        c.tu = a.tu*b.mau + b.tu*a.mau;
        c.mau = a.mau * b.mau;
        long x=ucln(c.tu,c.mau);
        c.tu/=x; c.tu*=c.tu;
        c.mau/=x; c.mau*=c.mau;
        d.tu = a.tu*b.tu;
        d.mau = a.mau*b.mau;
        d.tu*=c.tu;
        d.mau*=c.mau;
        long k=ucln(d.tu,d.mau);
        d.tu/=k;
        d.mau/=k;
        System.out.printf("%d/%d %d/%d\n",c.tu,c.mau,d.tu,d.mau);
        }
    }
        
}
