package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class prefix {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n; i++) {
        ar[i]= temp.nextInt();
        }
        int[] ans = psum(ar);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] psum(int[] A){
        int n = A.length;
        int[] psum = new int[n];
        psum[0]=A[0];
        for (int i = 1; i < n; i++) {
            psum[i]=psum[i-1]+A[i];
        }
        return psum;
    }
}
