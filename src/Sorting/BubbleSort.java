package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        int n = temp.nextInt();
        int m = temp.nextInt();
        int[] ar = new int[n];
        int[] ar1=new int[m];
        for(int i=0;i<n;i++){
            ar[i]=temp.nextInt();
        }
        for(int i=0;i<m;i++){
            ar1[i]=temp.nextInt();
        }
        int[] ar3=   bubblesort(ar, ar1);

        System.out.print(Arrays.toString(ar3));
    }
    public static int[] bubblesort(int[] A, int[] B){
        int n = A.length;
       int m = B.length;
       int[] c =new int[n+m];
       int p1=0;
       int p2=0;
       int p3=0;
       while(p1<n && p2<m){
           if(A[p1]<B[p2]){
               c[p3]= A[p1];
               p3++; p1++;
           }else{
               c[p3]=B[p2];
               p3++; p2++;
           }
       }
        while (p1<n) {
            c[p3]=A[p1];
            p3++; p1++;
        }
        while (p2<m){
            c[p3]=B[p2];
            p3++;p2++;
        }
        return c;
    }
}