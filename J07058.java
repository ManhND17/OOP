
package Khai_Bao_Lop_vaDoi_Tuong;
import java.util.*;
import java.io.*;
public class J07058 {
    static class DSMonThi{
        String msv,ten,thi;
        public void get(Scanner sc)
        {
            msv = sc.nextLine();
            ten = sc.nextLine();
            thi = sc.nextLine();
        }
    }
    public static void main(String[] args) throws IOException
    {
        File x = new File("MONHOC.in");
        Scanner sc = new Scanner(x);
        int n = sc.nextInt();
        sc.nextLine();
        DSMonThi[] a = new DSMonThi[n];
        for(int i=0;i<n;i++)
        {
            DSMonThi c = new DSMonThi();
            c.get(sc);
            a[i]=c;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].msv.compareTo(a[j].msv)>0){
                    DSMonThi c =a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%s %s %s\n",a[i].msv,a[i].ten,a[i].thi);
        }
            
    }
        
}
