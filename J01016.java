package JAVA_Co_Ban;



import java.util.Scanner;
public class J01016 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int dem=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='4'||n.charAt(i)=='7') dem++;
        }
        if(dem==4||dem==7) System.out.print("YES");
        else System.out.print("NO");
    }
}
