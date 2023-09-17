package Strings;
import java.util.*;
public class stringoperations {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String str = temp.next();
        String ans = stringops(str);
        System.out.println(ans);
    }

    public static String stringops(String A) {
        int n = A.length();
        String st = "";
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                st += '#';
            }else if (A.charAt(i) >= 97 && A.charAt(i) <= 122) {
                st += A.charAt(i);
            }
        }
        return st + st;

    }
}