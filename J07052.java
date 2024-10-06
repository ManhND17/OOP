
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07052 {
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
    static class ThiSinh{
        String mts,name;
        double diem;
        double ut;
        public ThiSinh(String a,String b,float c,float d,float e){
            mts = a;
            name = chuanhoa(b);
            String s = a.substring(0,3);
            if(s.compareTo("KV3")==0) ut=2.5;
            if(s.compareTo("KV2")==0) ut=1;
            if(s.compareTo("KV1")==0) ut=0.5;
            diem = c*2+d+e+ut;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/THISINH.in"));
        int n = sc.nextInt();
        ThiSinh[] a = new ThiSinh[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        }
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].diem<a[j].diem){
                    ThiSinh c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                if(a[i].diem==a[j].diem&&a[i].mts.compareTo(a[j].mts)>0){
                    ThiSinh c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        System.out.printf("%.1f\n",a[k-1].diem);
        for(int i=0;i<n;i++){
            System.out.printf("%s %s ",a[i].mts,a[i].name);
            if(a[i].ut == (int)a[i].ut) System.out.printf("%.0f ",a[i].ut);
            else System.out.printf("%.1f ",a[i].ut);
            if(a[i].diem == (int)a[i].diem) System.out.printf("%.0f ",a[i].diem);
            else System.out.printf("%.1f ",a[i].diem);
            if(a[i].diem>=a[k-1].diem) System.out.print("TRUNG TUYEN\n");
            else System.out.print("TRUOT\n");
        }
    }
}
