package Strings;

import java.util.*;

public class togglecase {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String s = temp.next();
        String ans = toggle(s);
        System.out.printf(ans);
            }

    public static String toggle(String A){
        int n =A.length();

        char[] ch = A.toCharArray();
            for(int i =0;i<n;i++){
                if(ch[i]>='A' && ch[i]<='Z'){
                    ch[i]+=32;
                }else if(ch[i]>='a' && ch[i]<='z'){
                    ch[i]-=32;
                }
            }
            return new String(ch);
    }
}
