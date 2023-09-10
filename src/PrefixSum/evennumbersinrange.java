package PrefixSum;

import java.util.*;

public class evennumbersinrange {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = temp.nextInt();
        }
        int m = temp.nextInt();
        int s = 2;
        int[][] evenrange = new int[m][2];
        for (int i = 0; i < m; i++) {
            evenrange[i][0] = temp.nextInt();
            evenrange[i][1] = temp.nextInt();
        }
        int[] ans = evenrange(ar, evenrange);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] evenrange(int[] A, int[][]B){
        int n = A.length;
        int m = B.length;
        int[] ans  =new int[m];
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                A[i]=1;
            }else{
                A[i]=0;
            }
        }
        int[] psum = new int[n];
        psum[0]=A[0];
        for(int i =1;i<n;i++){
            psum[i]=psum[i-1]+A[i];
        }
        for (int i = 0; i < m; i++) {
            int ls = B[i][0];
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
/*public static int[] bruteforceevenrange(int[] A, int[][] B){
        int n = A.length;
        int m = B.length;
        int[] ans = new int[m];
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                int l = B[j][0];
                int r = B[j][1];
                int c =0;
                for(int k=l;k<=r;k++ ){
                    if(A[k]%2==0){
                        c++;
                    }
                    ans[j]=c;
                }

            }
        }
        return ans;
}*/
