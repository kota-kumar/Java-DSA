package PrefixSum;
import java.util.*;
public class productarraypuzzle {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int[] ans = productpuzzle(ar);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] productpuzzle(int[] A){
        int n = A.length;
        int s =1;
        int[] ans= new int[n];
        for(int i =0;i<n;i++){
            s*=A[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i]=s/A[i];
        }
        return ans;
    }
}
