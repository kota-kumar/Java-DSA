package Sorting;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = temp.nextInt();
        }
        int[] ans = mergesorting(ar);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] mergesorting(int[] A){
        int n = A.length;
        int low=0;
        int high=n-1;
        int[] c = sortmerge(A, low, high);
        return c;
    }
    public static int[] sortmerge(int[] A, int low, int high){
        int mid = (low+high)/2;
        if(low==high){
            int[] a=new int[1];
            a[0]=A[low];
            return a;
        }
        int[] left = sortmerge(A, low, mid);
        int[] right=sortmerge(A, mid+1, high);
        int[] ans = sorting(left, right);
        return ans;
    }
    public static int[] sorting(int[] A, int[] B){
        int n = A.length;
        int m=B.length;
        int[] ans = new int[n+m];
        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<n && p2<m){
            if(A[p1]<B[p2]){
                ans[p3]=A[p1];
                p3++; p1++;
            }else{
                ans[p3]=B[p2];
                p3++;p2++;
            }
        }
        while(p1<n){
            ans[p3]=A[p1];
            p3++; p1++;
        }
        while(p2<m){
            ans[p3]=B[p2];
            p3++;p2++;
        }
        return ans;
    }
}
