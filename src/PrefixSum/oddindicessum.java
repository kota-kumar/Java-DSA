package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class oddindicessum {
    public static void main(String[] args) {
    Scanner temp = new Scanner(System.in);
    int n = temp.nextInt();
    int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
        ar[i] = temp.nextInt();
    }
    int m = temp.nextInt();
    int s = 2;
    int[][] oddrange = new int[m][2];
        for (int i = 0; i < m; i++) {
        oddrange[i][0] = temp.nextInt();
        oddrange[i][1] = temp.nextInt();
    }
    int[] ans = oddevenindice(ar, oddrange);
        System.out.print(Arrays.toString(ans));
}

    public static int[] oddevenindice(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int[] ans = new int[m];
        int[] psum =new int[n];
        psum[0]=0;
        for (int i = 1; i < n; i++) {
            if(i%2==1){
                psum[i]=psum[i-1]+A[i];
            }else{
                psum[i]=psum[i-1];
            }
        }
        for (int i = 0; i < m; i++) {
            int ls =B[i][0];
            int rs = B[i][1];
            if(ls==0){
                ans[i]=psum[rs];
            }else{
                ans[i]=psum[rs]-psum[ls-1];
            }
        }
        return ans;
    }
}
    /*public static int[] bruteforceoddevenindice(int[] A, int[][] B){
        int n = A.length;
        int m = B.length;
        int[] ans =new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0;j<m;j++){
                int ls = B[j][0];
                int rs = B[j][1];
                int sum =0;
                for(int k =ls;k<=rs;k++){
                    if(k%2==1){
                        sum+=A[k];
                    }
                    ans[j]=sum;
                }
            }
        }
        return ans;
    }*/

