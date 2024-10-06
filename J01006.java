package JAVA_Co_Ban;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author MyPC
 */
import java.util.Scanner;
public class J01006 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        long[] A=new long[93];
        A[0]=0;
        A[1]=1;
        A[2]=1;
        for(int i=3;i<=92;i++)
        {
            A[i]=A[i-2]+A[i-1];
        }
        while(t>0)
        {
            t--;
            int n=scanner.nextInt();
            System.out.printf("%d\n",A[n]);
        }
    }
}
