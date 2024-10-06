
package Vao_Ra_FILE;
import java.util.*;
import java.io.*;
public class J07071 {
    static String chuanhoa(String s){
        s = s.toUpperCase();
        String[] w =s.split("[' ']");
        String ss="";
        for(String i:w){
            if(i.length()==0) continue;
            ss+=i.substring(0,1)+".";
        }
        ss = ss.substring(0,ss.length()-1);
        return ss;
    }
    static class DanhSach{
        String name,tat;
        public DanhSach(String a){
            name = a;
            tat = chuanhoa(a);
        }
    }
    static boolean sosanh(String a,String b){
        if(b.length()!=a.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='*'&&a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }
    static boolean sapxep(String a,String b){
        String[] w =a.split("[' ']");
        String[] w1 = b.split("[' ']");
        if(w[w.length-1].compareTo(w1[w1.length-1])>0) return false;
        if(w[w.length-1].compareTo(w1[w1.length-1])==0&&w[0].compareTo(w1[0])>0) return false;
        return true;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("D:/DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        DanhSach[] a = new DanhSach[n];
        for(int i=0;i<n;i++){
            a[i] = new DanhSach(sc.nextLine());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(sapxep(a[i].name,a[j].name)==false){
                    DanhSach c =a[i];
                    a[i] =a[j];
                    a[j]=c;
                }
            }
        }
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            for(int i=0;i<n;i++){
                if(sosanh(s,a[i].tat)){
                    System.out.println(a[i].name);
                }
            }
        }
    }
}
