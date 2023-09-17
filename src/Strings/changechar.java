package Strings;
import java.util.*;
public class changechar {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s = temp.next();
        int b = temp.nextInt();
        int ans = countdistinct(s, b);
        System.out.println(ans);
    }

    public static int countdistinct(String A, int B) {
        int n = A.length();
        if(n==1){
            return 1;
        }
        int[] frq = new int[26];
        for (int i = 0; i < n; i++) {
            frq[A.charAt(i)-'a']++;
        }
        Arrays.sort(frq);
        int ans =0;
        for (int i = 0; i < 26; i++) {
            if(frq[i]<=B){
                B-=frq[i];
                frq[i]=0;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(frq[i]>0){
                ans++;
            }
        }
        return ans;
            }
}
