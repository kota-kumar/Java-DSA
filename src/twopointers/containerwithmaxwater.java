package twopointers;

import java.util.*;

public class containerwithmaxwater {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar  = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        int ans =max_water_container(ar);
        System.out.print(ans);
    }
    public static int max_water_container(int[] A){
    int n = A.length;
    //if Array contains only 1 value then return 0;
    if(n==1){
        return 0;
    }
    int p1= 0;
    int p2 =n-1;
    int ans =0;
    while(p1<=p2){
        int min = Math.min(A[p1], A[p2]);
        int len = p2-p1;
        ans=Math.max(ans, min*len);
        if(A[p1]<A[p2]){
            p1++;
        }else{
            p2--;
        }
    }
    return ans;
    }
}
    /*public static int bruteforce_max_water_container(int[] A){
        int n = A.length;
        int ans =0;
        for (int i = 0; i < n; i++) {
            for(int j = i+1; j<n;j++){
                int min = Math.min(A[i],A[j]);
                int len = j-i;
                ans = Math.max(ans, len*min);
            }
        }
        return ans;
    }*/

