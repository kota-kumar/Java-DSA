package Searching;
import java.util.*;
public class Allocatebooks {
    public static void main(String[] args) {
        Scanner temp =new Scanner(System.in);
        int students = temp.nextInt();
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]= temp.nextInt();
        }
        int mintimetaken=  allocatebookssolution(ar, students);
        System.out.println(mintimetaken);

    }
    public static int allocatebookssolution(int[] A, int students){
        int n = A.length;
        if(n<students){
            return -1;
        }
        int l = 0;
        for(int i=0;i<n;i++){
            l=Math.max(l, A[i]);
        }
        int h =0;
        for (int i = 0; i < n; i++) {
            h+=A[i];
        }
        int ans=0;
        while(l<=h){
            int m=(l+h)/2;
            if(check(A, m, students)){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    public static boolean check(int[] A, int m, int students){
        int n = A.length;
        int studs=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=A[i];
            if(sum>m){
                studs++;
                sum=A[i];
            }
        }
        return studs<=students;
    }
}
