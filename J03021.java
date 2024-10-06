package Xau_Ky_tu;

import java.util.Scanner;
public class J03021 {
    static int To(char s)
    {
        if("ABC".indexOf(s)>-1) return 2;
        if("DEF".indexOf(s)>-1) return 3;
        if("GHI".indexOf(s)>-1) return 4;
        if("JKL".indexOf(s)>-1) return 5;
        if("MNO".indexOf(s)>-1) return 6;
        if("PQRS".indexOf(s)>-1) return 7;
        if("TUV".indexOf(s)>-1) return 8;
        return 9;
    }
    static boolean check(int[] a,int n)
    {
        for(int i=0;i<=n/2;i++){
            if(a[i]!=a[n-i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            s = s.toUpperCase();
            int[] a=new int[s.length()];
            for(int i=0;i<s.length();i++)
            {
                a[i] = To(s.charAt(i));
            }
            if(check(a,s.length())) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
