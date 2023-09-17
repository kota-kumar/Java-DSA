package Strings;

import java.util.*;

public class longestpalindromestring {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s  = temp.next();
        String ans = palindrome(s);
        System.out.printf(ans);
    }
   public static String palindrome(String A){
      int n = A.length();
      if(A==null || n<1){
          return "";
      }
      int s =0;
      int e =0;
       for (int i = 0; i < n; i++) {
           int even = sublen(A, i, i+1);
           int odd = sublen(A, i, i);
           int len = Math.max(even, odd);
           if(len>e-s+1){
               s = i-(len-1)/2;
               e =i+n/2;
           }
       }
       return A.substring(s, e+1);
   }
   public static int sublen(String A, int left, int right){
        while(left>=0 && right<A.length() && A.charAt(left)==A.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
   }
    }
