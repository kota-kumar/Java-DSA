import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        int n = temp.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=temp.nextInt();
        }
        bubblesort(ar);
        System.out.print(Arrays.toString(ar));
    }
    public static int[] bubblesort(int[] A){
        int n = A.length;
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        return A;
    }
}