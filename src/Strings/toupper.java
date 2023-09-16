package Strings;
import java.util.*;
public class toupper {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s = temp.next();
        char[] str = s.toCharArray();
        char[] ans = upper(str);
        System.out.println(ans);
    }
    public static char[] upper(char[] A){
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if(A[i]>='a' && A[i]<='z'){
                A[i]=(char)(A[i]-32);
            }
        }
        return A;
    }
}
