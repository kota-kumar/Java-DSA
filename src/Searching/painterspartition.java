package Searching;
import java.util.*;

public class painterspartition {
    public static void main(String[] args) {
        Scanner temp =new Scanner(System.in);
        int workers = temp.nextInt();
        int timeperone= temp.nextInt();
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]= temp.nextInt();
        }
      int mintimetaken=  paintpartitionasolve(ar, workers, timeperone);
        System.out.println(mintimetaken);

    }
    public static int paintpartitionasolve(int[] A, int workers, int timeperone){
        int l=max(A);
        int h =sum(A);
        int ans=0;
        while(l<=h){
            int m =(l+h)/2;
            if(check(A, m, workers)){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans*timeperone;
    }
    public static boolean check(int[] A, int m, int workers){
        int n = A.length;
        int w=1;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=A[i];
            if(sum>m){
                w=w+1;
                sum=A[i];
            }
        }
        if(w>workers){
            return false;
        }
        return true;
    }
    public static int sum(int[] A){
        int n = A.length;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+=A[i];
        }
        return sum;
    }
    public static int max(int[] A){
        int n = A.length;
        int max=0;
        for (int i = 0; i < n; i++) {
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
}
