
package Xau_Ky_tu;

import java.util.*;
public class J03016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int a=0; int b=0;
            for(int i=0;i<s.length();i++)
            {
                if(i%2==0) a+=s.charAt(i)-'0';
                else  b+=s.charAt(i)-'0';
                
            }
            if((a-b)%11==0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
