package Carryforward;
import java.util.*;
public class leadersarray {
    public static void main(String[] args) {
        Scanner temp =new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n; i++) {
        ar[i]= temp.nextInt();
        }
        int[] ans= leader(ar);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] leader(int[] A){
        int n = A.length;
        int max=A[n-1];
        int c =1;
        for(int i=n-2;i>0;i--){
            if(A[i]>max){
                max=A[i];
                c++;
            }
        }
        int[] ans = new int[c];
        ans[0]=A[n-1];
        max=A[n-1];
        int t =1;
        for(int i=n-2;i>0;i--){
            if(max<A[i]){
                ans[t]=A[i];
                max=A[i];
                t++;
            }

        }
        return ans;
    }
}
