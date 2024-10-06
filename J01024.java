package JAVA_Co_Ban;

import java.util.Scanner;
public class J01024 {
    static int check(long a)
    {
        while(a>0)
        {
            if(a%10>2) return 0;
            a/=10;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            long n=sc.nextLong();
            if(check(n)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
