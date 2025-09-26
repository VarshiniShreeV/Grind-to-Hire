import java.util.Scanner;

public class CodeForce_1856_A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] ans = new int[t];
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = in.nextInt();
            }
            ans[i] = tales_of_a_sort(arr);
        }
        for(int i:ans) System.out.println(i);
    }
    public static int tales_of_a_sort(int[] arr){
        int max = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                if(arr[i-1]>max) max = arr[i-1];
            }
        }
        return max;
    }
}