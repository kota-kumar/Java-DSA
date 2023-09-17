package Strings;
import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s = temp.next();
        String ans = reverse(s);
        System.out.println(ans);
    }
    public static String reverse(String A){
        int  n = A.length();
        char[] ch = A.toCharArray();
        char temp;
        for (int i = 0; i<ch.length/2 ; i++) {
           temp = ch[i];
          ch[i]=ch[n-i-1];
          ch[n-i-1]=temp;


        }
        return new String(ch);
    }
}
