
package Vao_Ra_FILE;

import java.util.Scanner;
import java.io.File;
import java.util.TreeSet;
import java.io.IOException;
public class J07008 {
    static void Try(int start,int num,String r,int[] a,int[] ans,int n,TreeSet<String> s )
    {
        if(num>1) s.add(r);
        if(num==n) return;
        for(int i=start;i<n;i++)
        {
            if(num==0)
            {
                ans[num]=a[i];
            }
            else if(a[i]>ans[num-1]){
                ans[num]=a[i];
            }
            else continue;
            Try(i+1,num+1,r+Integer.toString(a[i])+" ",a,ans,n,s);
        }
            
    }    
    public static void main(String[] args) throws IOException
    {
        File x = new File("DAYSO.in");
        
        Scanner sc = new Scanner(x);
        int n = sc.nextInt();
        TreeSet<String> s = new TreeSet<>();
        int[] a = new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Try(0,0,"",a,ans,n,s);
        s.forEach(u -> System.out.println(u));   
    }
}
