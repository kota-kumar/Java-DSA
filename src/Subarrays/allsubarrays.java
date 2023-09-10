package Subarrays;
import java.util.*;
public class allsubarrays {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= temp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for(int j = i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
