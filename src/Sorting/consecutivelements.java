package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class consecutivelements {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]= temp.nextInt();
        }
        boolean ans = arrayconsecele(ar);
        System.out.print(ans);
    }
    public static boolean arrayconsecele(int[] A){
        Arrays.sort(A);
        int n = A.length;
        for(int i=1;i<n;i++){
            if(A[i-1]+1!=A[i]){
                return false;
            }
        }
        return true;
    }
}
