package Strings;
import java.util.*;
public class reversewordstring {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s = temp.nextLine();
        String ans = reverse(s);
        System.out.println(ans);
    }
    public static String reverse(String A){
        int n = A.length();
        String ans="";
        int i = n-1;
        while(i>=0){
            while(i>=0 && A.charAt(i)==' '){
                i--;
            }
            int j = i;
            while (i>=0 && A.charAt(i)!=' '){
                i--;
            }
            if(ans.isEmpty()){
                ans=ans.concat(A.substring(i+1, j+1));
            }else{
                ans=ans.concat(' '+A.substring(i+1, j+1));
            }
        }
            if(ans.charAt(n-1)==' '){
                return ans.substring(0, n-1);
            }

        return ans;
    }
}
