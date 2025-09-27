import java.util.Scanner;

public class Leetcode_169 {

    public void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//Number of inputs in the array

        //Array Population
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        Leetcode_169 obj = new Leetcode_169();
        System.out.print(obj.majorityElement(arr));

    }

    //Majority Element
    public int majorityElement(int[] nums) {

        //Boyer Moore Voting Algorithm
        int count = 0;
        int max = 0;

        for(int num: nums){
            if(count==0) max = num;
            count += (max==num) ? 1:-1;
        }
        return max;

        // Map<Integer, Integer> freq = new HashMap<>();
        // for(int num:nums){
        //     freq.put(num, freq.getOrDefault(num,0)+1);
        // }
        // for(int num:nums){
        //     if (freq.get(num)>nums.length/2) return num;
        // }
        // return -1;
    }
}