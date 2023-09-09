package Carryforward;

import java.util.Scanner;

public class paircount {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        String S = temp.next();
        int ans = optimizepaircount(S);
        System.out.println(ans);
    }
    public static int optimizepaircount(String s){
        int n = s.length();
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                count++;
            }
            if(s.charAt(i)=='G'){
                sum+=count;
            }
        }
        return sum;
    }
}
    /*public static int bruteforcepaircount(String S){
        int n = S.length();
        int count = 0;
        for(int i=0;i<n;i++){
            if(S.charAt(i)=='A'){
                for(int j = i+1;j<n;j++){
                    if(S.charAt(j)=='G'){
                        count++;
                    }
                }
            }
        }
        return count;
    }*/

