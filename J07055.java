
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07055 {
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
    static class BangDiem{
        String msv,name,loai;
        double diem;
        public BangDiem(int t,String a,float b,float c,float d){
            msv = "SV"+String.format("%02d",t);
            name = chuanhoa(a);
            diem = (b*0.25+c*0.35+d*0.4);
            if(diem>=8) loai="GIOI";
            else if(diem>=6.5) loai="KHA";
            else if(diem>=5) loai="TRUNG BINH";
            else loai="KEM";
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        BangDiem[] a = new BangDiem[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new BangDiem(i+1,sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].diem<a[j].diem){
                    BangDiem c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                if(a[i].diem==a[j].diem && a[i].msv.compareTo(a[i].msv)>0){
                    BangDiem c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %.2f %s\n",a[i].msv,a[i].name,a[i].diem,a[i].loai); 
        }
    }
}
