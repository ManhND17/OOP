package JAVA_Co_Ban;

import java.util.Scanner;
public class J01014 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;
            long n=sc.nextLong();long ans=1;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    ans=i;
                    while(n%i==0)
                    {
                        n/=i;
                    }
                }
              
            }
           if(n>1) ans=n;
            System.out.println(ans);
        }
    }
}
