package Strings;
import java.util.*;
public class isalpha {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
      String s = temp.next();
       char[] ch = s.toCharArray();
     int ans = islnam(ch);
        System.out.println(ans);
    }
    public static int islnam(char[] A){
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if(A[i]>='A' && A[i]<='Z' || A[i]>='a' && A[i]<='z' || A[i]>='0' && A[i]<='9') {
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
