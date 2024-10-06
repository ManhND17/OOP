package JAVA_Co_Ban;

import java.util.Scanner;
public class J01018 {
   public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            long n=sc.nextLong();
            boolean ok=true;
            int s=0;
            while(n>9)
            {
                if(Math.abs((n%10)-((n/10)%10))!=2)
                {
                    ok=false;
                    break;
                }
                s+=n%10;
                n/=10;
                
            }
            if(ok) 
            {
                if((s+n)%10==0) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    } 
}
