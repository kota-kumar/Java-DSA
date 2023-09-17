package Strings;
import java.util.*;
public class longestsubstringwithoutrepeating {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s = temp.next();
        int ans = unique(s);
        System.out.println(ans);
    }
    public static int unique(String A){
            int n  = A.length();
            int s =0;
            int e =0;
            int ans=0;
            HashSet<Character> hs = new HashSet<>();
       while(s<n){
            if(!hs.contains(A.charAt(s))){
                hs.add(A.charAt(s));
                s++;
            }else{
                hs.remove(A.charAt(e));
                e++;
            }
            ans=Math.max(hs.size(), ans);
        }
       return ans;
    }
}
