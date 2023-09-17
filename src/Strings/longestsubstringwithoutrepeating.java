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
        int n = A.length();
        if(n==1){
            return 1;
        }
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        int max=0;
        int s =0;
        int e =0;
        while(s<n){
            if(!hs.contains(A.charAt(s))){
                hs.add(A.charAt(s));
                s++;
            }else{
                hs.remove(A.charAt(e));
                e++;
            }

        max=Math.max(hs.size(), max);
        }
        return max;
    }
}
