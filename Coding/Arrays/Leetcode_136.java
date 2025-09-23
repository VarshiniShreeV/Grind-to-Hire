import java.util.Scanner;

public class Leetcode_136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //Array Population
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Leetcode_136 obj = new Leetcode_136();
        System.out.print(obj.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum ^= i;
        }
        return sum;
    }
}
