package Sorting;

import java.util.Scanner;

public class inversionpaircount{
    public static long ans=0;
    public static void main(String[] args) {
        ans=0;
        Scanner temp = new Scanner(System.in);
        int n =temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]= temp.nextInt();
        }
        int low =0;
        int high =n-1;
        recsort(ar, low, high);
        System.out.println((int)(ans% (int)(1000000007)));
    }
    public static int[] recsort(int[] A, int l, int h){
        int mid = (l+h)/2;
        if(l==h){
            int[] a = new int[1];
            a[0]=A[l];
            return a;
        }
        int[] left = recsort(A, l, mid);
        int[] right = recsort(A, mid+1, h);
        int[] c = mergesort(left, right);
        return c;
    }
    public static int[] mergesort(int[] a, int[] b){
        int n =a.length;
        int m = b.length;
        int[] c = new int[n+m];
        int p1 = 0;
        int p2=0;
        int p3=0;
        while(p1<n && p2<m){
            if(a[p1]<=b[p2]){
                c[p3]=a[p1];
                p3++;p1++;
            }else{
                c[p3]=b[p2];
                ans =ans+n-p1;
                p3++;
                p2++;
            }
        }
        while (p1<n){
            c[p3]=a[p1];
            p3++;p1++;
        }
        while (p2<m){
            c[p3]=b[p2];
            p3++;p2++;
        }
    return c;
    }

    }

