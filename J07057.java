
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07057 {
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
        String name,Dantoc,ma;
        float diem;
        public ThiSinh(int t,String a,float b,String c,int d){
            name = chuanhoa(a);
            ma = String.format("TS%02d",t);
            diem = b;
            if(c.compareTo("Kinh")!=0) diem+=1.5;
            if(d==1) diem+=1.5;
            if(d==2) diem+=1;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        ThiSinh[] a = new ThiSinh[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String b =sc.nextLine();
            float c = sc.nextFloat();
            sc.nextLine();
            a[i] = new ThiSinh(i+1,b,c,sc.nextLine(),sc.nextInt());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].diem<a[j].diem){
                    ThiSinh c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %.1f ",a[i].ma,a[i].name,a[i].diem);
            if(a[i].diem>=20.5) System.out.printf("Do\n");
            else System.out.printf("Truot\n");
        }
    }
}
