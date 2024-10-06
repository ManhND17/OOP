package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07053 {
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
    static int tuoi(String s){
        String[] w = s.split("/");
        int t=0;
        for(int i=0;i<4;i++){
            t  = t*10+(w[2].charAt(i)-'0');
        }
        return 2021-t;
    }
    static class XetTuyen{
        String name,ma;
        int diem;
        double lt, th, plus;
        int tuoi;
        String loai;
        public XetTuyen(int t,String a,String b,float c,float d){
            ma = "PH"+String.format("%02d", t);
            name = chuanhoa(a);
            tuoi = tuoi(b);
            lt = c;
            th = d;
            if(c >= 8 && d >= 8) plus = 1;
            else if(c >= 7.5 && d >= 7.5) plus = 0.5;
            else plus = 0;
            diem = (int)(Math.round((lt + th) / 2 + plus));
            if(diem>10) diem =10;
            if(diem>=9) loai="Xuat sac";
            else if(diem>=8) loai ="Gioi";
            else if(diem>=7) loai ="Kha";
            else if(diem>=5) loai = "Trung binh";
            else loai ="Truot";
            
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        XetTuyen[] a = new XetTuyen[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new XetTuyen(i+1,sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat());
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %d %d %s\n",a[i].ma,a[i].name,a[i].tuoi,a[i].diem,a[i].loai);
            
        }
    }
}
