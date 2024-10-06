
package Mang;

import java.util.*;
public class J02023 {
    static void max(int n,int s)
    {
        String s1 = "";
        for(int i=1;i<=n;i++)
        {
            if(s>0)
            {
                if(s>9){
                    s1+="9";
                    s-=9;
                }
                else{
                    s1+=Integer.toString(s);
                    s=0;
                }
            }
            
            else s1+="0";
            
         }
        System.out.print(s1);
         
    }
    static void min(int n,int s)
    {
        String s2="";
        for(int i=1;i<=n;i++)
        {
            if(s-9*(n-i)>0)
            {
                s2+=Integer.toString(s-9*(n-i));
                s=9*(n-i);
            }
            else{
                if(i==1) {
                    s2+="1";
                    s-=1;
                }
                else s2+="0";
            }
        }
        System.out.printf("%s ",s2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if(s>9*n||s<1) System.out.print("-1 -1\n");
        else{
            min(n,s);
            max(n,s);
            //System.out.printf("%s %s\n",max(s,n),max(s,n));
        }
    }
}
