package twopointers;
import java.util.*;
public class pairwithgivensum {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int b = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = temp.nextInt();
        }
        int ans = pairsumcount(ar, b);
        System.out.println(ans);
    }
    public static int pairsumcount(int[] A, int B){
              int n = A.length;
              int p1=0;
              int p2 =n-1;
              int c =0;
              while(p1<p2){
                  int sum = A[p1]+A[p2];
                  if(sum>B){
                      p2--;
                  }else if(sum<B){
                      p1++;
                  }else{
                      if(A[p1]==A[p2]){
                          int len =p2-p1+1;
                          c+=(len*(len-1))/2;
                          break;
                      }else{
                          int l =A[p1];
                          int r = A[p2];
                          int lc =0;
                          int rc =0;
                          while(A[p1]==l){
                              lc++;
                              p1++;
                          }
                          while(A[p2]==r){
                              rc++;
                              p2--;
                          }
                          c+=(lc*rc);
                      }
                  }
              }
              return c;
    }
}
    /*public static int bruteforce_pairsumcount(int[] A, int B) {
        int n = A.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = A[i] + A[j];
                if (sum == B) {
                    c++;
                }
            }
        }
        return c;
    }*/
