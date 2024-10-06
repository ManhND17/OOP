
package Khai_Bao_Lop_vaDoi_Tuong;

import java.util.Scanner;
public class J04015 {
    static class Thunhap{
        String cv,ten,s;
        long hs,pc,luong;
        public void get(Scanner sc)
        {
            cv=sc.nextLine();
            ten=sc.nextLine();
            luong=sc.nextLong();
            s=cv.substring(0,2);
            hs=(cv.charAt(2)-'0')*10+cv.charAt(3)-'0';
        }    
    }
    
    static void In(Thunhap a)
    {
        if(a.s.equals("HT")) a.pc=2000000;
        if(a.s.equals("HP")) a.pc=900000;
        if(a.s.equals("GV")) a.pc=500000;
        System.out.printf("%s %s %d %d %d",a.cv,a.ten,a.hs,a.pc,a.luong*a.hs+a.pc);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Thunhap a = new Thunhap();
        a.get(sc);
        In(a);
                
    }
}
