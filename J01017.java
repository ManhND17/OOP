package JAVA_Co_Ban;

import java.util.Scanner;
public class J01017 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            long n=sc.nextLong();
            boolean ok=true;
            while(n>9)
            {
                if(Math.abs((n%10)-((n/10)%10))!=1)
                {
                    ok=false;
                    break;
                }
                n/=10;
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
