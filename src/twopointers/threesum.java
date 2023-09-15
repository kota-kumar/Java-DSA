package twopointers;
import java.util.*;
public class threesum {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int b = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int ans = three_sum(ar, b);
        System.out.println(ans);
    }
    public static int three_sum(int[] A, int B){
        int n = A.length;
        int ans=0;
        int sum =0;
        for (int i = 0; i < n; i++) {
            for(int j =0; j<n;j++){
                for (int k = 0; k < n; k++) {
                    sum+=A[i]+A[j]+A[k];
                    if(sum<=B || sum>=B){
                        ans=sum;
                    }
                }
            }
        }
        return ans;
    }
}
