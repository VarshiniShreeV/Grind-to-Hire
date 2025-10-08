public class LeetCode_3442 {
    public int maxDifference(String s) {
        int[] freq = new int[26]; 
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int max_odd = 0;
        int min_even = Integer.MAX_VALUE;
        for (int i : freq) {
            if (i == 0) continue; 
            if (i % 2 != 0) {
                if (i > max_odd) max_odd = i;
            } else {
                if (i < min_even) min_even = i;
            }
        }

        if (max_odd == 0 || min_even == Integer.MAX_VALUE) return 0;
        return max_odd - min_even;
    }
}