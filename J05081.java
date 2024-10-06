
package Mang_Doi_Tuong;

import java.util.Scanner;
public class J05081 {
    static class DanhsachMatHang{
        String mmh,ten, dv;
        long mua,ban,loi;
        int cs;
        public void get(Scanner sc)
        {
            ten = sc.nextLine();
            dv = sc.nextLine();
            mua = sc.nextLong();
            ban = sc.nextLong();
            loi = ban-mua;
        }
    }
    static String mh(int i)
    {
        String s= Integer.toString(i);
        while(s.length()<3) s="0"+s;
        return "MH"+s;
    }
    static boolean cmp(DanhsachMatHang a,DanhsachMatHang b)
    {
        if(a.loi!=b.loi) return a.loi > b.loi;
        return a.cs < b.cs; 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        DanhsachMatHang[] a = new DanhsachMatHang[41];
        for(int i=0;i<t;i++)
        {
            sc.nextLine();
            DanhsachMatHang x = new DanhsachMatHang();
            x.get(sc);
            x.cs = i+1;
            x.mmh = mh(i+1);
            a[i] = x;
        }
        for(int i=0;i<t;i++)
        {
            for(int j=i+1;j<t;j++)
            {
                if(cmp(a[i],a[j])==false)
                {
                    DanhsachMatHang c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<t;i++)
        {
            System.out.printf("%s %s %s %d %d %d\n",a[i].mmh,a[i].ten,a[i].dv,a[i].mua,a[i].ban,a[i].loi);
        }
    }
}
