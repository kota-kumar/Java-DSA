package Sorting;
import java.util.*;
public class largestnumber {
    public static class large implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            String sa =Integer.toString(a)+Integer.toString(b);
            String sb =Integer.toString(b)+Integer.toString(a);
            int m = Integer.valueOf(sa);
            int n = Integer.valueOf(sb);
            if(m >n){
                return -1;
            }else if(m< n){
                return 1;
            }else{
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(temp.nextInt());
        }
        Collections.sort(ar, new large());
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i));
        }

    }

}
