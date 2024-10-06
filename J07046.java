
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
import java.text.*;
public class J07046 {
    static long getTime(String s1,String s2) throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.parse(s2).getTime() - f.parse(s1).getTime();
    }
    static class Khach{
        String mkh,ten,mp;
        long ngay;
        public Khach(String a,String b, String c,String d){
            ten = a;
            mp = b;
            try{
                ngay = getTime(c, d) / (1000 * 60 * 60 * 24) % 365;
            }catch(ParseException e){
                
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Khach[] a = new Khach[n];
        for(int i=0;i<n;i++){
            a[i] = new Khach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a[i].mkh = "KH"+String.format("%02d",i+1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(a[i].ngay<a[j].ngay){
                    Khach c = a[i];
                    a[i] = a[j];
                    a[j] =c;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %s %d\n",a[i].mkh,a[i].ten,a[i].mp,a[i].ngay);
        }
    }
}
