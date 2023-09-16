package Strings;

import java.util.*;

public class tolower {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
     String s = temp.next();
     char[] str = s.toCharArray();
        char[] ans = lower(str);
        System.out.println(ans);
    }
    public static char[] lower(char[] A){
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if('A'<=A[i] && A[i]<='Z'){
                A[i]=(char)(A[i]+32);
            }
        }
        return A;
    }
}
