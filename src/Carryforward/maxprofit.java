package Carryforward;
import java.util.*;
public class maxprofit {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int ans = maxprof(ar);
        System.out.print(ans);
    }
    public static int maxprof(int[] A){
        int n = A.length;
        if(n==0){
            return 0;
        }
        int max=0;
        int min = A[0];
        int ans =0;
        for (int i = 0; i < n; i++) {
            ans = A[i]-min;
            if(A[i]<min){
                min=A[i];
            }
            if(ans>max){
                max=ans;
            }
        }
        return max;
    }
}
    /*public static int maxprof(int[] A){
    int n = A.length;
    if(n==0){
        return 0;
    }
    int max=0;
    int min = A[0];
    int ans =0;
    for(int i=1;i<n;i++){
        if(A[i]<min){
            min=A[i];
        }
        for(int j=i+1;j<n;j++){
            if(A[j]>max) {
                max = A[j] - min;
                if(max>ans){
                    ans=max;
                }
            }

        }
    }
    return ans;
    }*/

