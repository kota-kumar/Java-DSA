package Strings;
import java.util.*;
public class countoccurences {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String st = temp.next();
        int ans = countoc(st);
        System.out.println(ans);
    }
    public static int countoc(String A){
        int n = A.length();
        int ans=0;
        for (int i = 0; i < n-2; i++) {
            if(A.charAt(i)=='b' && A.charAt(i+1)=='o' && A.charAt(i+2)=='b'){
                ans++;
            }
        }
        return ans;
    }
}
