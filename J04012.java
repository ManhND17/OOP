
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.*;
public class J04012 {
    static class Nhanvien{
        String msv,ten,cv;
        long lcb,snc;
        public void get(Scanner sc)
        {
            msv ="NV01";
            ten = sc.nextLine();
            lcb = sc.nextLong();
            snc = sc.nextLong();
            sc.nextLine();
            cv = sc.nextLine();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Nhanvien a = new Nhanvien();
        a.get(sc);
        long luong = a.snc*a.lcb;
        long thuong = 0;
        long pc = 0;
        if(a.snc>=25) thuong=(long)(luong*0.2);
        else if(a.snc>=22) thuong=(long)(luong*0.1);
        if(a.cv.compareTo("GD")==0) pc=250000;
        if(a.cv.compareTo("PGD")==0) pc=200000;
        if(a.cv.compareTo("TP")==0) pc=180000;
        if(a.cv.compareTo("NV")==0) pc=150000;
        System.out.printf("%s %s %d %d %d %d",a.msv,a.ten,luong,thuong,pc,luong+thuong+pc);
    }
        
}
