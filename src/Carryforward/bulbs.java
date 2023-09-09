package Carryforward;
import java.util.*;
public class bulbs {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = temp.nextInt();
        }
        int ans = optimizedbulb(ar);
        System.out.print(ans);
    }
    public static int optimizedbulb(int[] A){
int n = A.length;
int flip =0;
for(int i =0;i<n;i++){
    if(flip%2==0 && A[i]==0 || flip%2==1 && A[i]==1){
        flip++;
    }
}
return flip;
    }

}
    /*public static int bruteforcebulb(int[] A){
        int  n = A.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(A[i]==0) {
                count++;
                for (int j = i + 1; j < n; j++) {
                    if (A[j] == 1) {
                        A[j] = 0;
                    } else {
                        A[j] = 1;
                    }
                }
            }
        }
        return count;
    }*/
