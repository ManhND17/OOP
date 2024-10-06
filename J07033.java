
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.*;
import java.io.*;
public class J07033 {
    static char up(char x){
        if(x>='a'&&x<='z') return (char)((int)x-32);
        return x;
    }
    static class Sinhvien{
        String msv,ten,lop,email;
        public Sinhvien(String a,String b,String c,String d)
        {
            msv=a;
            ten=ChuanHoa(b);
            lop=c;
            email=d;
        }
    }
    static String ChuanHoa(String s){
        s=s.toLowerCase();
        String[] w=s.split("[' ']+");
        String ss="";
        for(String x : w){
            if(x.length()==0) continue;
            String r = Character.toString(up(x.charAt(0)))+x.substring(1);
            ss+=r+" ";
        }
        return ss;
    }
    public static void main(String[] args) throws IOException{
        File x = new File("SINHVIEN.in");
        Scanner sc = new Scanner(x);
        int n = sc.nextInt();
        sc.nextLine();
        Sinhvien[] a = new Sinhvien[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a[i].ten=ChuanHoa(a[i].ten);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].msv.compareTo(a[j].msv)>0){
                    Sinhvien c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%s %s %s %s\n",a[i].msv,a[i].ten,a[i].lop,a[i].email);
        }
    }
}
