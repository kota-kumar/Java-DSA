package Sorting;

import java.util.*;

public class factorscomparator {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            ar.add(temp.nextInt());
        }
        System.out.println("Before Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();
        Collections.sort(ar);
        System.out.println("After Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();
        Collections.sort(ar, new factcomp());
        System.out.println("After factors Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();

    }

    public static class factcomp implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
          int facta = factor(a);
          int factb = factor(b);
          if(facta<factb){
              return -1;
          }else if(factb<facta){
              return 1;
          }else{
              return 0;
          }
        }
        public int factor(Integer A){
            int count =0;
            for(int i=1; i*i<=A;i++){
                if(A%i==0){
                    if(i==A/i){
                        count++;
                    }else{
                        count+=2;
                    }
                }
            }
            return count;
        }
    }
}
