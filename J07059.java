
package Vao_Ra_FILE;

import java.util.*;
import java.io.*;
public class J07059 {
    static class CaThi{
        String ma,ngay,gio,phong;
        public CaThi(int t,String a,String b,String c){
            ma = String.format("C%03d",t);
            ngay = a;
            gio =b;
            phong =c;
        }
    }
    static int Compare(String a,String b){
        String[] w1 = a.split("/");
        String[] w2 = b.split("/");
        if(w1.length==2||w2.length==2) return -2;
        if(w1[2].compareTo(w2[2])<0) return -1;
        if(w1[2].compareTo(w2[2])==0&&w1[1].compareTo(w2[1])<0) return -1;
        if(w1[2].compareTo(w2[2])==0&&w1[1].compareTo(w2[1])==0&&w1[0].compareTo(w2[0])<0) return -1;
        if(w1[2].compareTo(w2[2])==0&&w1[1].compareTo(w2[1])==0&&w1[0].compareTo(w2[0])==0) return 0;
        return 1;
    }
    static int compare(String a,String b){
        String[] w1 = a.split(":");
        String[] w2 = b.split(":");
        if(w1.length==1||w2.length==1) return -2;
        if(w1[0].compareTo(w2[0])<0) return -1;
        if(w1[0].compareTo(w2[0])==0&&w1[1].compareTo(w2[1])<0) return -1;
        if(w1[0].compareTo(w2[0])==0&&w1[1].compareTo(w2[1])==0) return 0;
        return 1;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        sc.nextLine();
        CaThi[] a = new CaThi[n];
        for(int i=0;i<n;i++){
            a[i] = new CaThi(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Compare(a[i].ngay,a[j].ngay)==0){
                if(compare(a[i].gio,a[j].gio)==1){
                    CaThi c =a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                if(compare(a[i].gio,a[j].gio)==0&&a[i].ma.compareTo(a[j].ma)>0){
                    CaThi c =a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
                }
                else{
                    if(Compare(a[i].ngay,a[j].ngay)==1){
                        CaThi c =a[i];
                        a[i] = a[j];
                        a[j] = c;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.printf("%s %s %s %s\n",a[i].ma,a[i].ngay,a[i].gio,a[i].phong);
        }
    }
}
