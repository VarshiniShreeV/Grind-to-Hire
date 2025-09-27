import java.util.Scanner;

public class Leetcode_2965 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = in.nextInt();
            }
        }

        Leetcode_2965 obj = new Leetcode_2965();
        int[] res = obj.findMissingAndRepeatedValues(grid);
        for(int i:res) System.out.print(i+" ");
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int l = grid.length;
        int[] freq = new int[l*l+1];

        for (int[] grid1 : grid) {
            for (int j = 0; j < grid1.length; j++) {
                freq[grid1[j]]++;
            }
        }

        for(int i=1;i<l*l+1;i++){
            if(freq[i]>1) res[0]=i;
            if(freq[i]==0) res[1]=i;
        }
        return res;
    }
}