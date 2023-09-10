package Subarrays;
import java.util.*;
public class generatesubarrays {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = temp.nextInt();
        }
        int[][] ans = subarraygenerate(ar);
        System.out.print(Arrays.deepToString(ans));
    }
    public static int[][] subarraygenerate(int[] A){
        int n = A.length;
        int m = n*(n+1)/2;
        int c =0;
        int[][] ans = new int[m][];
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                ans[c]=new int[j-i+1];
                int size=0;
                for(int k =i;k<=j;k++){
                    ans[c][size]=A[k];
                    size++;
                }
                c++;
            }
        }
        return ans;
    }
}
