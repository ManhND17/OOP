
package Xau_Ky_tu;

import java.util.Scanner;
public class J03040 {
    static boolean Check(String s)
    {
        int dem=0;
        for(int i=5;i<=10;i++)
        {
            if(s.charAt(i)=='6'||s.charAt(i)=='8') dem++;
        }
        if(dem==5) return true;
        if(s.charAt(5)==s.charAt(6)&&s.charAt(6)==s.charAt(7)&&s.charAt(9)==s.charAt(10)) return true;
        if(s.charAt(5)-'0'<s.charAt(6)-'0'&&s.charAt(6)-'0'<s.charAt(7)-'0'&&s.charAt(7)-'0'<s.charAt(9)-'0'&&s.charAt(9)-'0'<s.charAt(10)-'0') return true;
        return false;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            if(Check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
