import java.util.Scanner;

public class Leetcode_88 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();//nums1[]
        int n = in.nextInt();//nums2[]
        
        //Array Population - nums1[]
        int[] nums1 = new int[m+n];
        for(int i=0;i<m;i++){
            nums1[i] = in.nextInt();
        }

        //Array Population - nums2[]
        int[] nums2 = new int[n];
        for(int i=0;i<n;i++){
            nums2[i] = in.nextInt();
        }

        Leetcode_88 obj = new Leetcode_88();
        obj.merge(nums1, m, nums2, n);

        for(int i:nums1){
            System.out.print(i+" ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n>0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }

        int i = m-1;
        int j = n-1;
        int k = m+n-1;


        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--]=nums2[j--];
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }


        // int k=0;
        // for(int i=m;i<m+n;i++){
        //     nums1[i] = nums2[k++];
        // }
        // for(int i=0;i<m+n;i++){
        //     for(int j=0;j<m+n-i-1;j++){
        //         if(nums1[j]>nums1[j+1]){
        //             int temp=nums1[j];
        //             nums1[j] = nums1[j+1];
        //             nums1[j+1] = temp;
        //         }
        //     }
        // }
    }
}