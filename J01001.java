package JAVA_Co_Ban;



import java.util.Scanner;
public class J01001 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<=0||b<=0) System.out.println(0);
        else{
        int chuvi = (a+b)*2;
        int dientich=a*b;
        scanner.close();
        System.out.print(chuvi+" ");
        System.out.println(dientich);
        }
    }
}