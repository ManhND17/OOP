
package Mang;

import java.util.Scanner;
public class J02028 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int l =0;
        int r = 0;
        long sum=a[0];
        boolean check=false;
        while(l<n){
            if(sum==k){
                check=true;
                break;
            }
            if(l==r||sum<k){
                r++;
                if(r==n) break;
                sum+=a[r];
            }
            else if(sum>k){
                sum-=a[l];
                l++;
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
        }
    }
}
