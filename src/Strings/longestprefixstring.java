package Strings;
import java.util.*;
public class longestprefixstring {
    public static void main(String[] args) {

Scanner temp = new Scanner(System.in);
int n = temp.nextInt();
String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i]= temp.next();
        }
    String ans  = longestprefix(str);
        System.out.println(ans);
}
public static String longestprefix(String[] A){
       Arrays.sort(A);
       int n = A.length;
       String ans ="";
       String first = A[0];
       String last  = A[n-1];
    for (int i = 0; i < first.length(); i++) {
        if(first.charAt(i)==last.charAt(i)){
            ans+=first.charAt(i);
        }else{
            break;
        }
    }
    return ans;
}
    }