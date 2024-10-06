
package Xau_Ky_tu;
import java.util.*;
public class J03020 {
    static boolean TN(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0;
        String[] a = new String[6000];
        while(sc.hasNext()){
            a[n]= sc.next();
            n++;
        }
        int x=0;
        HashMap<String,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(TN(a[i])){
                if(mp.get(a[i])==null) mp.put(a[i], 1);
                else mp.put(a[i],mp.get(a[i])+1);
                x=Math.max(x,a[i].length());
            }
        }
        for(int i=0;i<n;i++){
            if(a[i].length()==x&&mp.get(a[i])!=null){
                System.out.printf("%s %d\n",a[i],mp.get(a[i]));
                mp.remove(a[i]);
            }
        }
    }
}
