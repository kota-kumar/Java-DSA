package Carryforward;
import java.util.*
public class pickfromboth {
    public static void main(String[] args) {
    Scanner temp = new Scanner(System.in);
    int n = temp.nextInt();
    int b = temp.nextInt();
    int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
        ar[i]= temp.nextInt();
    }
    int ans = pickmax(ar, b);
        System.out.print(ans);
}
public static int pickmax(int[] A, int B){
        int n = A.length;
       int sum=0;
    for (int i = 0; i < B;  i++) {
        sum+=A[i];
    }
    int maxsum = sum;
    int t=B;
    for (int i = n-1; i >=n-B; i--) {
         maxsum+=A[i]-A[t-1];
         if(sum<maxsum){
             sum=maxsum;
         }
         t--;

    }
    return sum;
}
}
