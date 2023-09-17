package Sorting;
import java.util.*;
public class countsort {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = temp.nextInt();
        }
        int[] ans = countingsort(ar);
        System.out.print(Arrays.toString(ans));
    }

    public static int[] countingsort(int[] A) {
                int n = A.length;
                int[] ans = new int[n];
                int min =A[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(A[i], min);
        }
        int max = A[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(A[i], max);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(hm.containsKey(A[i])){
                int frq = hm.get(A[i]);
                hm.put(A[i], frq+1);
            }else{
                hm.put(A[i], 1);
            }
        }
        int k=0;
        for (int i = min; i <= max; i++) {
            int frq =0;
            if(hm.containsKey(i)){
                frq =hm.get(i);
            }
            for (int j = 0; j < frq; j++) {
                ans[k]=i;
                k++;
            }
        }
        return ans;
    }
}