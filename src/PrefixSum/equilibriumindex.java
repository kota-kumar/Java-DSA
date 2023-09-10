package PrefixSum;
import java.util.*;
public class equilibriumindex {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int ans = equilibrium(ar);
        System.out.println(ans);
    }
    public static int equilibrium(int[] A){
    int n = A.length;
    int[] psum = new int[n];
    psum[0]=A[0];
        for (int i = 1; i < n; i++) {
            psum[i]=psum[i-1]+A[i];
        }
        for(int i=0;i<n;i++){
            int ls = 0;
            int rs = 0;
            if(i==0){
                ls=0;
            }else{
                ls=psum[i-1];
            }
            rs = psum[n-1]-psum[i];
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}
    /*public static int bruteforceequilibrium(int[] A){
        int n = A.length;
        for(int i =0;i<n;i++){
            int leftsum = 0;
            int rightsum =0;
            for(int j = 0;j<i;j++){
                leftsum+=A[j];
            }
            for(int k = i+1;k<n;k++){
                rightsum+=A[k];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }*/

