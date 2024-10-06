
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07037 {
    static class DN{
        String ma,ten,so;
        public DN(String a,String b,String c)
        {
            ma = a;
            ten = b;
            so = c;
        }
        public boolean big(DN x)
        {
            if(ma.compareTo(x.ma)>0) return true;
            return false;
        }
        public String toString()
        {
            return ma +" " + ten +" "+so;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/DN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        DN[] a = new DN[n];
        for(int i=0;i<n;i++)
        {
            a[i] = new DN(sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        DN tmp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].big(a[j]))
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }     
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
