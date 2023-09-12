package Subarrays;
import java.util.*;
public class subarraysum {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar =new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int[] ans = subsum(ar);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] subsum(int[] A){
        int n =A.length;
        int m =n*(n+1)/2;
        int[] ans = new int[m];
        int[] psum = new int[n];
        psum[0]=A[0];
        for (int i = 1; i < n; i++) {
            psum[i]=psum[i-1]+A[i];
        }
        int t=0;
        for (int i = 0; i < n; i++) {
            for(int j = i;j<n;j++){
                int ls =i;
                int rs = j;
                if(ls==0){
                    ans[t]=psum[rs];
                    t++;
                }else{
                    ans[t]=psum[j]-psum[i-1];
                    t++;
                }
            }
        }
        return ans;
    }
}
