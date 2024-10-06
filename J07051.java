
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
import java.text.*;
public class J07051 {
    static long getTime(String s1,String s2) throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.parse(s2).getTime()-f.parse(s1).getTime();
    }
    static String ChuanHoa(String s){
        s = s.toLowerCase();
        String[] w = s.split("[' ']+");
        String ss="";
        for(int i=0;i<w.length;i++){
            if(w[i].length()==0) continue;
            ss += " " + w[i].substring(0,1).toUpperCase()+w[i].substring(1);
        }
        return ss;
    }
    static class KhachHang{
        String mkh,ten,phong;
        long ngay,gia;
        public KhachHang(int t,String a,String b,String c,String d,long f){
            ten = ChuanHoa(a);
            phong = b;
            mkh = "KH"+String.format("%02d", t);
            try{
               ngay= getTime(c,d)/(1000*60*60*24)%365 + 1;
            }catch(ParseException e){
                
            }
            if(b.charAt(0)=='1') gia=ngay*25+f;
            if(b.charAt(0)=='2') gia=ngay*34+f;
            if(b.charAt(0)=='3') gia=ngay*50+f;
            if(b.charAt(0)=='4') gia=ngay*80+f;
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        KhachHang[] a = new KhachHang[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            a[i] = new KhachHang(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLong());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i].gia<a[j].gia){
                    KhachHang c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %s %d %d\n",a[i].mkh,a[i].ten,a[i].phong,a[i].ngay,a[i].gia);
        }
    }
}
