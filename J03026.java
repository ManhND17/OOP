
package Xau_Ky_tu;

import java.util.Scanner;
public class J03026 {
    static boolean check(String a,String b)
    {
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            if(!check(a,b)) System.out.println(Math.max(a.length(),b.length()));
            else System.out.println("-1");
        }
    }
}
