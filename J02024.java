
package Mang;

import java.util.*;
public class J02024 {
    static ArrayList<String> ans;
    static void Try(int end, int[] a, int sum, String s) {
        if (sum % 2 == 1) {
            System.out.println(s);
            ans.add(s);
        }
        for (int i = a.length - 1; i > end; i--) {
            Try(i, a, sum + a[i], s + a[i] + ' ');
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            ans = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]<a[j]){
                        int c=a[i];
                        a[i]=a[j];
                        a[j]=c;
                    }
                }
            }
            Try(-1,a,0,"");
        }
    }
        
}
