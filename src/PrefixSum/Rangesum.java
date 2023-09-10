package PrefixSum;

import java.util.*;

public class Rangesum {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int m = temp.nextInt();
        int s =2;
        int[][] range = new int[m][2];
        for (int i = 0; i < m; i++) {
            range[i][0] = temp.nextInt();
            range[i][1]=temp.nextInt();
        }
        int[] ans = rangesum(ar, range);
        System.out.print(Arrays.toString(ans));

    }
    public static int[] rangesum(int[] A, int[][] B){
        int n =A.length;
        int m = B.length;
        int[] ans = new int[m];
        int[] psum=new int[n];
        psum[0]=A[0];
        for (int i = 1; i < n; i++) {
            psum[i]=psum[i-1]+A[i];
        }
        int t =0;
        for(int i=0;i<m;i++){
            int ls = B[i][0];
            int rs = B[i][1];
            if(ls==0){
                ans[t]=psum[rs];
                t++;
            }else{
                ans[t]=psum[rs]-psum[ls-1];
                t++;
            }
        }
        return ans;
    }
}
    /*public static int[] bruteforcerangesum(int[] A, int[][]B){
        int n =A.length;
        int m = B.length;
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            int ls = B[i][0];
            int rs = B[i][1];
            int sum =0;
            for(int j =ls;j<=rs;j++){
                sum+=A[j];
                ans[i]=sum;
            }
            sum=0;
        }
        return ans;
    }
*/
